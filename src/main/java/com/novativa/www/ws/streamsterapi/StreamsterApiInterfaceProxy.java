package com.novativa.www.ws.streamsterapi;

public class StreamsterApiInterfaceProxy implements com.novativa.www.ws.streamsterapi.StreamsterApiInterface {
  private String _endpoint = null;
  private com.novativa.www.ws.streamsterapi.StreamsterApiInterface streamsterApiInterface = null;
  
  public StreamsterApiInterfaceProxy() {
    _initStreamsterApiInterfaceProxy();
  }
  
  public StreamsterApiInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initStreamsterApiInterfaceProxy();
  }
  
  private void _initStreamsterApiInterfaceProxy() {
    try {
      streamsterApiInterface = (new com.novativa.www.ws.streamsterapi.StreamsterApiLocator()).getStreamsterApiPort();
      if (streamsterApiInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)streamsterApiInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)streamsterApiInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (streamsterApiInterface != null)
      ((javax.xml.rpc.Stub)streamsterApiInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.novativa.www.ws.streamsterapi.StreamsterApiInterface getStreamsterApiInterface() {
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface;
  }
  
  public com.novativa.www.ws.streamsterapi.Quote getQuote(java.lang.String instrument) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getQuote(instrument);
  }
  
  public com.novativa.www.ws.streamsterapi.Position[] getPositions() throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getPositions();
  }
  
  public com.novativa.www.ws.streamsterapi.Order[] getOrders() throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getOrders();
  }
  
  public com.novativa.www.ws.streamsterapi.Trade[] getTrades() throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getTrades();
  }
  
  public com.novativa.www.ws.streamsterapi.Desk[] getDesks() throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getDesks();
  }
  
  public void sendOrder(com.novativa.www.ws.streamsterapi.Order order) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    streamsterApiInterface.sendOrder(order);
  }
  
  public void cancelOrder(java.lang.String orderID) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    streamsterApiInterface.cancelOrder(orderID);
  }
  
  public void closePosition(java.lang.String positionID) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    streamsterApiInterface.closePosition(positionID);
  }
  
  public void changePosition(com.novativa.www.ws.streamsterapi.Position position) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    streamsterApiInterface.changePosition(position);
  }
  
  public void changeOrder(com.novativa.www.ws.streamsterapi.Order order) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    streamsterApiInterface.changeOrder(order);
  }
  
  public com.novativa.www.ws.streamsterapi.Bar[] getBars(java.lang.String instrument, java.lang.String period, java.lang.String options) throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getBars(instrument, period, options);
  }
  
  public java.lang.String getLastMessage() throws java.rmi.RemoteException{
    if (streamsterApiInterface == null)
      _initStreamsterApiInterfaceProxy();
    return streamsterApiInterface.getLastMessage();
  }
  
  
}