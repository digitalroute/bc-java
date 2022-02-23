package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/**
 * HC-128 is a software-efficient stream cipher created by Hongjun Wu. It
 * generates keystream from a 128-bit secret key and a 128-bit initialization
 * vector.
 * <p>
 * https://www.ecrypt.eu.org/stream/p3ciphers/hc/hc128_p3.pdf
 * </p><p>
 * It is a third phase candidate in the eStream contest, and is patent-free.
 * No attacks are known as of today (April 2007). See
 *
 * https://www.ecrypt.eu.org/stream/hcp3.html
 * </p>
 */
public class HC128Engine
    implements StreamCipher
{
    private int[] p = new int[512];
    private int[] q = new int[512];
    private int cnt = 0;

    private byte[] key, iv;
    private boolean initialised;

    private void init()
    {
    }

    public String getAlgorithmName()
    {
        return "HC-128";
    }

    /**
     * Initialise a HC-128 cipher.
     *
     * @param forEncryption whether or not we are for encryption. Irrelevant, as
     *                      encryption and decryption are the same.
     * @param params        the parameters required to set up the cipher.
     * @throws IllegalArgumentException if the params argument is
     *                                  inappropriate (ie. the key is not 128 bit long).
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
    }

    public byte returnByte(byte in)
    {
        return 0;
    }
}
