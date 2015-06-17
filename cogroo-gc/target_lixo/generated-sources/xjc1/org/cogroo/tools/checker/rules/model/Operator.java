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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * And / Or operators
 * 
 * <p>Java class for Operator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PatternElement" type="{}PatternElement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operator", propOrder = {
    "patternElement"
})
public class Operator
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PatternElement", required = true)
    protected List<PatternElement> patternElement;

    /**
     * Gets the value of the patternElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatternElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatternElement }
     * 
     * 
     */
    public List<PatternElement> getPatternElement() {
        if (patternElement == null) {
            patternElement = new ArrayList<PatternElement>();
        }
        return this.patternElement;
    }

}
