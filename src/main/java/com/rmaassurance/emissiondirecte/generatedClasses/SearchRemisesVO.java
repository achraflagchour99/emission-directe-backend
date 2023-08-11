
package com.rmaassurance.emissiondirecte.generatedClasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchRemisesVO complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="searchRemisesVO">
 *   <complexContent>
 *     <extension base="{http://ws.pub.services.referentiel.devass.eai/}iEntiteVO">
 *       <sequence>
 *         <element name="agenceVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="banqueVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="compteVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateEncaissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateEtat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="etatSoldeRemise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exercice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="listIntermediaire" type="{http://ws.pub.services.referentiel.devass.eai/}intermediaireVO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="motif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="natureEncaissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenceBordreauxVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="remiseBancaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statutAffectation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRemisesVO", propOrder = {
    "agenceVersement",
    "banqueVersement",
    "codeDirection",
    "codeService",
    "compteVersement",
    "dateEncaissement",
    "dateEtat",
    "etat",
    "etatSoldeRemise",
    "exercice",
    "listIntermediaire",
    "motif",
    "natureEncaissement",
    "numCheque",
    "referenceBordreauxVersement",
    "remiseBancaire",
    "sort",
    "statutAffectation"
})
public class SearchRemisesVO
    extends IEntiteVO
{

    protected String agenceVersement;
    protected String banqueVersement;
    protected String codeDirection;
    protected String codeService;
    protected String compteVersement;
    protected String dateEncaissement;
    protected String dateEtat;
    protected String etat;
    protected String etatSoldeRemise;
    protected String exercice;
    @XmlElement(nillable = true)
    protected List<IntermediaireVO> listIntermediaire;
    protected String motif;
    protected String natureEncaissement;
    protected String numCheque;
    protected String referenceBordreauxVersement;
    protected String remiseBancaire;
    protected String sort;
    protected String statutAffectation;

    /**
     * Obtient la valeur de la propri�t� agenceVersement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenceVersement() {
        return agenceVersement;
    }

    /**
     * D�finit la valeur de la propri�t� agenceVersement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenceVersement(String value) {
        this.agenceVersement = value;
    }

    /**
     * Obtient la valeur de la propri�t� banqueVersement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanqueVersement() {
        return banqueVersement;
    }

    /**
     * D�finit la valeur de la propri�t� banqueVersement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanqueVersement(String value) {
        this.banqueVersement = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeDirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDirection() {
        return codeDirection;
    }

    /**
     * D�finit la valeur de la propri�t� codeDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDirection(String value) {
        this.codeDirection = value;
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
     * Obtient la valeur de la propri�t� compteVersement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteVersement() {
        return compteVersement;
    }

    /**
     * D�finit la valeur de la propri�t� compteVersement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteVersement(String value) {
        this.compteVersement = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateEncaissement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEncaissement() {
        return dateEncaissement;
    }

    /**
     * D�finit la valeur de la propri�t� dateEncaissement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEncaissement(String value) {
        this.dateEncaissement = value;
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
     * Obtient la valeur de la propri�t� etat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * D�finit la valeur de la propri�t� etat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propri�t� etatSoldeRemise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtatSoldeRemise() {
        return etatSoldeRemise;
    }

    /**
     * D�finit la valeur de la propri�t� etatSoldeRemise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtatSoldeRemise(String value) {
        this.etatSoldeRemise = value;
    }

    /**
     * Obtient la valeur de la propri�t� exercice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExercice() {
        return exercice;
    }

    /**
     * D�finit la valeur de la propri�t� exercice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExercice(String value) {
        this.exercice = value;
    }

    /**
     * Gets the value of the listIntermediaire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the listIntermediaire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListIntermediaire().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediaireVO }
     * 
     * 
     * @return
     *     The value of the listIntermediaire property.
     */
    public List<IntermediaireVO> getListIntermediaire() {
        if (listIntermediaire == null) {
            listIntermediaire = new ArrayList<>();
        }
        return this.listIntermediaire;
    }

    /**
     * Obtient la valeur de la propri�t� motif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotif() {
        return motif;
    }

    /**
     * D�finit la valeur de la propri�t� motif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotif(String value) {
        this.motif = value;
    }

    /**
     * Obtient la valeur de la propri�t� natureEncaissement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureEncaissement() {
        return natureEncaissement;
    }

    /**
     * D�finit la valeur de la propri�t� natureEncaissement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureEncaissement(String value) {
        this.natureEncaissement = value;
    }

    /**
     * Obtient la valeur de la propri�t� numCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCheque() {
        return numCheque;
    }

    /**
     * D�finit la valeur de la propri�t� numCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCheque(String value) {
        this.numCheque = value;
    }

    /**
     * Obtient la valeur de la propri�t� referenceBordreauxVersement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceBordreauxVersement() {
        return referenceBordreauxVersement;
    }

    /**
     * D�finit la valeur de la propri�t� referenceBordreauxVersement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceBordreauxVersement(String value) {
        this.referenceBordreauxVersement = value;
    }

    /**
     * Obtient la valeur de la propri�t� remiseBancaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemiseBancaire() {
        return remiseBancaire;
    }

    /**
     * D�finit la valeur de la propri�t� remiseBancaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemiseBancaire(String value) {
        this.remiseBancaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� sort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * D�finit la valeur de la propri�t� sort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
    }

    /**
     * Obtient la valeur de la propri�t� statutAffectation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatutAffectation() {
        return statutAffectation;
    }

    /**
     * D�finit la valeur de la propri�t� statutAffectation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatutAffectation(String value) {
        this.statutAffectation = value;
    }

}
