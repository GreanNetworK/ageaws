/**
 * StreamsterApiInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public interface StreamsterApiInterface extends java.rmi.Remote {
    public com.novativa.www.ws.streamsterapi.Quote getQuote(java.lang.String instrument) throws java.rmi.RemoteException;
    public com.novativa.www.ws.streamsterapi.Position[] getPositions() throws java.rmi.RemoteException;
    public com.novativa.www.ws.streamsterapi.Order[] getOrders() throws java.rmi.RemoteException;
    public com.novativa.www.ws.streamsterapi.Trade[] getTrades() throws java.rmi.RemoteException;
    public com.novativa.www.ws.streamsterapi.Desk[] getDesks() throws java.rmi.RemoteException;
    public void sendOrder(com.novativa.www.ws.streamsterapi.Order order) throws java.rmi.RemoteException;
    public void cancelOrder(java.lang.String orderID) throws java.rmi.RemoteException;
    public void closePosition(java.lang.String positionID) throws java.rmi.RemoteException;
    public void changePosition(com.novativa.www.ws.streamsterapi.Position position) throws java.rmi.RemoteException;
    public void changeOrder(com.novativa.www.ws.streamsterapi.Order order) throws java.rmi.RemoteException;
    public com.novativa.www.ws.streamsterapi.Bar[] getBars(java.lang.String instrument, java.lang.String period, java.lang.String options) throws java.rmi.RemoteException;
    public java.lang.String getLastMessage() throws java.rmi.RemoteException;
}
