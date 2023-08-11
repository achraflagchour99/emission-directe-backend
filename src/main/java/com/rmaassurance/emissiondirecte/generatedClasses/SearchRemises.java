
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchRemises complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="searchRemises">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="entiteVO" type="{http://ws.pub.services.referentiel.devass.eai/}iEntiteVO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRemises", propOrder = {
    "entiteVO"
})
public class SearchRemises {

    protected IEntiteVO entiteVO;

    /**
     * Obtient la valeur de la propri�t� entiteVO.
     * 
     * @return
     *     possible object is
     *     {@link IEntiteVO }
     *     
     */
    public IEntiteVO getEntiteVO() {
        return entiteVO;
    }

    /**
     * D�finit la valeur de la propri�t� entiteVO.
     * 
     * @param value
     *     allowed object is
     *     {@link IEntiteVO }
     *     
     */
    public void setEntiteVO(IEntiteVO value) {
        this.entiteVO = value;
    }

}
