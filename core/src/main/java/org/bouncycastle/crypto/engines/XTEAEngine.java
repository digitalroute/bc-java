package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * An XTEA engine.
 */
public class XTEAEngine
    implements BlockCipher
{
    private static final int rounds     = 32,
                             block_size = 8,
//                             key_size   = 16,
                             delta      = 0x9E3779B9;

    /*
     * the expanded key array of 4 subkeys
     */
    private int[]   _S    = new int[4],
                    _sum0 = new int[32],
                    _sum1 = new int[32];
    private boolean _initialised,
                    _forEncryption;

    /**
     * Create an instance of the TEA encryption algorithm
     * and set some defaults
     */
    public XTEAEngine()
    {
        _initialised = false;
    }

    public String getAlgorithmName()
    {
        return "XTEA";
    }

    public int getBlockSize()
    {
        return block_size;
    }

    /**
     * initialise
     *
     * @param forEncryption whether or not we are for encryption.
     * @param params the parameters required to set up the cipher.
     * @exception IllegalArgumentException if the params argument is
     * inappropriate.
     */
    public void init(
        boolean             forEncryption,
        CipherParameters    params)
    {
    }

    public int processBlock(
        byte[]  in,
        int     inOff,
        byte[]  out,
        int     outOff)
    {
        return 0;
    }

    public void reset()
    {
    }

    /**
     * Re-key the cipher.
     * <p>
     * @param  key  the key to be used
     */
    private void setKey(
        byte[]      key)
    {
    }

    private int encryptBlock(
        byte[]  in,
        int     inOff,
        byte[]  out,
        int     outOff)
    {
        return 0;
    }

    private int decryptBlock(
        byte[]  in,
        int     inOff,
        byte[]  out,
        int     outOff)
    {
        return 0;
    }

    private int bytesToInt(byte[] in, int inOff)
    {
        return 0;
    }

    private void unpackInt(int v, byte[] out, int outOff)
    {
    }
}
