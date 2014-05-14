/**
 * Quote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public class Quote  implements java.io.Serializable {
    private java.math.BigDecimal last;

    private java.math.BigDecimal bid;

    private java.math.BigDecimal offer;

    private java.math.BigDecimal change;

    private java.math.BigDecimal high;

    private java.math.BigDecimal low;

    private java.math.BigDecimal open;

    private java.math.BigDecimal close;

    private org.apache.axis.types.Time time;

    private java.lang.String currency;

    private java.math.BigDecimal yield;

    private java.math.BigDecimal ask;

    public Quote() {
    }

    public Quote(
           java.math.BigDecimal last,
           java.math.BigDecimal bid,
           java.math.BigDecimal offer,
           java.math.BigDecimal change,
           java.math.BigDecimal high,
           java.math.BigDecimal low,
           java.math.BigDecimal open,
           java.math.BigDecimal close,
           org.apache.axis.types.Time time,
           java.lang.String currency,
           java.math.BigDecimal yield,
           java.math.BigDecimal ask) {
           this.last = last;
           this.bid = bid;
           this.offer = offer;
           this.change = change;
           this.high = high;
           this.low = low;
           this.open = open;
           this.close = close;
           this.time = time;
           this.currency = currency;
           this.yield = yield;
           this.ask = ask;
    }


    /**
     * Gets the last value for this Quote.
     * 
     * @return last
     */
    public java.math.BigDecimal getLast() {
        return last;
    }


    /**
     * Sets the last value for this Quote.
     * 
     * @param last
     */
    public void setLast(java.math.BigDecimal last) {
        this.last = last;
    }


    /**
     * Gets the bid value for this Quote.
     * 
     * @return bid
     */
    public java.math.BigDecimal getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this Quote.
     * 
     * @param bid
     */
    public void setBid(java.math.BigDecimal bid) {
        this.bid = bid;
    }


    /**
     * Gets the offer value for this Quote.
     * 
     * @return offer
     */
    public java.math.BigDecimal getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this Quote.
     * 
     * @param offer
     */
    public void setOffer(java.math.BigDecimal offer) {
        this.offer = offer;
    }


    /**
     * Gets the change value for this Quote.
     * 
     * @return change
     */
    public java.math.BigDecimal getChange() {
        return change;
    }


    /**
     * Sets the change value for this Quote.
     * 
     * @param change
     */
    public void setChange(java.math.BigDecimal change) {
        this.change = change;
    }


    /**
     * Gets the high value for this Quote.
     * 
     * @return high
     */
    public java.math.BigDecimal getHigh() {
        return high;
    }


    /**
     * Sets the high value for this Quote.
     * 
     * @param high
     */
    public void setHigh(java.math.BigDecimal high) {
        this.high = high;
    }


    /**
     * Gets the low value for this Quote.
     * 
     * @return low
     */
    public java.math.BigDecimal getLow() {
        return low;
    }


    /**
     * Sets the low value for this Quote.
     * 
     * @param low
     */
    public void setLow(java.math.BigDecimal low) {
        this.low = low;
    }


    /**
     * Gets the open value for this Quote.
     * 
     * @return open
     */
    public java.math.BigDecimal getOpen() {
        return open;
    }


    /**
     * Sets the open value for this Quote.
     * 
     * @param open
     */
    public void setOpen(java.math.BigDecimal open) {
        this.open = open;
    }


    /**
     * Gets the close value for this Quote.
     * 
     * @return close
     */
    public java.math.BigDecimal getClose() {
        return close;
    }


    /**
     * Sets the close value for this Quote.
     * 
     * @param close
     */
    public void setClose(java.math.BigDecimal close) {
        this.close = close;
    }


    /**
     * Gets the time value for this Quote.
     * 
     * @return time
     */
    public org.apache.axis.types.Time getTime() {
        return time;
    }


    /**
     * Sets the time value for this Quote.
     * 
     * @param time
     */
    public void setTime(org.apache.axis.types.Time time) {
        this.time = time;
    }


    /**
     * Gets the currency value for this Quote.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Quote.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the yield value for this Quote.
     * 
     * @return yield
     */
    public java.math.BigDecimal getYield() {
        return yield;
    }


    /**
     * Sets the yield value for this Quote.
     * 
     * @param yield
     */
    public void setYield(java.math.BigDecimal yield) {
        this.yield = yield;
    }


    /**
     * Gets the ask value for this Quote.
     * 
     * @return ask
     */
    public java.math.BigDecimal getAsk() {
        return ask;
    }


    /**
     * Sets the ask value for this Quote.
     * 
     * @param ask
     */
    public void setAsk(java.math.BigDecimal ask) {
        this.ask = ask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Quote)) return false;
        Quote other = (Quote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.last==null && other.getLast()==null) || 
             (this.last!=null &&
              this.last.equals(other.getLast()))) &&
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.change==null && other.getChange()==null) || 
             (this.change!=null &&
              this.change.equals(other.getChange()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh()))) &&
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            ((this.open==null && other.getOpen()==null) || 
             (this.open!=null &&
              this.open.equals(other.getOpen()))) &&
            ((this.close==null && other.getClose()==null) || 
             (this.close!=null &&
              this.close.equals(other.getClose()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.yield==null && other.getYield()==null) || 
             (this.yield!=null &&
              this.yield.equals(other.getYield()))) &&
            ((this.ask==null && other.getAsk()==null) || 
             (this.ask!=null &&
              this.ask.equals(other.getAsk())));
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
        if (getLast() != null) {
            _hashCode += getLast().hashCode();
        }
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getChange() != null) {
            _hashCode += getChange().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getOpen() != null) {
            _hashCode += getOpen().hashCode();
        }
        if (getClose() != null) {
            _hashCode += getClose().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getYield() != null) {
            _hashCode += getYield().hashCode();
        }
        if (getAsk() != null) {
            _hashCode += getAsk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Quote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", ">Quote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Change"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "High"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Close"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
        elemField.setFieldName("yield");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Yield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Ask"));
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
