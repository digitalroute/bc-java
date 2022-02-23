package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/**
 * Block cipher Shacal2, designed by Helena Handschuh and David Naccache,
 * based on hash function SHA-256,
 * using SHA-256-Initialization-Values as data and SHA-256-Data as key.
 * <p>
 * A description of Shacal can be found at:
 *    https://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.3.4066
 * Best known cryptanalytic (Wikipedia 11.2013):
 *    Related-key rectangle attack on 44-rounds (Jiqiang Lu, Jongsung Kim).
 * Comments are related to SHA-256-Naming as described in FIPS PUB 180-2
 * </p>
 */
public class Shacal2Engine 
    implements BlockCipher 
{
	
	private static final int BLOCK_SIZE = 32;
	private boolean forEncryption = false;
	private static final int ROUNDS = 64;
	
	private int[] workingKey = null; // expanded key: corresponds to the message block W in FIPS PUB 180-2
	
	public Shacal2Engine()
	{		
	}
	
	public void reset()
	{
	}
	
	public String getAlgorithmName()
	{
		return "Shacal2";
	}

    public int getBlockSize()
    {
        return BLOCK_SIZE;
    }

	public void init(boolean _forEncryption, CipherParameters  params)
		throws IllegalArgumentException
	{
	}

	public void setKey(byte[] kb) 
	{
	}
	
	private void encryptBlock(byte[] in, int inOffset, byte[] out, int outOffset)
	{
	}
	
	private void decryptBlock(byte[] in, int inOffset, byte[] out, int outOffset)
	{
	}

	public int processBlock(byte[] in, int inOffset, byte[] out, int outOffset)	    
			throws DataLengthException, IllegalStateException 
	{
            return 0;
	}

    private void bytes2ints(byte[] bytes, int[] block, int bytesPos, int blockPos)
    {
    }

    private void ints2bytes(int[] block, byte[] out, int pos)
    {
    }
}
