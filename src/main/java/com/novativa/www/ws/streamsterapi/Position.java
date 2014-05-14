/**
 * Position.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public class Position  implements java.io.Serializable {
    private java.lang.String positionID;

    private java.lang.String desk;

    private java.lang.String instrument;

    private java.lang.String side;

    private java.math.BigDecimal openPrice;

    private java.lang.String currency;

    private java.math.BigDecimal quantity;

    private java.math.BigDecimal points;

    private java.math.BigDecimal profit;

    private java.math.BigDecimal exitStopLoss;

    private java.math.BigDecimal exitTarget;

    private java.util.Calendar entered;

    private java.util.Calendar exited;

    private java.lang.String status;

    private java.lang.String text;

    private java.math.BigDecimal closePrice;

    private java.math.BigDecimal interest;

    public Position() {
    }

    public Position(
           java.lang.String positionID,
           java.lang.String desk,
           java.lang.String instrument,
           java.lang.String side,
           java.math.BigDecimal openPrice,
           java.lang.String currency,
           java.math.BigDecimal quantity,
           java.math.BigDecimal points,
           java.math.BigDecimal profit,
           java.math.BigDecimal exitStopLoss,
           java.math.BigDecimal exitTarget,
           java.util.Calendar entered,
           java.util.Calendar exited,
           java.lang.String status,
           java.lang.String text,
           java.math.BigDecimal closePrice,
           java.math.BigDecimal interest) {
           this.positionID = positionID;
           this.desk = desk;
           this.instrument = instrument;
           this.side = side;
           this.openPrice = openPrice;
           this.currency = currency;
           this.quantity = quantity;
           this.points = points;
           this.profit = profit;
           this.exitStopLoss = exitStopLoss;
           this.exitTarget = exitTarget;
           this.entered = entered;
           this.exited = exited;
           this.status = status;
           this.text = text;
           this.closePrice = closePrice;
           this.interest = interest;
    }


    /**
     * Gets the positionID value for this Position.
     * 
     * @return positionID
     */
    public java.lang.String getPositionID() {
        return positionID;
    }


    /**
     * Sets the positionID value for this Position.
     * 
     * @param positionID
     */
    public void setPositionID(java.lang.String positionID) {
        this.positionID = positionID;
    }


    /**
     * Gets the desk value for this Position.
     * 
     * @return desk
     */
    public java.lang.String getDesk() {
        return desk;
    }


    /**
     * Sets the desk value for this Position.
     * 
     * @param desk
     */
    public void setDesk(java.lang.String desk) {
        this.desk = desk;
    }


    /**
     * Gets the instrument value for this Position.
     * 
     * @return instrument
     */
    public java.lang.String getInstrument() {
        return instrument;
    }


    /**
     * Sets the instrument value for this Position.
     * 
     * @param instrument
     */
    public void setInstrument(java.lang.String instrument) {
        this.instrument = instrument;
    }


    /**
     * Gets the side value for this Position.
     * 
     * @return side
     */
    public java.lang.String getSide() {
        return side;
    }


    /**
     * Sets the side value for this Position.
     * 
     * @param side
     */
    public void setSide(java.lang.String side) {
        this.side = side;
    }


    /**
     * Gets the openPrice value for this Position.
     * 
     * @return openPrice
     */
    public java.math.BigDecimal getOpenPrice() {
        return openPrice;
    }


    /**
     * Sets the openPrice value for this Position.
     * 
     * @param openPrice
     */
    public void setOpenPrice(java.math.BigDecimal openPrice) {
        this.openPrice = openPrice;
    }


    /**
     * Gets the currency value for this Position.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Position.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the quantity value for this Position.
     * 
     * @return quantity
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Position.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the points value for this Position.
     * 
     * @return points
     */
    public java.math.BigDecimal getPoints() {
        return points;
    }


    /**
     * Sets the points value for this Position.
     * 
     * @param points
     */
    public void setPoints(java.math.BigDecimal points) {
        this.points = points;
    }


    /**
     * Gets the profit value for this Position.
     * 
     * @return profit
     */
    public java.math.BigDecimal getProfit() {
        return profit;
    }


    /**
     * Sets the profit value for this Position.
     * 
     * @param profit
     */
    public void setProfit(java.math.BigDecimal profit) {
        this.profit = profit;
    }


    /**
     * Gets the exitStopLoss value for this Position.
     * 
     * @return exitStopLoss
     */
    public java.math.BigDecimal getExitStopLoss() {
        return exitStopLoss;
    }


    /**
     * Sets the exitStopLoss value for this Position.
     * 
     * @param exitStopLoss
     */
    public void setExitStopLoss(java.math.BigDecimal exitStopLoss) {
        this.exitStopLoss = exitStopLoss;
    }


    /**
     * Gets the exitTarget value for this Position.
     * 
     * @return exitTarget
     */
    public java.math.BigDecimal getExitTarget() {
        return exitTarget;
    }


    /**
     * Sets the exitTarget value for this Position.
     * 
     * @param exitTarget
     */
    public void setExitTarget(java.math.BigDecimal exitTarget) {
        this.exitTarget = exitTarget;
    }


    /**
     * Gets the entered value for this Position.
     * 
     * @return entered
     */
    public java.util.Calendar getEntered() {
        return entered;
    }


    /**
     * Sets the entered value for this Position.
     * 
     * @param entered
     */
    public void setEntered(java.util.Calendar entered) {
        this.entered = entered;
    }


    /**
     * Gets the exited value for this Position.
     * 
     * @return exited
     */
    public java.util.Calendar getExited() {
        return exited;
    }


    /**
     * Sets the exited value for this Position.
     * 
     * @param exited
     */
    public void setExited(java.util.Calendar exited) {
        this.exited = exited;
    }


    /**
     * Gets the status value for this Position.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Position.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the text value for this Position.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Position.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the closePrice value for this Position.
     * 
     * @return closePrice
     */
    public java.math.BigDecimal getClosePrice() {
        return closePrice;
    }


    /**
     * Sets the closePrice value for this Position.
     * 
     * @param closePrice
     */
    public void setClosePrice(java.math.BigDecimal closePrice) {
        this.closePrice = closePrice;
    }


    /**
     * Gets the interest value for this Position.
     * 
     * @return interest
     */
    public java.math.BigDecimal getInterest() {
        return interest;
    }


    /**
     * Sets the interest value for this Position.
     * 
     * @param interest
     */
    public void setInterest(java.math.BigDecimal interest) {
        this.interest = interest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Position)) return false;
        Position other = (Position) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.positionID==null && other.getPositionID()==null) || 
             (this.positionID!=null &&
              this.positionID.equals(other.getPositionID()))) &&
            ((this.desk==null && other.getDesk()==null) || 
             (this.desk!=null &&
              this.desk.equals(other.getDesk()))) &&
            ((this.instrument==null && other.getInstrument()==null) || 
             (this.instrument!=null &&
              this.instrument.equals(other.getInstrument()))) &&
            ((this.side==null && other.getSide()==null) || 
             (this.side!=null &&
              this.side.equals(other.getSide()))) &&
            ((this.openPrice==null && other.getOpenPrice()==null) || 
             (this.openPrice!=null &&
              this.openPrice.equals(other.getOpenPrice()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.points==null && other.getPoints()==null) || 
             (this.points!=null &&
              this.points.equals(other.getPoints()))) &&
            ((this.profit==null && other.getProfit()==null) || 
             (this.profit!=null &&
              this.profit.equals(other.getProfit()))) &&
            ((this.exitStopLoss==null && other.getExitStopLoss()==null) || 
             (this.exitStopLoss!=null &&
              this.exitStopLoss.equals(other.getExitStopLoss()))) &&
            ((this.exitTarget==null && other.getExitTarget()==null) || 
             (this.exitTarget!=null &&
              this.exitTarget.equals(other.getExitTarget()))) &&
            ((this.entered==null && other.getEntered()==null) || 
             (this.entered!=null &&
              this.entered.equals(other.getEntered()))) &&
            ((this.exited==null && other.getExited()==null) || 
             (this.exited!=null &&
              this.exited.equals(other.getExited()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.closePrice==null && other.getClosePrice()==null) || 
             (this.closePrice!=null &&
              this.closePrice.equals(other.getClosePrice()))) &&
            ((this.interest==null && other.getInterest()==null) || 
             (this.interest!=null &&
              this.interest.equals(other.getInterest())));
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
        if (getPositionID() != null) {
            _hashCode += getPositionID().hashCode();
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
        if (getOpenPrice() != null) {
            _hashCode += getOpenPrice().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getPoints() != null) {
            _hashCode += getPoints().hashCode();
        }
        if (getProfit() != null) {
            _hashCode += getProfit().hashCode();
        }
        if (getExitStopLoss() != null) {
            _hashCode += getExitStopLoss().hashCode();
        }
        if (getExitTarget() != null) {
            _hashCode += getExitTarget().hashCode();
        }
        if (getEntered() != null) {
            _hashCode += getEntered().hashCode();
        }
        if (getExited() != null) {
            _hashCode += getExited().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getClosePrice() != null) {
            _hashCode += getClosePrice().hashCode();
        }
        if (getInterest() != null) {
            _hashCode += getInterest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Position.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Position"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "PositionID"));
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
        elemField.setFieldName("openPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "OpenPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Profit"));
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
        elemField.setFieldName("entered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Entered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Exited"));
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
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "ClosePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Interest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
