//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumerIncentiveTacticTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DisplayTacticTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FeatureTacticTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TradeItemPackingLabelingTypeCodeType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for EventTacticEnumerationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTacticEnumerationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerIncentiveTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DisplayTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeatureTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeItemPackingLabelingTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTacticEnumerationType", propOrder = {
    "consumerIncentiveTacticTypeCode",
    "displayTacticTypeCode",
    "featureTacticTypeCode",
    "tradeItemPackingLabelingTypeCode"
})
public class EventTacticEnumerationType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ConsumerIncentiveTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumerIncentiveTacticTypeCodeType consumerIncentiveTacticTypeCode;
    @XmlElement(name = "DisplayTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DisplayTacticTypeCodeType displayTacticTypeCode;
    @XmlElement(name = "FeatureTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FeatureTacticTypeCodeType featureTacticTypeCode;
    @XmlElement(name = "TradeItemPackingLabelingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TradeItemPackingLabelingTypeCodeType tradeItemPackingLabelingTypeCode;

    /**
     * Gets the value of the consumerIncentiveTacticTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerIncentiveTacticTypeCodeType }
     *     
     */
    public ConsumerIncentiveTacticTypeCodeType getConsumerIncentiveTacticTypeCode() {
        return consumerIncentiveTacticTypeCode;
    }

    /**
     * Sets the value of the consumerIncentiveTacticTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerIncentiveTacticTypeCodeType }
     *     
     */
    public void setConsumerIncentiveTacticTypeCode(ConsumerIncentiveTacticTypeCodeType value) {
        this.consumerIncentiveTacticTypeCode = value;
    }

    /**
     * Gets the value of the displayTacticTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTacticTypeCodeType }
     *     
     */
    public DisplayTacticTypeCodeType getDisplayTacticTypeCode() {
        return displayTacticTypeCode;
    }

    /**
     * Sets the value of the displayTacticTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTacticTypeCodeType }
     *     
     */
    public void setDisplayTacticTypeCode(DisplayTacticTypeCodeType value) {
        this.displayTacticTypeCode = value;
    }

    /**
     * Gets the value of the featureTacticTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTacticTypeCodeType }
     *     
     */
    public FeatureTacticTypeCodeType getFeatureTacticTypeCode() {
        return featureTacticTypeCode;
    }

    /**
     * Sets the value of the featureTacticTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTacticTypeCodeType }
     *     
     */
    public void setFeatureTacticTypeCode(FeatureTacticTypeCodeType value) {
        this.featureTacticTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemPackingLabelingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemPackingLabelingTypeCodeType }
     *     
     */
    public TradeItemPackingLabelingTypeCodeType getTradeItemPackingLabelingTypeCode() {
        return tradeItemPackingLabelingTypeCode;
    }

    /**
     * Sets the value of the tradeItemPackingLabelingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemPackingLabelingTypeCodeType }
     *     
     */
    public void setTradeItemPackingLabelingTypeCode(TradeItemPackingLabelingTypeCodeType value) {
        this.tradeItemPackingLabelingTypeCode = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            ConsumerIncentiveTacticTypeCodeType theConsumerIncentiveTacticTypeCode;
            theConsumerIncentiveTacticTypeCode = this.getConsumerIncentiveTacticTypeCode();
            strategy.appendField(locator, this, "consumerIncentiveTacticTypeCode", buffer, theConsumerIncentiveTacticTypeCode);
        }
        {
            DisplayTacticTypeCodeType theDisplayTacticTypeCode;
            theDisplayTacticTypeCode = this.getDisplayTacticTypeCode();
            strategy.appendField(locator, this, "displayTacticTypeCode", buffer, theDisplayTacticTypeCode);
        }
        {
            FeatureTacticTypeCodeType theFeatureTacticTypeCode;
            theFeatureTacticTypeCode = this.getFeatureTacticTypeCode();
            strategy.appendField(locator, this, "featureTacticTypeCode", buffer, theFeatureTacticTypeCode);
        }
        {
            TradeItemPackingLabelingTypeCodeType theTradeItemPackingLabelingTypeCode;
            theTradeItemPackingLabelingTypeCode = this.getTradeItemPackingLabelingTypeCode();
            strategy.appendField(locator, this, "tradeItemPackingLabelingTypeCode", buffer, theTradeItemPackingLabelingTypeCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EventTacticEnumerationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EventTacticEnumerationType that = ((EventTacticEnumerationType) object);
        {
            ConsumerIncentiveTacticTypeCodeType lhsConsumerIncentiveTacticTypeCode;
            lhsConsumerIncentiveTacticTypeCode = this.getConsumerIncentiveTacticTypeCode();
            ConsumerIncentiveTacticTypeCodeType rhsConsumerIncentiveTacticTypeCode;
            rhsConsumerIncentiveTacticTypeCode = that.getConsumerIncentiveTacticTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerIncentiveTacticTypeCode", lhsConsumerIncentiveTacticTypeCode), LocatorUtils.property(thatLocator, "consumerIncentiveTacticTypeCode", rhsConsumerIncentiveTacticTypeCode), lhsConsumerIncentiveTacticTypeCode, rhsConsumerIncentiveTacticTypeCode)) {
                return false;
            }
        }
        {
            DisplayTacticTypeCodeType lhsDisplayTacticTypeCode;
            lhsDisplayTacticTypeCode = this.getDisplayTacticTypeCode();
            DisplayTacticTypeCodeType rhsDisplayTacticTypeCode;
            rhsDisplayTacticTypeCode = that.getDisplayTacticTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayTacticTypeCode", lhsDisplayTacticTypeCode), LocatorUtils.property(thatLocator, "displayTacticTypeCode", rhsDisplayTacticTypeCode), lhsDisplayTacticTypeCode, rhsDisplayTacticTypeCode)) {
                return false;
            }
        }
        {
            FeatureTacticTypeCodeType lhsFeatureTacticTypeCode;
            lhsFeatureTacticTypeCode = this.getFeatureTacticTypeCode();
            FeatureTacticTypeCodeType rhsFeatureTacticTypeCode;
            rhsFeatureTacticTypeCode = that.getFeatureTacticTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureTacticTypeCode", lhsFeatureTacticTypeCode), LocatorUtils.property(thatLocator, "featureTacticTypeCode", rhsFeatureTacticTypeCode), lhsFeatureTacticTypeCode, rhsFeatureTacticTypeCode)) {
                return false;
            }
        }
        {
            TradeItemPackingLabelingTypeCodeType lhsTradeItemPackingLabelingTypeCode;
            lhsTradeItemPackingLabelingTypeCode = this.getTradeItemPackingLabelingTypeCode();
            TradeItemPackingLabelingTypeCodeType rhsTradeItemPackingLabelingTypeCode;
            rhsTradeItemPackingLabelingTypeCode = that.getTradeItemPackingLabelingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeItemPackingLabelingTypeCode", lhsTradeItemPackingLabelingTypeCode), LocatorUtils.property(thatLocator, "tradeItemPackingLabelingTypeCode", rhsTradeItemPackingLabelingTypeCode), lhsTradeItemPackingLabelingTypeCode, rhsTradeItemPackingLabelingTypeCode)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            ConsumerIncentiveTacticTypeCodeType theConsumerIncentiveTacticTypeCode;
            theConsumerIncentiveTacticTypeCode = this.getConsumerIncentiveTacticTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerIncentiveTacticTypeCode", theConsumerIncentiveTacticTypeCode), currentHashCode, theConsumerIncentiveTacticTypeCode);
        }
        {
            DisplayTacticTypeCodeType theDisplayTacticTypeCode;
            theDisplayTacticTypeCode = this.getDisplayTacticTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayTacticTypeCode", theDisplayTacticTypeCode), currentHashCode, theDisplayTacticTypeCode);
        }
        {
            FeatureTacticTypeCodeType theFeatureTacticTypeCode;
            theFeatureTacticTypeCode = this.getFeatureTacticTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureTacticTypeCode", theFeatureTacticTypeCode), currentHashCode, theFeatureTacticTypeCode);
        }
        {
            TradeItemPackingLabelingTypeCodeType theTradeItemPackingLabelingTypeCode;
            theTradeItemPackingLabelingTypeCode = this.getTradeItemPackingLabelingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeItemPackingLabelingTypeCode", theTradeItemPackingLabelingTypeCode), currentHashCode, theTradeItemPackingLabelingTypeCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}