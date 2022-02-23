package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public abstract class SerpentEngineBase
    implements BlockCipher
{
    protected static final int BLOCK_SIZE = 16;

    static final int ROUNDS = 32;
    static final int PHI = 0x9E3779B9;       // (sqrt(5) - 1) * 2**31

    protected boolean encrypting;
    protected int[] wKey;

    protected int X0, X1, X2, X3;    // registers

    SerpentEngineBase()
    {

    }

    /**
     * initialise a Serpent cipher.
     *
     * @param encrypting whether or not we are for encryption.
     * @param params     the parameters required to set up the cipher.
     * @throws IllegalArgumentException if the params argument is
     * inappropriate.
     */
    public void init(
        boolean encrypting,
        CipherParameters params)
    {
        if (params instanceof KeyParameter)
        {
            this.encrypting = encrypting;
            this.wKey = makeWorkingKey(((KeyParameter)params).getKey());
            return;
        }

        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + params.getClass().getName());
    }

    public String getAlgorithmName()
    {
        return "Serpent";
    }

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

    /**
     * Process one block of input from the array in and write it to
     * the out array.
     *
     * @param in     the array containing the input data.
     * @param inOff  offset into the in array the data starts at.
     * @param out    the array the output data will be copied into.
     * @param outOff the offset into the out array the output will start at.
     * @return the number of bytes processed and produced.
     * @throws DataLengthException if there isn't enough data in in, or
     * space in out.
     * @throws IllegalStateException if the cipher isn't initialised.
     */
    public final int processBlock(
        byte[] in,
        int inOff,
        byte[] out,
        int outOff)
    {
        if (wKey == null)
        {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }

        if ((inOff + BLOCK_SIZE) > in.length)
        {
            throw new DataLengthException("input buffer too short");
        }

        if ((outOff + BLOCK_SIZE) > out.length)
        {
            throw new OutputLengthException("output buffer too short");
        }

        if (encrypting)
        {
            encryptBlock(in, inOff, out, outOff);
        }
        else
        {
            decryptBlock(in, inOff, out, outOff);
        }

        return BLOCK_SIZE;
    }

    public void reset()
    {
    }

    protected static int rotateLeft(
        int     x,
        int     bits)
    {
        return (x << bits) | (x >>> -bits);
    }

    protected static int rotateRight(
        int     x,
        int     bits)
    {
        return (x >>> bits) | (x << -bits);
    }

    protected abstract int[] makeWorkingKey(byte[] key);

    protected abstract void encryptBlock(byte[] input, int inOff, byte[] output, int outOff);

    protected abstract void decryptBlock(byte[] input, int inOff, byte[] output, int outOff);
}
