package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/**
 * Implementation of Daniel J. Bernstein's Salsa20 stream cipher, Snuffle 2005
 */
public class Salsa20Engine
    implements SkippingStreamCipher
{
    public final static int DEFAULT_ROUNDS = 20;

    /** Constants */
    private final static int STATE_SIZE = 16; // 16, 32 bit ints = 64 bytes

    private final static int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte k" + "expand 32-byte k"), 0, 8);

    protected void packTauOrSigma(int keyLength, int[] state, int stateOffset)
    {
        int tsOff = (keyLength - 16) / 4;
        state[stateOffset    ] = TAU_SIGMA[tsOff    ];
        state[stateOffset + 1] = TAU_SIGMA[tsOff + 1];
        state[stateOffset + 2] = TAU_SIGMA[tsOff + 2];
        state[stateOffset + 3] = TAU_SIGMA[tsOff + 3];
    }

    /** @deprecated */
    protected final static byte[]
        sigma = Strings.toByteArray("expand 32-byte k"),
        tau   = Strings.toByteArray("expand 16-byte k");

    protected int rounds;

    /*
     * variables to hold the state of the engine
     * during encryption and decryption
     */
    private int         index = 0;
    protected int[]     engineState = new int[STATE_SIZE]; // state
    protected int[]     x = new int[STATE_SIZE] ; // internal buffer
    private byte[]      keyStream   = new byte[STATE_SIZE * 4]; // expanded state, 64 bytes
    private boolean     initialised = false;

    /*
     * internal counter
     */
    private int cW0, cW1, cW2;

    /**
     * Creates a 20 round Salsa20 engine.
     */
    public Salsa20Engine()
    {
        this(DEFAULT_ROUNDS);
    }

    /**
     * Creates a Salsa20 engine with a specific number of rounds.
     * @param rounds the number of rounds (must be an even number).
     */
    public Salsa20Engine(int rounds)
    {

    }

    /**
     * initialise a Salsa20 cipher.
     *
     * @param forEncryption whether or not we are for encryption.
     * @param params the parameters required to set up the cipher.
     * @exception IllegalArgumentException if the params argument is
     * inappropriate.
     */
    public void init(
        boolean             forEncryption, 
        CipherParameters     params)
    {

    }

    protected int getNonceSize()
    {
        return 8;
    }

    public String getAlgorithmName()
    {
        String name = "Salsa20";
        if (rounds != DEFAULT_ROUNDS)
        {
            name += "/" + rounds;
        }
        return name;
    }

    public byte returnByte(byte in)
    {
      return 0;
    }

    protected void advanceCounter(long diff)
    {
    }

    protected void advanceCounter()
    {
        if (++engineState[8] == 0)
        {
            ++engineState[9];
        }
    }

    protected void retreatCounter(long diff)
    {
        int hi = (int)(diff >>> 32);
        int lo = (int)diff;

        if (hi != 0)
        {
            if ((engineState[9] & 0xffffffffL) >= (hi & 0xffffffffL))
            {
                engineState[9] -= hi;
            }
            else
            {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }

        if ((engineState[8] & 0xffffffffL) >= (lo & 0xffffffffL))
        {
            engineState[8] -= lo;
        }
        else
        {
            if (engineState[9] != 0)
            {
                --engineState[9];
                engineState[8] -= lo;
            }
            else
            {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }
    }

    protected void retreatCounter()
    {
        if (engineState[8] == 0 && engineState[9] == 0)
        {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }

        if (--engineState[8] == -1)
        {
            --engineState[9];
        }
    }

    public int processBytes(
        byte[]     in, 
        int     inOff, 
        int     len, 
        byte[]     out, 
        int     outOff)
    {
       return 0;
    }

    public long skip(long numberOfBytes)
    {
        if (numberOfBytes >= 0)
        {
            long remaining = numberOfBytes;

            if (remaining >= 64)
            {
                long count = remaining / 64;

                advanceCounter(count);

                remaining -= count * 64;
            }

            int oldIndex = index;

            index = (index + (int)remaining) & 63;

            if (index < oldIndex)
            {
                advanceCounter();
            }
        }
        else
        {
            long remaining = -numberOfBytes;

            if (remaining >= 64)
            {
                long count = remaining / 64;

                retreatCounter(count);

                remaining -= count * 64;
            }

            for (long i = 0; i < remaining; i++)
            {
                if (index == 0)
                {
                    retreatCounter();
                }

                index = (index - 1) & 63;
            }
        }

        generateKeyStream(keyStream);

        return numberOfBytes;
    }

    public long seekTo(long position)
    {
        reset();

        return skip(position);
    }

    public long getPosition()
    {
        return getCounter() * 64 + index;
    }

    public void reset()
    {

    }

    protected long getCounter()
    {
        return ((long)engineState[9] << 32) | (engineState[8] & 0xffffffffL);
    }

    protected void resetCounter()
    {
        engineState[8] = engineState[9] = 0;
    }

    protected void setKey(byte[] keyBytes, byte[] ivBytes)
    {

    }

    protected void generateKeyStream(byte[] output)
    {
        salsaCore(rounds, engineState, x);
        Pack.intToLittleEndian(x, output, 0);
    }

    /**
     * Salsa20 function
     *
     * @param   input   input data
     */    
    public static void salsaCore(int rounds, int[] input, int[] x)
    {

    }

    private void resetLimitCounter()
    {

    }

    private boolean limitExceeded()
    {
        return false;
    }

    /*
     * this relies on the fact len will always be positive.
     */
    private boolean limitExceeded(int len)
    {
        return false;
    }
}
