package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * a class that provides a basic SKIPJACK engine.
 */
public class SkipjackEngine
    implements BlockCipher
{
    static final int BLOCK_SIZE = 8;

    private int[]       key0, key1, key2, key3;
    private boolean     encrypting;

    /**
     * initialise a SKIPJACK cipher.
     *
     * @param encrypting whether or not we are for encryption.
     * @param params the parameters required to set up the cipher.
     * @exception IllegalArgumentException if the params argument is
     * inappropriate.
     */
    public void init(
        boolean           encrypting,
        CipherParameters  params)
    {
    }

    public String getAlgorithmName()
    {
        return "SKIPJACK";
    }

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

    public int processBlock(
        byte[] in,
        int inOff,
        byte[] out,
        int outOff)
    {
        return 0;
    }

    public void reset()
    {
    }

    public int encryptBlock(
        byte[]      in,
        int         inOff,
        byte[]      out,
        int         outOff)
    {
        return 0;
    }

    public int decryptBlock(
        byte[]      in,
        int         inOff,
        byte[]      out,
        int         outOff)
    {
        return 0;
    }
}
