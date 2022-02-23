package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * Implementation of the SEED algorithm as described in RFC 4009
 */
public class SEEDEngine
    implements BlockCipher
{
    private final int BLOCK_SIZE = 16;

    private int[] wKey;
    private boolean forEncryption;

    public void init(boolean forEncryption, CipherParameters params) throws IllegalArgumentException
    {
    }

    public String getAlgorithmName()
    {
        return "SEED";
    }

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff) throws DataLengthException, IllegalStateException
    {
        return 0;
    }

    public void reset()
    {
    }

    private int[] createWorkingKey(byte[] inKey)
    {
        return new int[0];
    }

    private int extractW1(long lVal)
    {
        return (int)lVal;
    }

    private int extractW0(long lVal)
    {
        return (int)(lVal >> 32);
    }

    private long rotateLeft8(long x)
    {
        return (x << 8) | (x >>> 56);
    }

    private long rotateRight8(long x)
    {
        return (x >>> 8) | (x << 56);
    }

    private long bytesToLong(
        byte[]  src,
        int     srcOff)
    {
        return 0;
    }

    private void longToBytes(
        byte[]  dest,
        int     destOff,
        long    value)
    {
    }

    private int G(int x)
    {
        return 0;
    }

    private long F(int ki0, int ki1, long r)
    {
        return 0;
    }

    private int phaseCalc1(int r0, int ki0, int r1, int ki1)
    {
        return 0;
    }

    private int phaseCalc2(int r0, int ki0, int r1, int ki1)
    {
        return 0;
    }
}
