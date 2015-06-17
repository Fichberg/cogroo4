//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 01:24:02 PM BRT 
//


package org.cogroo.tools.checker.rules.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Property" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SyntacticFunction"/>
 *               &lt;enumeration value="ChunkFunction"/>
 *               &lt;enumeration value="Class"/>
 *               &lt;enumeration value="Gender"/>
 *               &lt;enumeration value="Number"/>
 *               &lt;enumeration value="Case"/>
 *               &lt;enumeration value="Person"/>
 *               &lt;enumeration value="Tense"/>
 *               &lt;enumeration value="Mood"/>
 *               &lt;enumeration value="Finiteness"/>
 *               &lt;enumeration value="Punctuation"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "property"
})
public class Reference
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Property", required = true)
    protected List<Reference.Property> property;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long index;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference.Property }
     * 
     * 
     */
    public List<Reference.Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Reference.Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(long value) {
        this.index = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="SyntacticFunction"/>
     *     &lt;enumeration value="ChunkFunction"/>
     *     &lt;enumeration value="Class"/>
     *     &lt;enumeration value="Gender"/>
     *     &lt;enumeration value="Number"/>
     *     &lt;enumeration value="Case"/>
     *     &lt;enumeration value="Person"/>
     *     &lt;enumeration value="Tense"/>
     *     &lt;enumeration value="Mood"/>
     *     &lt;enumeration value="Finiteness"/>
     *     &lt;enumeration value="Punctuation"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Property {

        @XmlEnumValue("SyntacticFunction")
        SYNTACTIC_FUNCTION("SyntacticFunction"),
        @XmlEnumValue("ChunkFunction")
        CHUNK_FUNCTION("ChunkFunction"),
        @XmlEnumValue("Class")
        CLASS("Class"),
        @XmlEnumValue("Gender")
        GENDER("Gender"),
        @XmlEnumValue("Number")
        NUMBER("Number"),
        @XmlEnumValue("Case")
        CASE("Case"),
        @XmlEnumValue("Person")
        PERSON("Person"),
        @XmlEnumValue("Tense")
        TENSE("Tense"),
        @XmlEnumValue("Mood")
        MOOD("Mood"),
        @XmlEnumValue("Finiteness")
        FINITENESS("Finiteness"),
        @XmlEnumValue("Punctuation")
        PUNCTUATION("Punctuation");
        private final String value;

        Property(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Reference.Property fromValue(String v) {
            for (Reference.Property c: Reference.Property.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
