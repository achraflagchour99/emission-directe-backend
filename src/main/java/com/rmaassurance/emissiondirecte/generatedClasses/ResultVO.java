
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour resultVO complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="resultVO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasErrorMessages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="result" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         <element name="warning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultVO", propOrder = {
    "error",
    "hasErrorMessages",
    "info",
    "result",
    "warning"
})
public class ResultVO {

    protected String error;
    protected boolean hasErrorMessages;
    protected String info;
    protected Object result;
    protected String warning;

    /**
     * Obtient la valeur de la propri�t� error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * D�finit la valeur de la propri�t� error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtient la valeur de la propri�t� hasErrorMessages.
     * 
     */
    public boolean isHasErrorMessages() {
        return hasErrorMessages;
    }

    /**
     * D�finit la valeur de la propri�t� hasErrorMessages.
     * 
     */
    public void setHasErrorMessages(boolean value) {
        this.hasErrorMessages = value;
    }

    /**
     * Obtient la valeur de la propri�t� info.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * D�finit la valeur de la propri�t� info.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Obtient la valeur de la propri�t� result.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResult() {
        return result;
    }

    /**
     * D�finit la valeur de la propri�t� result.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResult(Object value) {
        this.result = value;
    }

    /**
     * Obtient la valeur de la propri�t� warning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * D�finit la valeur de la propri�t� warning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

}
