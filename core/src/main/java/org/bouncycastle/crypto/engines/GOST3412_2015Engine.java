package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/**
 * Implementation of GOST 3412 2015 (aka "Kuznyechik") RFC 7801, GOST 3412
 */
public class GOST3412_2015Engine
    implements BlockCipher
{
    protected static final int BLOCK_SIZE = 8;

    public String getAlgorithmName()
    {
        return "GOST3412_2015";
    }

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {

    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff)
        throws DataLengthException, IllegalStateException
    {
     return BLOCK_SIZE;
    }


    public void reset()
    {

    }
}
