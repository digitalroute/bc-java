package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * an implementation of Rijndael, based on the documentation and reference implementation
 * by Paulo Barreto, Vincent Rijmen, for v2.0 August '99.
 * <p>
 * Note: this implementation is based on information prior to final NIST publication.
 */
public class RijndaelEngine
    implements BlockCipher
{
    private static final int MAXROUNDS = 14;

    private static final int MAXKC = (256/4);


    /**
     * default constructor - 128 bit block size.
     */
    public RijndaelEngine()
    {
        this(128);
    }

    /**
     * basic constructor - set the cipher up for a given blocksize
     *
     * @param blockBits the blocksize in bits, must be 128, 192, or 256.
     */
    public RijndaelEngine(
        int blockBits)
    {

    }

    /**
     * initialise a Rijndael cipher.
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
        return "Rijndael";
    }

    public int getBlockSize()
    {
        return 0;
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

    private void unpackBlock(
        byte[]      bytes,
        int         off)
    {

    }

    private void packBlock(
        byte[]      bytes,
        int         off)
    {

    }

    private void encryptBlock(
        long[][] rk)
    {

    }

    private void decryptBlock(
        long[][] rk)
    {

    }
}
