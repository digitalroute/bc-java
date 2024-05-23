package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/**
 * Implementation of Bob Jenkin's ISAAC (Indirection Shift Accumulate Add and Count).
 * see: https://www.burtleburtle.net/bob/rand/isaacafa.html
*/
public class ISAACEngine
    implements StreamCipher
{
    // Constants
    private final int sizeL          = 8,
                      stateArraySize = sizeL<<5; // 256
    
    // Cipher's internal state
    private int[]   engineState   = null, // mm                
                    results       = null; // randrsl
    private int     a = 0, b = 0, c = 0;
    
    // Engine state
    private int     index         = 0;
    private byte[]  keyStream     = new byte[stateArraySize<<2], // results expanded into bytes
                    workingKey    = null;
    private boolean initialised   = false;
    
    /**
     * initialise an ISAAC cipher.
     *
     * @param forEncryption whether or not we are for encryption.
     * @param params the parameters required to set up the cipher.
     * @exception IllegalArgumentException if the params argument is
     * inappropriate.
     */
    public void init(
        boolean             forEncryption, 
        CipherParameters    params)
    {
    }
                    
    public byte returnByte(byte in)
    {
       return 0;
    }
    
    public int processBytes(
        byte[]  in, 
        int     inOff, 
        int     len, 
        byte[]  out, 
        int     outOff)
    {
       return 0;
    }
    
    public String getAlgorithmName()
    {
        return "ISAAC";
    }
    
    public void reset()
    {
    }

}
