package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * a class that provides a basic DESede (or Triple DES) engine.
 */
public class DESedeEngine
    extends DESBase
    implements BlockCipher
{
    protected static final int BLOCK_SIZE = 8;

    private int[] workingKey1 = null;
    private int[] workingKey2 = null;
    private int[] workingKey3 = null;

    private boolean forEncryption;

    /**
     * standard constructor.
     */
    public DESedeEngine()
    {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    /**
     * initialise a DESede cipher.
     *
     * @param encrypting whether or not we are for encryption.
     * @param params     the parameters required to set up the cipher.
     * @throws IllegalArgumentException if the params argument is
     *                                  inappropriate.
     */
    public void init(
        boolean encrypting,
        CipherParameters params)
    {
    }

    public String getAlgorithmName()
    {
        return "DESede";
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

    // Service Definitions
    private int bitsOfSecurity()
    {
        if (workingKey1 != null && workingKey1 == workingKey3)
        {
            return 80;
        }
        return 112;
    }
}
