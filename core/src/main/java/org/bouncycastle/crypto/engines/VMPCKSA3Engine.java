package org.bouncycastle.crypto.engines;

public class VMPCKSA3Engine extends VMPCEngine
{
    public String getAlgorithmName()
    {
        return "VMPC-KSA3";
    }

    protected void initKey(byte[] keyBytes, byte[] ivBytes)
    {

    }
}
