package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * Camellia - based on RFC 3713, smaller implementation, about half the size of CamelliaEngine.
 */

public class CamelliaLightEngine
    implements BlockCipher
{
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 0xff;
    private boolean initialized = false;
    private int _keySize;
    private boolean forEncryption;

    private int[] subkey = new int[24 * 4];
    private int[] kw = new int[4 * 2]; // for whitening
    private int[] ke = new int[6 * 2]; // for FL and FL^(-1)



    private void setKey(boolean forEncryption, byte[] key)
    {

    }

    private int processBlock128(byte[] in, int inOff,
                                byte[] out, int outOff)
    {
        return 0;
    }

    private int processBlock192or256(byte[] in, int inOff,
                                     byte[] out, int outOff)
    {
        return 0;
    }

    public CamelliaLightEngine()
    {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    public String getAlgorithmName()
    {
        return "Camellia";
    }

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

    public void init(boolean forEncryption, CipherParameters params)
    {
    }

    public int processBlock(byte[] in, int inOff,
                            byte[] out, int outOff)
        throws IllegalStateException
    {

        return 0;
    }

    public void reset()
    {
    }

    private int bitsOfSecurity()
    {
        return _keySize * 8;
    }
}
