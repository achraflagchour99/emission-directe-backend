
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchRemisesByNature complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="searchRemisesByNature">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="objetVO" type="{http://ws.pub.services.referentiel.devass.eai/}iEntiteVO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRemisesByNature", propOrder = {
    "objetVO"
})
public class SearchRemisesByNature {

    protected IEntiteVO objetVO;

    /**
     * Obtient la valeur de la propri�t� objetVO.
     * 
     * @return
     *     possible object is
     *     {@link IEntiteVO }
     *     
     */
    public IEntiteVO getObjetVO() {
        return objetVO;
    }

    /**
     * D�finit la valeur de la propri�t� objetVO.
     * 
     * @param value
     *     allowed object is
     *     {@link IEntiteVO }
     *     
     */
    public void setObjetVO(IEntiteVO value) {
        this.objetVO = value;
    }

}
