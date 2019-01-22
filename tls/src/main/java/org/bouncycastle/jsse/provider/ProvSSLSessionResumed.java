package org.bouncycastle.jsse.provider;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.TlsSession;

class ProvSSLSessionResumed
    extends ProvSSLSessionHandshake
{
    protected final TlsSession tlsSession;
    protected final SessionParameters sessionParameters;

    ProvSSLSessionResumed(ProvSSLSessionContext sslSessionContext, String peerHost, int peerPort,
        SecurityParameters securityParameters, TlsSession tlsSession)
    {
        super(sslSessionContext, peerHost, peerPort, securityParameters);

        this.tlsSession = tlsSession;
        this.sessionParameters = tlsSession.exportSessionParameters();
    }

    @Override
    protected int getCipherSuiteTLS()
    {
        return sessionParameters.getCipherSuite();
    }

    @Override
    protected byte[] getIDArray()
    {
        return tlsSession.getSessionID();
    }

    @Override
    protected org.bouncycastle.tls.Certificate getLocalCertificateTLS()
    {
        return sessionParameters.getLocalCertificate();
    }

    @Override
    protected org.bouncycastle.tls.Certificate getPeerCertificateTLS()
    {
        return sessionParameters.getPeerCertificate();
    }

    @Override
    protected ProtocolVersion getProtocolTLS()
    {
        return sessionParameters.getNegotiatedVersion();
    }

    public void invalidate()
    {
        super.invalidate();

        tlsSession.invalidate();
    }

    public boolean isValid()
    {
        return super.isValid() && tlsSession.isResumable();
    }
}
