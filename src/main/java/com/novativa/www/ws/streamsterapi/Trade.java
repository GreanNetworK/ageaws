/**
 * Trade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public class Trade  implements java.io.Serializable {
    private java.lang.String tradeID;

    private java.lang.String desk;

    private java.lang.String instrument;

    private java.lang.String side;

    private java.lang.String phase;

    private java.math.BigDecimal price;

    private java.math.BigDecimal quantity;

    private java.util.Calendar executed;

    private java.lang.String status;

    private java.lang.String currency;

    private java.lang.String text;

    private java.lang.String orderID;

    public Trade() {
    }

    public Trade(
           java.lang.String tradeID,
           java.lang.String desk,
           java.lang.String instrument,
           java.lang.String side,
           java.lang.String phase,
           java.math.BigDecimal price,
           java.math.BigDecimal quantity,
           java.util.Calendar executed,
           java.lang.String status,
           java.lang.String currency,
           java.lang.String text,
           java.lang.String orderID) {
           this.tradeID = tradeID;
           this.desk = desk;
           this.instrument = instrument;
           this.side = side;
           this.phase = phase;
           this.price = price;
           this.quantity = quantity;
           this.executed = executed;
           this.status = status;
           this.currency = currency;
           this.text = text;
           this.orderID = orderID;
    }


    /**
     * Gets the tradeID value for this Trade.
     * 
     * @return tradeID
     */
    public java.lang.String getTradeID() {
        return tradeID;
    }


    /**
     * Sets the tradeID value for this Trade.
     * 
     * @param tradeID
     */
    public void setTradeID(java.lang.String tradeID) {
        this.tradeID = tradeID;
    }


    /**
     * Gets the desk value for this Trade.
     * 
     * @return desk
     */
    public java.lang.String getDesk() {
        return desk;
    }


    /**
     * Sets the desk value for this Trade.
     * 
     * @param desk
     */
    public void setDesk(java.lang.String desk) {
        this.desk = desk;
    }


    /**
     * Gets the instrument value for this Trade.
     * 
     * @return instrument
     */
    public java.lang.String getInstrument() {
        return instrument;
    }


    /**
     * Sets the instrument value for this Trade.
     * 
     * @param instrument
     */
    public void setInstrument(java.lang.String instrument) {
        this.instrument = instrument;
    }


    /**
     * Gets the side value for this Trade.
     * 
     * @return side
     */
    public java.lang.String getSide() {
        return side;
    }


    /**
     * Sets the side value for this Trade.
     * 
     * @param side
     */
    public void setSide(java.lang.String side) {
        this.side = side;
    }


    /**
     * Gets the phase value for this Trade.
     * 
     * @return phase
     */
    public java.lang.String getPhase() {
        return phase;
    }


    /**
     * Sets the phase value for this Trade.
     * 
     * @param phase
     */
    public void setPhase(java.lang.String phase) {
        this.phase = phase;
    }


    /**
     * Gets the price value for this Trade.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Trade.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the quantity value for this Trade.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Trade.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the executed value for this Trade.
     * 
     * @return executed
     */
    public java.util.Calendar getExecuted() {
        return executed;
    }


    /**
     * Sets the executed value for this Trade.
     * 
     * @param executed
     */
    public void setExecuted(java.util.Calendar executed) {
        this.executed = executed;
    }


    /**
     * Gets the status value for this Trade.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Trade.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the currency value for this Trade.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Trade.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the text value for this Trade.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Trade.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the orderID value for this Trade.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this Trade.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Trade)) return false;
        Trade other = (Trade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tradeID==null && other.getTradeID()==null) || 
             (this.tradeID!=null &&
              this.tradeID.equals(other.getTradeID()))) &&
            ((this.desk==null && other.getDesk()==null) || 
             (this.desk!=null &&
              this.desk.equals(other.getDesk()))) &&
            ((this.instrument==null && other.getInstrument()==null) || 
             (this.instrument!=null &&
              this.instrument.equals(other.getInstrument()))) &&
            ((this.side==null && other.getSide()==null) || 
             (this.side!=null &&
              this.side.equals(other.getSide()))) &&
            ((this.phase==null && other.getPhase()==null) || 
             (this.phase!=null &&
              this.phase.equals(other.getPhase()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.executed==null && other.getExecuted()==null) || 
             (this.executed!=null &&
              this.executed.equals(other.getExecuted()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTradeID() != null) {
            _hashCode += getTradeID().hashCode();
        }
        if (getDesk() != null) {
            _hashCode += getDesk().hashCode();
        }
        if (getInstrument() != null) {
            _hashCode += getInstrument().hashCode();
        }
        if (getSide() != null) {
            _hashCode += getSide().hashCode();
        }
        if (getPhase() != null) {
            _hashCode += getPhase().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getExecuted() != null) {
            _hashCode += getExecuted().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Trade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Trade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "TradeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Desk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Instrument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("side");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Side"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Phase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Executed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
