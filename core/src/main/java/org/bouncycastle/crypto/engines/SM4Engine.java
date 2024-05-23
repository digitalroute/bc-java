package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/**
 * SM4 Block Cipher - SM4 is a 128 bit block cipher with a 128 bit key.
 * <p>
 *     The implementation here is based on the document <a href="https://eprint.iacr.org/2008/329.pdf">https://eprint.iacr.org/2008/329.pdf</a>
 *     by Whitfield Diffie and George Ledin, which is a translation of Prof. LU Shu-wang's original standard.
 * </p>
 */
public class SM4Engine
    implements BlockCipher
{
    private static final int BLOCK_SIZE = 16;


    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {

    }

    public String getAlgorithmName()
    {
        return "SM4";
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
    }
}
