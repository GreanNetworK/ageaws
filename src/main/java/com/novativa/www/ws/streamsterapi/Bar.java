/**
 * Bar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novativa.www.ws.streamsterapi;

public class Bar  implements java.io.Serializable {
    private java.util.Calendar barDateTime;

    private java.math.BigDecimal open;

    private java.math.BigDecimal high;

    private java.math.BigDecimal low;

    private java.math.BigDecimal close;

    private java.math.BigDecimal volume;

    public Bar() {
    }

    public Bar(
           java.util.Calendar barDateTime,
           java.math.BigDecimal open,
           java.math.BigDecimal high,
           java.math.BigDecimal low,
           java.math.BigDecimal close,
           java.math.BigDecimal volume) {
           this.barDateTime = barDateTime;
           this.open = open;
           this.high = high;
           this.low = low;
           this.close = close;
           this.volume = volume;
    }


    /**
     * Gets the barDateTime value for this Bar.
     * 
     * @return barDateTime
     */
    public java.util.Calendar getBarDateTime() {
        return barDateTime;
    }


    /**
     * Sets the barDateTime value for this Bar.
     * 
     * @param barDateTime
     */
    public void setBarDateTime(java.util.Calendar barDateTime) {
        this.barDateTime = barDateTime;
    }


    /**
     * Gets the open value for this Bar.
     * 
     * @return open
     */
    public java.math.BigDecimal getOpen() {
        return open;
    }


    /**
     * Sets the open value for this Bar.
     * 
     * @param open
     */
    public void setOpen(java.math.BigDecimal open) {
        this.open = open;
    }


    /**
     * Gets the high value for this Bar.
     * 
     * @return high
     */
    public java.math.BigDecimal getHigh() {
        return high;
    }


    /**
     * Sets the high value for this Bar.
     * 
     * @param high
     */
    public void setHigh(java.math.BigDecimal high) {
        this.high = high;
    }


    /**
     * Gets the low value for this Bar.
     * 
     * @return low
     */
    public java.math.BigDecimal getLow() {
        return low;
    }


    /**
     * Sets the low value for this Bar.
     * 
     * @param low
     */
    public void setLow(java.math.BigDecimal low) {
        this.low = low;
    }


    /**
     * Gets the close value for this Bar.
     * 
     * @return close
     */
    public java.math.BigDecimal getClose() {
        return close;
    }


    /**
     * Sets the close value for this Bar.
     * 
     * @param close
     */
    public void setClose(java.math.BigDecimal close) {
        this.close = close;
    }


    /**
     * Gets the volume value for this Bar.
     * 
     * @return volume
     */
    public java.math.BigDecimal getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this Bar.
     * 
     * @param volume
     */
    public void setVolume(java.math.BigDecimal volume) {
        this.volume = volume;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bar)) return false;
        Bar other = (Bar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.barDateTime==null && other.getBarDateTime()==null) || 
             (this.barDateTime!=null &&
              this.barDateTime.equals(other.getBarDateTime()))) &&
            ((this.open==null && other.getOpen()==null) || 
             (this.open!=null &&
              this.open.equals(other.getOpen()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh()))) &&
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            ((this.close==null && other.getClose()==null) || 
             (this.close!=null &&
              this.close.equals(other.getClose()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume())));
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
        if (getBarDateTime() != null) {
            _hashCode += getBarDateTime().hashCode();
        }
        if (getOpen() != null) {
            _hashCode += getOpen().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getClose() != null) {
            _hashCode += getClose().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Bar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "BarDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "High"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Close"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novativa.com/ws/streamsterapi", "Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
