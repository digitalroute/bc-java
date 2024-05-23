package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

/**
 * Serpent is a 128-bit 32-round block cipher with variable key lengths,
 * including 128, 192 and 256 bit keys conjectured to be at least as
 * secure as three-key triple-DES.
 * <p>
 * Serpent was designed by Ross Anderson, Eli Biham and Lars Knudsen as a
 * candidate algorithm for the NIST AES Quest.
 * <p>
 * For full details see <a href="https://www.cl.cam.ac.uk/~rja14/serpent.html">The Serpent home page</a>
 */
public final class SerpentEngine
    extends SerpentEngineBase
{
    /**
     * Expand a user-supplied key material into a session key.
     *
     * @param key  The user-key bytes (multiples of 4) to use.
     * @exception IllegalArgumentException
     */
    protected int[] makeWorkingKey(
        byte[] key)
    throws  IllegalArgumentException
    {
        return new int[0];
    }

    /**
     * Encrypt one block of plaintext.
     *
     * @param input the array containing the input data.
     * @param inOff offset into the in array the data starts at.
     * @param output the array the output data will be copied into.
     * @param outOff the offset into the out array the output will start at.
     */
    protected void encryptBlock(
        byte[]  input,
        int     inOff,
        byte[]  output,
        int     outOff)
    {    

    }

    /**
     * Decrypt one block of ciphertext.
     *
     * @param input the array containing the input data.
     * @param inOff offset into the in array the data starts at.
     * @param output the array the output data will be copied into.
     * @param outOff the offset into the out array the output will start at.
     */
    protected void decryptBlock(
        byte[]  input,
        int     inOff,
        byte[]  output,
        int     outOff)
    {

    }
}
