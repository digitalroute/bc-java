package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/**
 * Implementation of Daniel J. Bernstein's ChaCha stream cipher.
 */
public class ChaChaEngine extends Salsa20Engine
{
    /**
     * Creates a 20 rounds ChaCha engine.
     */
    public ChaChaEngine()
    {
        super();
    }

    /**
     * Creates a ChaCha engine with a specific number of rounds.
     * @param rounds the number of rounds (must be an even number).
     */
    public ChaChaEngine(int rounds)
    {
        super(rounds);
    }

    public String getAlgorithmName()
    {
        return "ChaCha" + rounds;
    }

    protected void advanceCounter(long diff)
    {
        int hi = (int)(diff >>> 32);
        int lo = (int)diff;

        if (hi > 0)
        {
            engineState[13] += hi;
        }

        int oldState = engineState[12];

        engineState[12] += lo;

        if (oldState != 0 && engineState[12] < oldState)
        {
            engineState[13]++;
        }
    }

    protected void advanceCounter()
    {
    }

    protected void retreatCounter(long diff)
    {
    }

    protected void retreatCounter()
    {
    }

    protected long getCounter()
    {
        return 0;
    }

    protected void resetCounter()
    {
    }

    protected void setKey(byte[] keyBytes, byte[] ivBytes)
    {
    }

    protected void generateKeyStream(byte[] output)
    {
    }

    /**
     * ChaCha function
     *
     * @param   input   input data
     */    
    public static void chachaCore(int rounds, int[] input, int[] x)
    {
    }
}
