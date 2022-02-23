package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;


/*
* Reference implementation of DSTU7624 national Ukrainian standard of block encryption.
* Thanks to Roman Oliynikov' native C implementation:
* https://github.com/Roman-Oliynikov/Kalyna-reference
*
* DSTU7564 is very similar to AES but with some security improvements in key schedule algorithm
* and supports different block and key lengths (128/256/512 bits).
*/
public class DSTU7624Engine
    implements BlockCipher
{
    private long[] internalState;
    private long[] workingKey;
    private long[][] roundKeys;

    /* Number of 64-bit words in block */
    private int wordsInBlock;

    /* Number of 64-bit words in key */
    private int wordsInKey;

    /* Number of encryption rounds depending on key length */
    private static final int ROUNDS_128 = 10;
    private static final int ROUNDS_256 = 14;
    private static final int ROUNDS_512 = 18;

    private int roundsAmount;

    private boolean forEncryption;

    public DSTU7624Engine(int blockBitLength)
        throws IllegalArgumentException
    {
    }

    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {
    }

    public String getAlgorithmName()
    {
        return "DSTU7624";
    }

    public int getBlockSize()
    {
        return wordsInBlock << 3;
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff)
        throws DataLengthException, IllegalStateException
    {
        return 0;
    }

    public void reset()
    {
        Arrays.fill(internalState, 0);
    }


}
