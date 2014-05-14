/**
 * StreamsterApi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public interface StreamsterApi extends javax.xml.rpc.Service {

/**
 * Streamster API
 */
    public java.lang.String getStreamsterApiPortAddress();

    public com.novativa.www.ws.streamsterapi.StreamsterApiInterface getStreamsterApiPort() throws javax.xml.rpc.ServiceException;

    public com.novativa.www.ws.streamsterapi.StreamsterApiInterface getStreamsterApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
