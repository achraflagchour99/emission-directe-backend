
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour villeVO complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="villeVO">
 *   <complexContent>
 *     <extension base="{http://ws.pub.services.referentiel.devass.eai/}iEntiteVO">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refPays" type="{http://ws.pub.services.referentiel.devass.eai/}paysVO" minOccurs="0"/>
 *         <element name="refRegion" type="{http://ws.pub.services.referentiel.devass.eai/}regionVO" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "villeVO", propOrder = {
    "code",
    "libelle",
    "refPays",
    "refRegion"
})
public class VilleVO
    extends IEntiteVO
{

    protected String code;
    protected String libelle;
    protected PaysVO refPays;
    protected RegionVO refRegion;

    /**
     * Obtient la valeur de la propri�t� code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * D�finit la valeur de la propri�t� code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propri�t� libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * D�finit la valeur de la propri�t� libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propri�t� refPays.
     * 
     * @return
     *     possible object is
     *     {@link PaysVO }
     *     
     */
    public PaysVO getRefPays() {
        return refPays;
    }

    /**
     * D�finit la valeur de la propri�t� refPays.
     * 
     * @param value
     *     allowed object is
     *     {@link PaysVO }
     *     
     */
    public void setRefPays(PaysVO value) {
        this.refPays = value;
    }

    /**
     * Obtient la valeur de la propri�t� refRegion.
     * 
     * @return
     *     possible object is
     *     {@link RegionVO }
     *     
     */
    public RegionVO getRefRegion() {
        return refRegion;
    }

    /**
     * D�finit la valeur de la propri�t� refRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionVO }
     *     
     */
    public void setRefRegion(RegionVO value) {
        this.refRegion = value;
    }

}
