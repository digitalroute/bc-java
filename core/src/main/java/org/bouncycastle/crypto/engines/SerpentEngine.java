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

    /**
     * The sboxes below are based on the work of Brian Gladman and
     * Sam Simpson, whose original notice appears below.
     * <p>
     * For further details see:
     *      http://fp.gladman.plus.com/cryptography_technology/serpent/
     */

    /**
     * S0 - { 3, 8,15, 1,10, 6, 5,11,14,13, 4, 2, 7, 0, 9,12 } - 15 terms.
     */
    private void sb0(int a, int b, int c, int d)    
    {
    }

    /**
     * InvSO - {13, 3,11, 0,10, 6, 5,12, 1,14, 4, 7,15, 9, 8, 2 } - 15 terms.
     */
    private void ib0(int a, int b, int c, int d)    
    {
    }

    /**
     * S1 - {15,12, 2, 7, 9, 0, 5,10, 1,11,14, 8, 6,13, 3, 4 } - 14 terms.
     */
    private void sb1(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS1 - { 5, 8, 2,14,15, 6,12, 3,11, 4, 7, 9, 1,13,10, 0 } - 14 steps.
     */
    private void ib1(int a, int b, int c, int d)    
    {
    }

    /**
     * S2 - { 8, 6, 7, 9, 3,12,10,15,13, 1,14, 4, 0,11, 5, 2 } - 16 terms.
     */
    private void sb2(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS2 - {12, 9,15, 4,11,14, 1, 2, 0, 3, 6,13, 5, 8,10, 7 } - 16 steps.
     */
    private void ib2(int a, int b, int c, int d)    
    {
    }

    /**
     * S3 - { 0,15,11, 8,12, 9, 6, 3,13, 1, 2, 4,10, 7, 5,14 } - 16 terms.
     */
    private void sb3(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS3 - { 0, 9,10, 7,11,14, 6,13, 3, 5,12, 2, 4, 8,15, 1 } - 15 terms
     */
    private void ib3(int a, int b, int c, int d)    
    {
    }

    /**
     * S4 - { 1,15, 8, 3,12, 0,11, 6, 2, 5, 4,10, 9,14, 7,13 } - 15 terms.
     */
    private void sb4(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS4 - { 5, 0, 8, 3,10, 9, 7,14, 2,12,11, 6, 4,15,13, 1 } - 15 terms.
     */
    private void ib4(int a, int b, int c, int d)    
    {
    }

    /**
     * S5 - {15, 5, 2,11, 4,10, 9,12, 0, 3,14, 8,13, 6, 7, 1 } - 16 terms.
     */
    private void sb5(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS5 - { 8,15, 2, 9, 4, 1,13,14,11, 6, 5, 3, 7,12,10, 0 } - 16 terms.
     */
    private void ib5(int a, int b, int c, int d)    
    {
    }

    /**
     * S6 - { 7, 2,12, 5, 8, 4, 6,11,14, 9, 1,15,13, 3,10, 0 } - 15 terms.
     */
    private void sb6(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS6 - {15,10, 1,13, 5, 3, 6, 0, 4, 9,14, 7, 2,12, 8,11 } - 15 terms.
     */
    private void ib6(int a, int b, int c, int d)    
    {
    }

    /**
     * S7 - { 1,13,15, 0,14, 8, 2,11, 7, 4,12,10, 9, 3, 5, 6 } - 16 terms.
     */
    private void sb7(int a, int b, int c, int d)    
    {
    }

    /**
     * InvS7 - { 3, 0, 6,13, 9,14,15, 8, 5,12,11, 7,10, 1, 4, 2 } - 17 terms.
     */
    private void ib7(int a, int b, int c, int d)    
    {
    }

    /**
     * Apply the linear transformation to the register set.
     */
    private void LT()
    {
    }

    /**
     * Apply the inverse of the linear transformation to the register set.
     */
    private void inverseLT()
    {
    }
}
