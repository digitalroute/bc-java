package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;

/**
 * an implementation of the ARIA Key Wrapper from the NIST Key Wrap
 * Specification.
 * <p>
 * For further details see: <a href="https://csrc.nist.gov/encryption/kms/key-wrap.pdf">https://csrc.nist.gov/encryption/kms/key-wrap.pdf</a>.
 */
public class ARIAWrapEngine
        implements Wrapper
{
    /**
     * Create a regular ARIAWrapEngine specifying the encrypt for wrapping, decrypt for unwrapping.
     */
    public ARIAWrapEngine()
    {

    }

    /**
     * Create an ARIAWrapEngine where the underlying cipher is set to decrypt for wrapping, encrypt for unwrapping.
     *
     * @param useReverseDirection true if underlying cipher should be used in decryption mode, false otherwise.
     */
    public ARIAWrapEngine(boolean useReverseDirection)
    {
    }
    @Override
    public void init(boolean forWrapping, CipherParameters param) {

    }

    @Override
    public String getAlgorithmName() {
        return null;
    }

    @Override
    public byte[] wrap(byte[] in, int inOff, int inLen) {
        return new byte[0];
    }

    @Override
    public byte[] unwrap(byte[] in, int inOff, int inLen) throws InvalidCipherTextException {
        return new byte[0];
    }
}
