package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * A class that provides a basic International Data Encryption Algorithm (IDEA) engine.
 * <p>
 * This implementation is based on the "HOWTO: INTERNATIONAL DATA ENCRYPTION ALGORITHM"
 * implementation summary by Fauzan Mirza (F.U.Mirza@sheffield.ac.uk). (barring 1 typo at the
 * end of the mulinv function!).
 * <p>
 * It can be found at ftp://ftp.funet.fi/pub/crypt/cryptography/symmetric/idea/
 * <p>
 * Note: This algorithm was patented in the USA, Japan and Europe. These patents expired in 2011/2012. 
 */
public class IDEAEngine
    implements BlockCipher
{
    protected static final int  BLOCK_SIZE = 8;

    private int[]               workingKey = null;

    private boolean forEncryption;

    /**
     * standard constructor.
     */
    public IDEAEngine()
    {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128));
    }

    /**
     * initialise an IDEA cipher.
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
        return "IDEA";
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

    private static final int    MASK = 0xffff;
    private static final int    BASE = 0x10001;

    private int bytesToWord(
        byte[]  in,
        int     inOff)
    {
        return ((in[inOff] << 8) & 0xff00) + (in[inOff + 1] & 0xff);
    }

    private void wordToBytes(
        int     word,
        byte[]  out,
        int     outOff)
    {
        out[outOff] = (byte)(word >>> 8);
        out[outOff + 1] = (byte)word;
    }


    /**
     * Return the additive inverse of x.
     * <p>
     * i.e. x + addInv(x) == 0
     */
    int addInv(
        int x)
    {
        return (0 - x) & MASK;
    }
    
    /**
     * The function to invert the encryption subkey to the decryption subkey.
     * It also involves the multiplicative inverse and the additive inverse functions.
     */
    private int[] invertKey(
        int[] inKey)
    {
        return new int[0];
    }
    
    private int[] generateWorkingKey(
        boolean forEncryption,
        byte[]  userKey)
    {
        return new int[0];
    }
}
