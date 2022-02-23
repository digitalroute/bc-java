package org.bouncycastle.crypto.engines;

import java.util.ArrayList;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/**
 * Implementation of DSTU7624 KEY WRAP mode
 */
public class DSTU7624WrapEngine
    implements Wrapper
{

    private static final int BYTES_IN_INTEGER = 4;

    private boolean forWrapping;
    private DSTU7624Engine engine;

    private byte[] B, intArray;
    private byte[] checkSumArray, zeroArray;
    private ArrayList<byte[]> Btemp;


    public DSTU7624WrapEngine(int blockBitLength)
    {
    }

    public void init(boolean forWrapping, CipherParameters param)
    {

    }

    public String getAlgorithmName()
    {
        return "DSTU7624WrapEngine";
    }

    public byte[] wrap(byte[] in, int inOff, int inLen)
    {
        return null;

    }

    public byte[] unwrap(byte[] in, int inOff, int inLen)
        throws InvalidCipherTextException
    {

        return null;
    }
}
