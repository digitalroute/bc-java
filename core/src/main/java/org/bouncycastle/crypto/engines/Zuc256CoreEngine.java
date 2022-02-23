package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Memoable;

/**
 * Zuc256 implementation.
 * Based on https://www.is.cas.cn/ztzl2016/zouchongzhi/201801/W020180126529970733243.pdf
 */
public class Zuc256CoreEngine
    extends Zuc128CoreEngine
{
    /**
     * Constructor for streamCipher.
     */
    protected Zuc256CoreEngine()
    {
    }

    /**
     * Constructor for Mac.
     *
     * @param pLength the Mac length
     */
    protected Zuc256CoreEngine(final int pLength)
    {
    }

    /**
     * Constructor for Memoable.
     *
     * @param pSource the source engine
     */
    protected Zuc256CoreEngine(final Zuc256CoreEngine pSource)
    {
        super(pSource);
    }

    /**
     * Obtain Max iterations.
     *
     * @return the maximum iterations
     */
    protected int getMaxIterations()
    {
        return 625;
    }

    /**
     * Obtain Algorithm Name.
     *
     * @return the name
     */
    public String getAlgorithmName()
    {
        return "Zuc-256";
    }

    /**
     * Process key and IV into LFSR.
     *
     * @param pLFSR the LFSR
     * @param k     the key
     * @param iv    the iv
     */
    protected void setKeyAndIV(final int[] pLFSR,
                               final byte[] k,
                               final byte[] iv)
    {

    }

    /**
     * Create a copy of the engine.
     *
     * @return the copy
     */
    public Memoable copy()
    {
        return new Zuc256CoreEngine(this);
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
