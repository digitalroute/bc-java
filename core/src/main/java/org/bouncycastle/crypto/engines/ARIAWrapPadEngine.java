package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;

public class ARIAWrapPadEngine
        implements Wrapper
{
    public ARIAWrapPadEngine()
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
