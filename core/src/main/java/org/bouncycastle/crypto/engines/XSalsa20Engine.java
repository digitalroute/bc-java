package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

/**
 * Implementation of Daniel J. Bernstein's XSalsa20 stream cipher - Salsa20 with an extended nonce.
 * <p>
 * XSalsa20 requires a 256 bit key, and a 192 bit nonce.
 */
public class XSalsa20Engine extends Salsa20Engine
{
    public String getAlgorithmName()
    {
        return "XSalsa20";
    }

    protected int getNonceSize()
    {
        return 24;
    }

    /**
     * XSalsa20 key generation: process 256 bit input key and 128 bits of the input nonce
     * using a core Salsa20 function without input addition to produce 256 bit working key
     * and use that with the remaining 64 bits of nonce to initialize a standard Salsa20 engine state.
     */
    protected void setKey(byte[] keyBytes, byte[] ivBytes)
    {

    }
}
