package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.util.Vector;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/**
 * NaccacheStern Engine. For details on this cipher, please see
 * https://www.gemplus.com/smart/rd/publications/pdf/NS98pkcs.pdf
 */
public class NaccacheSternEngine
    implements AsymmetricBlockCipher
{
    private boolean forEncryption;

    private NaccacheSternKeyParameters key;

    private Vector[] lookup = null;

    private boolean debug = false;

    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);

    /**
     * Initializes this algorithm. Must be called before all other Functions.
     * 
     * @see org.bouncycastle.crypto.AsymmetricBlockCipher#init(boolean,
     *      org.bouncycastle.crypto.CipherParameters)
     */
    public void init(boolean forEncryption, CipherParameters param)
    {
    }

    public void setDebug(boolean debug)
    {
        this.debug = debug;
    }

    /**
     * Returns the input block size of this algorithm.
     * 
     * @see org.bouncycastle.crypto.AsymmetricBlockCipher#getInputBlockSize()
     */
    public int getInputBlockSize()
    {
       return 0;
    }

    /**
     * Returns the output block size of this algorithm.
     * 
     * @see org.bouncycastle.crypto.AsymmetricBlockCipher#getOutputBlockSize()
     */
    public int getOutputBlockSize()
    {
       return 0;
    }

    /**
     * Process a single Block using the Naccache-Stern algorithm.
     * 
     * @see org.bouncycastle.crypto.AsymmetricBlockCipher#processBlock(byte[],
     *      int, int)
     */
    public byte[] processBlock(byte[] in, int inOff, int len) throws InvalidCipherTextException
    {
        return null;
    }

    /**
     * Encrypts a BigInteger aka Plaintext with the public key.
     * 
     * @param plain
     *            The BigInteger to encrypt
     * @return The byte[] representation of the encrypted BigInteger (i.e.
     *         crypted.toByteArray())
     */
    public byte[] encrypt(BigInteger plain)
    {
        return null;
    }

    /**
     * Adds the contents of two encrypted blocks mod sigma
     * 
     * @param block1
     *            the first encrypted block
     * @param block2
     *            the second encrypted block
     * @return encrypt((block1 + block2) mod sigma)
     * @throws InvalidCipherTextException
     */
    public byte[] addCryptedBlocks(byte[] block1, byte[] block2)
            throws InvalidCipherTextException
    {
       return null;
    }

    /**
     * Convenience Method for data exchange with the cipher.
     * 
     * Determines blocksize and splits data to blocksize.
     *
     * @param data the data to be processed
     * @return the data after it went through the NaccacheSternEngine.
     * @throws InvalidCipherTextException 
     */
    public byte[] processData(byte[] data) throws InvalidCipherTextException
    {
       return null;
    }

}
