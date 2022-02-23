package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

/**
 * RFC 5794.
 * 
 * ARIA is a 128-bit block cipher with 128-, 192-, and 256-bit keys.
 */
public class ARIAEngine
    implements BlockCipher
{

    protected static final int BLOCK_SIZE = 16;

    private byte[][] roundKeys;
    //private boolean forEncryption;

    public void init(boolean forEncryption, CipherParameters params) throws IllegalArgumentException
    {
    }

    public String getAlgorithmName()
    {
        return "ARIA";
    }

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff)
        throws DataLengthException, IllegalStateException
    {
        return BLOCK_SIZE;
    }

    public void reset()
    {
        // Empty
    }

    protected static void A(byte[] z)
    {

    }

    protected static void FE(byte[] D, byte[] RK)
    {

    }

    protected static void FO(byte[] D, byte[] RK)
    {
    }

    protected static byte[][] keySchedule(boolean forEncryption, byte[] K)
    {
        return null;
    }

    protected static void keyScheduleRound(byte[] rk, byte[] w, byte[] wr, int n)
    {
    }

    protected static void reverseKeys(byte[][] keys)
    {
    }

}
