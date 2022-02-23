package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/**
 * HC-256 is a software-efficient stream cipher created by Hongjun Wu. It 
 * generates keystream from a 256-bit secret key and a 256-bit initialization 
 * vector.
 * <p>
 * https://www.ecrypt.eu.org/stream/p3ciphers/hc/hc256_p3.pdf
 * </p><p>
 * Its brother, HC-128, is a third phase candidate in the eStream contest.
 * The algorithm is patent-free. No attacks are known as of today (April 2007). 
 * See
 * 
 * https://www.ecrypt.eu.org/stream/hcp3.html
 * </p>
 */
public class HC256Engine
    implements StreamCipher
{
    private int[] p = new int[1024];
    private int[] q = new int[1024];
    private int cnt = 0;


    private byte[] key, iv;
    private boolean initialised;

    private void init()
    {
    }

    public String getAlgorithmName()
    {
        return "HC-256";
    }

    /**
     * Initialise a HC-256 cipher.
     *
     * @param forEncryption whether or not we are for encryption. Irrelevant, as
     *                      encryption and decryption are the same.
     * @param params        the parameters required to set up the cipher.
     * @throws IllegalArgumentException if the params argument is
     *                                  inappropriate (ie. the key is not 256 bit long).
     */
    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {
    }

    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte()
    {
        return 0;
    }

    public int processBytes(byte[] in, int inOff, int len, byte[] out,
                             int outOff) throws DataLengthException
    {
        return 0;
    }

    public void reset()
    {
        init();
    }

    public byte returnByte(byte in)
    {
        return 0;
    }

    private static int rotateRight(
        int     x,
        int     bits)
    {
        return 0;
    }
}
