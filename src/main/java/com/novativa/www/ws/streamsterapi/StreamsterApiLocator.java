/**
 * StreamsterApiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public class StreamsterApiLocator extends org.apache.axis.client.Service implements com.novativa.www.ws.streamsterapi.StreamsterApi {

/**
 * Streamster API
 */

    public StreamsterApiLocator() {
    }


    public StreamsterApiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StreamsterApiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StreamsterApiPort
    private java.lang.String StreamsterApiPort_address = "http://127.0.0.1:8018/endpoint";

    public java.lang.String getStreamsterApiPortAddress() {
        return StreamsterApiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StreamsterApiPortWSDDServiceName = "StreamsterApiPort";

    public java.lang.String getStreamsterApiPortWSDDServiceName() {
        return StreamsterApiPortWSDDServiceName;
    }

    public void setStreamsterApiPortWSDDServiceName(java.lang.String name) {
        StreamsterApiPortWSDDServiceName = name;
    }

    public com.novativa.www.ws.streamsterapi.StreamsterApiInterface getStreamsterApiPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StreamsterApiPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStreamsterApiPort(endpoint);
    }

    public com.novativa.www.ws.streamsterapi.StreamsterApiInterface getStreamsterApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.novativa.www.ws.streamsterapi.StreamsterApiBindingStub _stub = new com.novativa.www.ws.streamsterapi.StreamsterApiBindingStub(portAddress, this);
            _stub.setPortName(getStreamsterApiPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStreamsterApiPortEndpointAddress(java.lang.String address) {
        StreamsterApiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.novativa.www.ws.streamsterapi.StreamsterApiInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.novativa.www.ws.streamsterapi.StreamsterApiBindingStub _stub = new com.novativa.www.ws.streamsterapi.StreamsterApiBindingStub(new java.net.URL(StreamsterApiPort_address), this);
                _stub.setPortName(getStreamsterApiPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StreamsterApiPort".equals(inputPortName)) {
            return getStreamsterApiPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "StreamsterApi");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "StreamsterApiPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StreamsterApiPort".equals(portName)) {
            setStreamsterApiPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
