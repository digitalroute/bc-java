package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/**
 * A Noekeon engine, using direct-key mode.
 */
public class NoekeonEngine
    implements BlockCipher
{
    // Block and key size, as well as the amount of rounds.
    private static final int SIZE = 16;

    /**
     * Create an instance of the Noekeon encryption algorithm and set some defaults
     */
    public NoekeonEngine()
    {
    }

    public String getAlgorithmName()
    {
        return "Noekeon";
    }

    public int getBlockSize()
    {
        return SIZE;
    }

    /**
     * initialise
     *
     * @param forEncryption
     *            whether or not we are for encryption.
     * @param params
     *            the parameters required to set up the cipher.
     * @exception IllegalArgumentException
     *                if the params argument is inappropriate.
     */
    public void init(boolean forEncryption, CipherParameters params)
    {
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff)
    {
        return 0;
    }

    public void reset()
    {
    }
   
}
