package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.util.Arrays;

public class GOST28147WrapEngine
    implements Wrapper
{
    private GOST28147Engine cipher = new GOST28147Engine();
    private GOST28147Mac mac = new GOST28147Mac();

    public void init(boolean forWrapping, CipherParameters param)
    {

    }

    public String getAlgorithmName()
    {
        return "GOST28147Wrap";
    }

    public byte[] wrap(byte[] input, int inOff, int inLen)
    {
       return null;
    }

    public byte[] unwrap(byte[] input, int inOff, int inLen)
        throws InvalidCipherTextException
    {
      return null;
    }
}
