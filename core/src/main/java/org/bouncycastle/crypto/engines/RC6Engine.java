package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * An RC6 engine.
 */
public class RC6Engine
    implements BlockCipher
{
    private static final int wordSize = 32;
    private static final int bytesPerWord = wordSize / 8;

    /*
     * the number of rounds to perform
     */
    private static final int _noRounds = 20;

    /*
     * the expanded key array of size 2*(rounds + 1)
     */
    private int _S[];

    /*
     * our "magic constants" for wordSize 32
     *
     * Pw = Odd((e-2) * 2^wordsize)
     * Qw = Odd((o-2) * 2^wordsize)
     *
     * where e is the base of natural logarithms (2.718281828...)
     * and o is the golden ratio (1.61803398...)
     */
    private static final int    P32 = 0xb7e15163;
    private static final int    Q32 = 0x9e3779b9;

    private static final int    LGW = 5;        // log2(32)

    private boolean forEncryption;

    /**
     * Create an instance of the RC6 encryption algorithm
     * and set some defaults
     */
    public RC6Engine()
    {
        _S            = null;
    }

    public String getAlgorithmName()
    {
        return "RC6";
    }

    public int getBlockSize()
    {
        return 4 * bytesPerWord;
    }

    /**
     * initialise a RC5-32 cipher.
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

    
    //////////////////////////////////////////////////////////////
    //
    // PRIVATE Helper Methods
    //
    //////////////////////////////////////////////////////////////

    /**
     * Perform a left "spin" of the word. The rotation of the given
     * word <em>x</em> is rotated left by <em>y</em> bits.
     * Only the <em>lg(wordSize)</em> low-order bits of <em>y</em>
     * are used to determine the rotation amount. Here it is 
     * assumed that the wordsize used is 32.
     * <p>
     * @param  x  word to rotate
     * @param  y    number of bits to rotate % wordSize
     */
    private int rotateLeft(int x, int y)
    {
        return (x << y) | (x >>> -y);
    }

    /**
     * Perform a right "spin" of the word. The rotation of the given
     * word <em>x</em> is rotated left by <em>y</em> bits.
     * Only the <em>lg(wordSize)</em> low-order bits of <em>y</em>
     * are used to determine the rotation amount. Here it is 
     * assumed that the wordsize used is a power of 2.
     * <p>
     * @param  x  word to rotate
     * @param  y    number of bits to rotate % wordSize
     */
    private int rotateRight(int x, int y)
    {
        return (x >>> y) | (x << -y);
    }

    private int bytesToWord(
        byte[]  src,
        int     srcOff)
    {
        return 0;
    }

    private void wordToBytes(
        int    word,
        byte[]  dst,
        int     dstOff)
    {
    }
}
