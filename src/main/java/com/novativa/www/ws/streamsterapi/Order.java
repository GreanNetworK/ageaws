/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public class Order  implements java.io.Serializable {
    private java.lang.String orderID;

    private java.lang.String desk;

    private java.lang.String instrument;

    private java.lang.String side;

    private java.lang.String phase;

    private java.lang.String priceType;

    private java.math.BigDecimal price;

    private java.math.BigDecimal activeQuantity;

    private java.math.BigDecimal tradedQuantity;

    private java.math.BigDecimal exitStopLoss;

    private java.math.BigDecimal exitTarget;

    private java.lang.String status;

    private java.lang.String positionID;

    private java.lang.String currency;

    private java.util.Calendar duration;

    private java.lang.String durationType;

    private java.math.BigDecimal quantity;

    private java.lang.String quantityType;

    private java.lang.String text;

    private java.util.Calendar entered;

    public Order() {
    }

    public Order(
           java.lang.String orderID,
           java.lang.String desk,
           java.lang.String instrument,
           java.lang.String side,
           java.lang.String phase,
           java.lang.String priceType,
           java.math.BigDecimal price,
           java.math.BigDecimal activeQuantity,
           java.math.BigDecimal tradedQuantity,
           java.math.BigDecimal exitStopLoss,
           java.math.BigDecimal exitTarget,
           java.lang.String status,
           java.lang.String positionID,
           java.lang.String currency,
           java.util.Calendar duration,
           java.lang.String durationType,
           java.math.BigDecimal quantity,
           java.lang.String quantityType,
           java.lang.String text,
           java.util.Calendar entered) {
           this.orderID = orderID;
           this.desk = desk;
           this.instrument = instrument;
           this.side = side;
           this.phase = phase;
           this.priceType = priceType;
           this.price = price;
           this.activeQuantity = activeQuantity;
           this.tradedQuantity = tradedQuantity;
           this.exitStopLoss = exitStopLoss;
           this.exitTarget = exitTarget;
           this.status = status;
           this.positionID = positionID;
           this.currency = currency;
           this.duration = duration;
           this.durationType = durationType;
           this.quantity = quantity;
           this.quantityType = quantityType;
           this.text = text;
           this.entered = entered;
    }


    /**
     * Gets the orderID value for this Order.
     * 
     * @return orderID
     */
    public java.lang.String getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this Order.
     * 
     * @param orderID
     */
    public void setOrderID(java.lang.String orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the desk value for this Order.
     * 
     * @return desk
     */
    public java.lang.String getDesk() {
        return desk;
    }


    /**
     * Sets the desk value for this Order.
     * 
     * @param desk
     */
    public void setDesk(java.lang.String desk) {
        this.desk = desk;
    }


    /**
     * Gets the instrument value for this Order.
     * 
     * @return instrument
     */
    public java.lang.String getInstrument() {
        return instrument;
    }


    /**
     * Sets the instrument value for this Order.
     * 
     * @param instrument
     */
    public void setInstrument(java.lang.String instrument) {
        this.instrument = instrument;
    }


    /**
     * Gets the side value for this Order.
     * 
     * @return side
     */
    public java.lang.String getSide() {
        return side;
    }


    /**
     * Sets the side value for this Order.
     * 
     * @param side
     */
    public void setSide(java.lang.String side) {
        this.side = side;
    }


    /**
     * Gets the phase value for this Order.
     * 
     * @return phase
     */
    public java.lang.String getPhase() {
        return phase;
    }


    /**
     * Sets the phase value for this Order.
     * 
     * @param phase
     */
    public void setPhase(java.lang.String phase) {
        this.phase = phase;
    }


    /**
     * Gets the priceType value for this Order.
     * 
     * @return priceType
     */
    public java.lang.String getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this Order.
     * 
     * @param priceType
     */
    public void setPriceType(java.lang.String priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the price value for this Order.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Order.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the activeQuantity value for this Order.
     * 
     * @return activeQuantity
     */
    public java.math.BigDecimal getActiveQuantity() {
        return activeQuantity;
    }


    /**
     * Sets the activeQuantity value for this Order.
     * 
     * @param activeQuantity
     */
    public void setActiveQuantity(java.math.BigDecimal activeQuantity) {
        this.activeQuantity = activeQuantity;
    }


    /**
     * Gets the tradedQuantity value for this Order.
     * 
     * @return tradedQuantity
     */
    public java.math.BigDecimal getTradedQuantity() {
        return tradedQuantity;
    }


    /**
     * Sets the tradedQuantity value for this Order.
     * 
     * @param tradedQuantity
     */
    public void setTradedQuantity(java.math.BigDecimal tradedQuantity) {
        this.tradedQuantity = tradedQuantity;
    }


    /**
     * Gets the exitStopLoss value for this Order.
     * 
     * @return exitStopLoss
     */
    public java.math.BigDecimal getExitStopLoss() {
        return exitStopLoss;
    }


    /**
     * Sets the exitStopLoss value for this Order.
     * 
     * @param exitStopLoss
     */
    public void setExitStopLoss(java.math.BigDecimal exitStopLoss) {
        this.exitStopLoss = exitStopLoss;
    }


    /**
     * Gets the exitTarget value for this Order.
     * 
     * @return exitTarget
     */
    public java.math.BigDecimal getExitTarget() {
        return exitTarget;
    }


    /**
     * Sets the exitTarget value for this Order.
     * 
     * @param exitTarget
     */
    public void setExitTarget(java.math.BigDecimal exitTarget) {
        this.exitTarget = exitTarget;
    }


    /**
     * Gets the status value for this Order.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Order.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the positionID value for this Order.
     * 
     * @return positionID
     */
    public java.lang.String getPositionID() {
        return positionID;
    }


    /**
     * Sets the positionID value for this Order.
     * 
     * @param positionID
     */
    public void setPositionID(java.lang.String positionID) {
        this.positionID = positionID;
    }


    /**
     * Gets the currency value for this Order.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Order.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the duration value for this Order.
     * 
     * @return duration
     */
    public java.util.Calendar getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this Order.
     * 
     * @param duration
     */
    public void setDuration(java.util.Calendar duration) {
        this.duration = duration;
    }


    /**
     * Gets the durationType value for this Order.
     * 
     * @return durationType
     */
    public java.lang.String getDurationType() {
        return durationType;
    }


    /**
     * Sets the durationType value for this Order.
     * 
     * @param durationType
     */
    public void setDurationType(java.lang.String durationType) {
        this.durationType = durationType;
    }


    /**
     * Gets the quantity value for this Order.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Order.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quantityType value for this Order.
     * 
     * @return quantityType
     */
    public java.lang.String getQuantityType() {
        return quantityType;
    }


    /**
     * Sets the quantityType value for this Order.
     * 
     * @param quantityType
     */
    public void setQuantityType(java.lang.String quantityType) {
        this.quantityType = quantityType;
    }


    /**
     * Gets the text value for this Order.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Order.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the entered value for this Order.
     * 
     * @return entered
     */
    public java.util.Calendar getEntered() {
        return entered;
    }


    /**
     * Sets the entered value for this Order.
     * 
     * @param entered
     */
    public void setEntered(java.util.Calendar entered) {
        this.entered = entered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderID==null && other.getOrderID()==null) || 
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
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
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.activeQuantity==null && other.getActiveQuantity()==null) || 
             (this.activeQuantity!=null &&
              this.activeQuantity.equals(other.getActiveQuantity()))) &&
            ((this.tradedQuantity==null && other.getTradedQuantity()==null) || 
             (this.tradedQuantity!=null &&
              this.tradedQuantity.equals(other.getTradedQuantity()))) &&
            ((this.exitStopLoss==null && other.getExitStopLoss()==null) || 
             (this.exitStopLoss!=null &&
              this.exitStopLoss.equals(other.getExitStopLoss()))) &&
            ((this.exitTarget==null && other.getExitTarget()==null) || 
             (this.exitTarget!=null &&
              this.exitTarget.equals(other.getExitTarget()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.positionID==null && other.getPositionID()==null) || 
             (this.positionID!=null &&
              this.positionID.equals(other.getPositionID()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.durationType==null && other.getDurationType()==null) || 
             (this.durationType!=null &&
              this.durationType.equals(other.getDurationType()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quantityType==null && other.getQuantityType()==null) || 
             (this.quantityType!=null &&
              this.quantityType.equals(other.getQuantityType()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.entered==null && other.getEntered()==null) || 
             (this.entered!=null &&
              this.entered.equals(other.getEntered())));
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
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
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
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getActiveQuantity() != null) {
            _hashCode += getActiveQuantity().hashCode();
        }
        if (getTradedQuantity() != null) {
            _hashCode += getTradedQuantity().hashCode();
        }
        if (getExitStopLoss() != null) {
            _hashCode += getExitStopLoss().hashCode();
        }
        if (getExitTarget() != null) {
            _hashCode += getExitTarget().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPositionID() != null) {
            _hashCode += getPositionID().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getDurationType() != null) {
            _hashCode += getDurationType().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuantityType() != null) {
            _hashCode += getQuantityType().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getEntered() != null) {
            _hashCode += getEntered().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "OrderID"));
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
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "PriceType"));
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
        elemField.setFieldName("activeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "ActiveQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradedQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "TradedQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitStopLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "ExitStopLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "ExitTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("positionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "PositionID"));
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
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "DurationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("quantityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "QuantityType"));
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
        elemField.setFieldName("entered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Entered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
