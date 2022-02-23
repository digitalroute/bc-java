package org.bouncycastle.crypto.engines;

import java.util.Enumeration;
import java.util.Hashtable;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/**
 * implementation of GOST 28147-89
 */
public class GOST28147Engine
    implements BlockCipher
{
    protected static final int  BLOCK_SIZE = 8;
    private int[]               workingKey = null;
    private boolean forEncryption;

    /**
     * standard constructor.
     */
    public GOST28147Engine()
    {
    }

    /**
     * initialise an GOST28147 cipher.
     *
     * @param forEncryption whether or not we are for encryption.
     * @param params the parameters required to set up the cipher.
     * @exception IllegalArgumentException if the params argument is
     * inappropriate.
     */
    public void init(
        boolean           forEncryption,
        CipherParameters  params)
    {
    }

    public String getAlgorithmName()
    {
        return "GOST28147";
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

    private int[] generateWorkingKey(
        boolean forEncryption,
        byte[]  userKey)
    {
        return new int[0];
    }

    
    /**
     * Return the S-Box associated with SBoxName
     * @param sBoxName name of the S-Box
     * @return byte array representing the S-Box
     */
    public static byte[] getSBox(
        String sBoxName)
    {
        return new byte[0];
    }

    public static String getSBoxName(byte[] sBox)
    {
        return null;
    }
}
