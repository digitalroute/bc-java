package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class VMPCEngine implements StreamCipher
{
    /*
     * variables to hold the state of the VMPC engine during encryption and
     * decryption
     */
    protected byte n = 0;
    protected byte[] P = null;
    protected byte s = 0;

    protected byte[] workingIV;
    protected byte[] workingKey;

    public String getAlgorithmName()
    {
        return "VMPC";
    }

    /**
     * initialise a VMPC cipher.
     * 
     * @param forEncryption
     *    whether or not we are for encryption.
     * @param params
     *    the parameters required to set up the cipher.
     * @exception IllegalArgumentException
     *    if the params argument is inappropriate.
     */
    public void init(boolean forEncryption, CipherParameters params)
    {
    }

    protected void initKey(byte[] keyBytes, byte[] ivBytes)
    {

    }

    public int processBytes(byte[] in, int inOff, int len, byte[] out,
        int outOff)
    {
        return len;
    }

    public void reset()
    {
        initKey(this.workingKey, this.workingIV);
    }

    public byte returnByte(byte in)
    {
       return 0;
    }
}
