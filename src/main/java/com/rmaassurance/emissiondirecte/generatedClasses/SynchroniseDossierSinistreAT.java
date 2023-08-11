
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour synchroniseDossierSinistreAT complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="synchroniseDossierSinistreAT">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mapQuery" type="{http://ws.pub.services.referentiel.devass.eai/}adapter" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "synchroniseDossierSinistreAT", propOrder = {
    "mapQuery"
})
public class SynchroniseDossierSinistreAT {

    protected Adapter mapQuery;

    /**
     * Obtient la valeur de la propri�t� mapQuery.
     * 
     * @return
     *     possible object is
     *     {@link Adapter }
     *     
     */
    public Adapter getMapQuery() {
        return mapQuery;
    }

    /**
     * D�finit la valeur de la propri�t� mapQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link Adapter }
     *     
     */
    public void setMapQuery(Adapter value) {
        this.mapQuery = value;
    }

}
