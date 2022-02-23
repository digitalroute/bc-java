package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/**
 * Implementation of Martin Hell's, Thomas Johansson's and Willi Meier's stream
 * cipher, Grain v1.
 */
public class Grainv1Engine
    implements StreamCipher
{

    /**
     * Constants
     */
    private static final int STATE_SIZE = 5;

    /**
     * Variables to hold the state of the engine during encryption and
     * decryption
     */
    private byte[] workingKey;
    private byte[] workingIV;
    private byte[] out;
    private int[] lfsr;
    private int[] nfsr;
    private int output;
    private int index = 2;

    private boolean initialised = false;

    public String getAlgorithmName()
    {
        return "Grain v1";
    }

    /**
     * Initialize a Grain v1 cipher.
     *
     * @param forEncryption Whether or not we are for encryption.
     * @param params        The parameters required to set up the cipher.
     * @throws IllegalArgumentException If the params argument is inappropriate.
     */
    public void init(boolean forEncryption, CipherParameters params)
        throws IllegalArgumentException
    {
    }

    /**
     * 160 clocks initialization phase.
     */
    private void initGrain()
    {
    }

    /**
     * Get output from non-linear function g(x).
     *
     * @return Output from NFSR.
     */
    private int getOutputNFSR()
    {
        return 0;
    }

    /**
     * Get output from linear function f(x).
     *
     * @return Output from LFSR.
     */
    private int getOutputLFSR()
    {
        return 0;
    }

    /**
     * Get output from output function h(x).
     *
     * @return Output from h(x).
     */
    private int getOutput()
    {
        return 0;
    }

    /**
     * Shift array 16 bits and add val to index.length - 1.
     *
     * @param array The array to shift.
     * @param val   The value to shift in.
     * @return The shifted array with val added to index.length - 1.
     */
    private int[] shift(int[] array, int val)
    {
        array[0] = array[1];
        array[1] = array[2];
        array[2] = array[3];
        array[3] = array[4];
        array[4] = val;

        return array;
    }

    /**
     * Set keys, reset cipher.
     *
     * @param keyBytes The key.
     * @param ivBytes  The IV.
     */
    private void setKey(byte[] keyBytes, byte[] ivBytes)
    {
    }

    public int processBytes(byte[] in, int inOff, int len, byte[] out,
                             int outOff)
        throws DataLengthException
    {
        return 0;
    }

    public void reset()
    {
    }

    /**
     * Run Grain one round(i.e. 16 bits).
     */
    private void oneRound()
    {
    }

    public byte returnByte(byte in)
    {
        return 0;
    }

    private byte getKeyStream()
    {
        return 0;
    }
}