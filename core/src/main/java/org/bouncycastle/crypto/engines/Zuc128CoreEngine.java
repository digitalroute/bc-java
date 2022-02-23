package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Memoable;

/**
 * Zuc128Engine implementation.
 * Based on https://www.gsma.com/aboutus/wp-content/uploads/2014/12/eea3eia3zucv16.pdf
 */
public class Zuc128CoreEngine
    implements StreamCipher, Memoable
{

    /**
     * Constructor.
     */
    protected Zuc128CoreEngine()
    {
    }

    /**
     * Constructor.
     *
     * @param pSource the source engine
     */
    protected Zuc128CoreEngine(final Zuc128CoreEngine pSource)
    {
        reset(pSource);
    }

    /**
     * initialise a Snow3G cipher.
     *
     * @param forEncryption whether or not we are for encryption.
     * @param params        the parameters required to set up the cipher.
     * @throws IllegalArgumentException if the params argument is inappropriate.
     */
    public void init(final boolean forEncryption,
                     final CipherParameters params)
    {
    }

    /**
     * Obtain Max iterations.
     *
     * @return the maximum iterations
     */
    protected int getMaxIterations()
    {
        return 2047;
    }

    /**
     * Obtain Algorithm Name.
     *
     * @return the name
     */
    public String getAlgorithmName()
    {
        return "Zuc-128";
    }

    /**
     * Process bytes.
     *
     * @param in     the input buffer
     * @param inOff  the starting offset in the input buffer
     * @param len    the length of data in the input buffer
     * @param out    the output buffer
     * @param outOff the starting offset in the output buffer
     * @return the number of bytes returned in the output buffer
     */
    public int processBytes(final byte[] in,
                            final int inOff,
                            final int len,
                            final byte[] out,
                            final int outOff)
    {

        return 0;
    }

    /**
     * Reset the engine.
     */
    public void reset()
    {
    }

    /**
     * Process single byte.
     *
     * @param in the input byte
     * @return the output byte
     */
    public byte returnByte(final byte in)
    {
        return 0;
    }

    /**
     * Encode a 32-bit value into a buffer (little-endian).
     *
     * @param val the value to encode
     * @param buf the output buffer
     * @param off the output offset
     */
    public static void encode32be(int val, byte[] buf, int off)
    {
    }

    /* ����������������������- */


    /**
     * Create the next keyStream word.
     *
     * @return the next word
     */
    protected int makeKeyStreamWord()
    {
        return 0;
    }

    /**
     * Create a copy of the engine.
     *
     * @return the copy
     */
    public Memoable copy()
    {
        return new Zuc128CoreEngine(this);
    }

    /**
     * Reset from saved engine state.
     *
     * @param pState the state to restore
     */
    public void reset(final Memoable pState)
    {
    }
}
