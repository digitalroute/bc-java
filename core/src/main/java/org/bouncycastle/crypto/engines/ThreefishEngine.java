package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;

/**
 * Implementation of the Threefish tweakable large block cipher in 256, 512 and 1024 bit block
 * sizes.
 * <p>
 * This is the 1.3 version of Threefish defined in the Skein hash function submission to the NIST
 * SHA-3 competition in October 2010.
 * <p>
 * Threefish was designed by Niels Ferguson - Stefan Lucks - Bruce Schneier - Doug Whiting - Mihir
 * Bellare - Tadayoshi Kohno - Jon Callas - Jesse Walker.
 * <p>
 * This implementation inlines all round functions, unrolls 8 rounds, and uses 1.2k of static tables
 * to speed up key schedule injection. <br>
 * 2 x block size state is retained by each cipher instance.
 */
public class ThreefishEngine
    implements BlockCipher
{
    /**
     * 256 bit block size - Threefish-256
     */
    public static final int BLOCKSIZE_256 = 256;
    /**
     * 512 bit block size - Threefish-512
     */
    public static final int BLOCKSIZE_512 = 512;
    /**
     * 1024 bit block size - Threefish-1024
     */
    public static final int BLOCKSIZE_1024 = 1024;

    /**
     * Size of the tweak in bytes (always 128 bit/16 bytes)
     */
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = TWEAK_SIZE_BYTES / 8;

    /**
     * Rounds in Threefish-256
     */
    private static final int ROUNDS_256 = 72;
    /**
     * Rounds in Threefish-512
     */
    private static final int ROUNDS_512 = 72;
    /**
     * Rounds in Threefish-1024
     */
    private static final int ROUNDS_1024 = 80;

    /**
     * Max rounds of any of the variants
     */
    private static final int MAX_ROUNDS = ROUNDS_1024;

    /**
     * Key schedule parity constant
     */
    private static final long C_240 = 0x1BD11BDAA9FC1A22L;

    /* Pre-calculated modulo arithmetic tables for key schedule lookups */
    private static int[] MOD9 = new int[MAX_ROUNDS];
    private static int[] MOD17 = new int[MOD9.length];
    private static int[] MOD5 = new int[MOD9.length];
    private static int[] MOD3 = new int[MOD9.length];


    /**
     * Block size in bytes
     */
    private int blocksizeBytes;

    /**
     * Block size in 64 bit words
     */
    private int blocksizeWords;

    /**
     * Buffer for byte oriented processBytes to call internal word API
     */
    private long[] currentBlock;

    /**
     * Tweak bytes (2 byte t1,t2, calculated t3 and repeat of t1,t2 for modulo free lookup
     */
    private long[] t = new long[5];

    /**
     * Key schedule words
     */
    private long[] kw;

    /**
     * The internal cipher implementation (varies by blocksize)
     */
    private ThreefishCipher cipher;

    private boolean forEncryption;

    /**
     * Constructs a new Threefish cipher, with a specified block size.
     *
     * @param blocksizeBits the block size in bits, one of {@link #BLOCKSIZE_256}, {@link #BLOCKSIZE_512},
     *                      {@link #BLOCKSIZE_1024}.
     */
    public ThreefishEngine(final int blocksizeBits)
    {
    }

    /**
     * Initialise the engine.
     *
     * @param params an instance of {@link TweakableBlockCipherParameters}, or {@link KeyParameter} (to
     *               use a 0 tweak)
     */
    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {

    }

    /**
     * Initialise the engine, specifying the key and tweak directly.
     *
     * @param forEncryption the cipher mode.
     * @param key           the words of the key, or <code>null</code> to use the current key.
     * @param tweak         the 2 word (128 bit) tweak, or <code>null</code> to use the current tweak.
     */
    public void init(boolean forEncryption, final long[] key, final long[] tweak)
    {

    }

    private void setKey(long[] key)
    {

    }

    private void setTweak(long[] tweak)
    {

    }

    public String getAlgorithmName()
    {
        return "Threefish-" + (blocksizeBytes * 8);
    }

    public int getBlockSize()
    {
        return blocksizeBytes;
    }

    public void reset()
    {
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff)
        throws DataLengthException,
        IllegalStateException
    {
        return 0;
    }

    /**
     * Process a block of data represented as 64 bit words.
     *
     * @param in  a block sized buffer of words to process.
     * @param out a block sized buffer of words to receive the output of the operation.
     * @return the number of 8 byte words processed (which will be the same as the block size).
     * @throws DataLengthException if either the input or output is not block sized.
     * @throws IllegalStateException if this engine is not initialised.
     */
    public int processBlock(long[] in, long[] out)
        throws DataLengthException, IllegalStateException
    {
       return 0;
    }

    /**
     * Read a single 64 bit word from input in LSB first order.
     * 
     * @deprecated Will be removed
     */
    public static long bytesToWord(final byte[] bytes, final int off)
    {
        return 0;
    }

    /**
     * Write a 64 bit word to output in LSB first order.
     * 
     * @deprecated Will be removed
     */
    public static void wordToBytes(final long word, final byte[] bytes, final int off)
    {
    }

    /**
     * Rotate left + xor part of the mix operation.
     */
    // Package protected for efficient access from inner class
    static long rotlXor(long x, int n, long xor)
    {
        return 0;
    }

    /**
     * Rotate xor + rotate right part of the unmix operation.
     */
    // Package protected for efficient access from inner class
    static long xorRotr(long x, int n, long xor)
    {
        return 0;
    }

    private static abstract class ThreefishCipher
    {
        /**
         * The extended + repeated tweak words
         */
        protected final long[] t;
        /**
         * The extended + repeated key words
         */
        protected final long[] kw;

        protected ThreefishCipher(final long[] kw, final long[] t)
        {
            this.kw = kw;
            this.t = t;
        }

        abstract void encryptBlock(long[] block, long[] out);

        abstract void decryptBlock(long[] block, long[] out);

    }

    private static final class Threefish256Cipher
        extends ThreefishCipher
    {
        /**
         * Mix rotation constants defined in Skein 1.3 specification
         */
        private static final int ROTATION_0_0 = 14, ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52, ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23, ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5, ROTATION_3_1 = 37;

        private static final int ROTATION_4_0 = 25, ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46, ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58, ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32, ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] kw, long[] t)
        {
            super(kw, t);
        }

        void encryptBlock(long[] block, long[] out)
        {

        }

        void decryptBlock(long[] block, long[] state)
        {

        }

    }

    private static final class Threefish512Cipher
        extends ThreefishCipher
    {
        /**
         * Mix rotation constants defined in Skein 1.3 specification
         */
        private static final int ROTATION_0_0 = 46, ROTATION_0_1 = 36, ROTATION_0_2 = 19, ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33, ROTATION_1_1 = 27, ROTATION_1_2 = 14, ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17, ROTATION_2_1 = 49, ROTATION_2_2 = 36, ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44, ROTATION_3_1 = 9, ROTATION_3_2 = 54, ROTATION_3_3 = 56;

        private static final int ROTATION_4_0 = 39, ROTATION_4_1 = 30, ROTATION_4_2 = 34, ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13, ROTATION_5_1 = 50, ROTATION_5_2 = 10, ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25, ROTATION_6_1 = 29, ROTATION_6_2 = 39, ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8, ROTATION_7_1 = 35, ROTATION_7_2 = 56, ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] kw, long[] t)
        {
            super(kw, t);
        }

        public void encryptBlock(long[] block, long[] out)
        {

        }

        public void decryptBlock(long[] block, long[] state)
        {

        }
    }

    private static final class Threefish1024Cipher
        extends ThreefishCipher
    {
        /**
         * Mix rotation constants defined in Skein 1.3 specification
         */
        private static final int ROTATION_0_0 = 24, ROTATION_0_1 = 13, ROTATION_0_2 = 8, ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8, ROTATION_0_5 = 17, ROTATION_0_6 = 22, ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38, ROTATION_1_1 = 19, ROTATION_1_2 = 10, ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49, ROTATION_1_5 = 18, ROTATION_1_6 = 23, ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33, ROTATION_2_1 = 4, ROTATION_2_2 = 51, ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34, ROTATION_2_5 = 41, ROTATION_2_6 = 59, ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5, ROTATION_3_1 = 20, ROTATION_3_2 = 48, ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47, ROTATION_3_5 = 28, ROTATION_3_6 = 16, ROTATION_3_7 = 25;

        private static final int ROTATION_4_0 = 41, ROTATION_4_1 = 9, ROTATION_4_2 = 37, ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12, ROTATION_4_5 = 47, ROTATION_4_6 = 44, ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16, ROTATION_5_1 = 34, ROTATION_5_2 = 56, ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4, ROTATION_5_5 = 53, ROTATION_5_6 = 42, ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31, ROTATION_6_1 = 44, ROTATION_6_2 = 47, ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19, ROTATION_6_5 = 42, ROTATION_6_6 = 44, ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9, ROTATION_7_1 = 48, ROTATION_7_2 = 35, ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23, ROTATION_7_5 = 31, ROTATION_7_6 = 37, ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] kw, long[] t)
        {
            super(kw, t);
        }

        void encryptBlock(long[] block, long[] out)
        {

        }

        void decryptBlock(long[] block, long[] state)
        {

        }

    }

}
