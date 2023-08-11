
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour myEntry complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="myEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fKey" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         <element name="fValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myEntry", propOrder = {
    "fKey",
    "fValue"
})
public class MyEntry {

    protected Object fKey;
    protected Object fValue;

    /**
     * Obtient la valeur de la propri�t� fKey.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFKey() {
        return fKey;
    }

    /**
     * D�finit la valeur de la propri�t� fKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFKey(Object value) {
        this.fKey = value;
    }

    /**
     * Obtient la valeur de la propri�t� fValue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFValue() {
        return fValue;
    }

    /**
     * D�finit la valeur de la propri�t� fValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFValue(Object value) {
        this.fValue = value;
    }

}
