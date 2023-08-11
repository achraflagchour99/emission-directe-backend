
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchNumeroDemandeVO complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="searchNumeroDemandeVO">
 *   <complexContent>
 *     <extension base="{http://ws.pub.services.referentiel.devass.eai/}iEntiteVO">
 *       <sequence>
 *         <element name="codeBranche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeSocite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateEtat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="etatQuittance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exercie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="modeReglment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numDemande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numQuittance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ordre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchNumeroDemandeVO", propOrder = {
    "codeBranche",
    "codeService",
    "codeSocite",
    "dateEtat",
    "etatQuittance",
    "exercie",
    "modeReglment",
    "mois",
    "numDemande",
    "numQuittance",
    "ordre"
})
public class SearchNumeroDemandeVO
    extends IEntiteVO
{

    protected String codeBranche;
    protected String codeService;
    protected String codeSocite;
    protected String dateEtat;
    protected String etatQuittance;
    protected String exercie;
    protected String modeReglment;
    protected String mois;
    protected String numDemande;
    protected String numQuittance;
    protected String ordre;

    /**
     * Obtient la valeur de la propri�t� codeBranche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBranche() {
        return codeBranche;
    }

    /**
     * D�finit la valeur de la propri�t� codeBranche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBranche(String value) {
        this.codeBranche = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeService() {
        return codeService;
    }

    /**
     * D�finit la valeur de la propri�t� codeService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeService(String value) {
        this.codeService = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeSocite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSocite() {
        return codeSocite;
    }

    /**
     * D�finit la valeur de la propri�t� codeSocite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSocite(String value) {
        this.codeSocite = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateEtat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEtat() {
        return dateEtat;
    }

    /**
     * D�finit la valeur de la propri�t� dateEtat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEtat(String value) {
        this.dateEtat = value;
    }

    /**
     * Obtient la valeur de la propri�t� etatQuittance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtatQuittance() {
        return etatQuittance;
    }

    /**
     * D�finit la valeur de la propri�t� etatQuittance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtatQuittance(String value) {
        this.etatQuittance = value;
    }

    /**
     * Obtient la valeur de la propri�t� exercie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExercie() {
        return exercie;
    }

    /**
     * D�finit la valeur de la propri�t� exercie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExercie(String value) {
        this.exercie = value;
    }

    /**
     * Obtient la valeur de la propri�t� modeReglment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeReglment() {
        return modeReglment;
    }

    /**
     * D�finit la valeur de la propri�t� modeReglment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeReglment(String value) {
        this.modeReglment = value;
    }

    /**
     * Obtient la valeur de la propri�t� mois.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMois() {
        return mois;
    }

    /**
     * D�finit la valeur de la propri�t� mois.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMois(String value) {
        this.mois = value;
    }

    /**
     * Obtient la valeur de la propri�t� numDemande.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDemande() {
        return numDemande;
    }

    /**
     * D�finit la valeur de la propri�t� numDemande.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDemande(String value) {
        this.numDemande = value;
    }

    /**
     * Obtient la valeur de la propri�t� numQuittance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumQuittance() {
        return numQuittance;
    }

    /**
     * D�finit la valeur de la propri�t� numQuittance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumQuittance(String value) {
        this.numQuittance = value;
    }

    /**
     * Obtient la valeur de la propri�t� ordre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdre() {
        return ordre;
    }

    /**
     * D�finit la valeur de la propri�t� ordre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdre(String value) {
        this.ordre = value;
    }

}
