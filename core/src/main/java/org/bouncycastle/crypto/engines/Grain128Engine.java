package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/**
 * Implementation of Martin Hell's, Thomas Johansson's and Willi Meier's stream
 * cipher, Grain-128.
 */
public class Grain128Engine
    implements StreamCipher
{

    /**
     * Constants
     */
    private static final int STATE_SIZE = 4;

    /**
     * Variables to hold the state of the engine during encryption and
     * decryption
     */
    private byte[] workingKey;
    private byte[] workingIV;
    private byte[] out;
    private int[] lfsr;
    private int[] nfsr;
    private int output;
    private int index = 4;

    private boolean initialised = false;

    public String getAlgorithmName()
    {
        return "Grain-128";
    }

    /**
     * Initialize a Grain-128 cipher.
     *
     * @param forEncryption Whether or not we are for encryption.
     * @param params        The parameters required to set up the cipher.
     * @throws IllegalArgumentException If the params argument is inappropriate.
     */
    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {

    }


    public int processBytes(byte[] in, int inOff, int len, byte[] out,
                             int outOff)
        throws DataLengthException
    {
        return 0;
    }

    public void reset()
    {

    }

    /**
     * Run Grain one round(i.e. 32 bits).
     */
    private void oneRound()
    {

    }

    public byte returnByte(byte in)
    {
       return 0;
    }

    private byte getKeyStream()
    {
       return 0;
    }
}
