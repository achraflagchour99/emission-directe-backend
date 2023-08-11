
package com.rmaassurance.emissiondirecte.generatedClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour remisesBancairesVO complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="remisesBancairesVO">
 *   <complexContent>
 *     <extension base="{http://ws.pub.services.referentiel.devass.eai/}iEntiteVO">
 *       <sequence>
 *         <element name="agence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="agenceVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="avecValidation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="banqueCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="banqueVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeIntermediaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeMonnaie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codePayeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="compteCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="compteVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateAffectation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateComptable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateEncaissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateEtat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateValeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="emplacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exercice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="importPPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="libelleRemise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lieu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="montantRemise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="motif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="natureEncaissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nomPayeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numeroCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numeroRemise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ordre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilUtilisateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refBordereaux" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refBordereauxVersement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="referenceEffet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="remiseBancaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="remiseInitiale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="soldeRemise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statutAffectations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typeEncaissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="utilisateur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="villeCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remisesBancairesVO", propOrder = {
    "agence",
    "agenceVersement",
    "avecValidation",
    "banqueCheque",
    "banqueVersement",
    "client",
    "codeDirection",
    "codeIntermediaire",
    "codeMonnaie",
    "codePayeur",
    "codeService",
    "compteCheque",
    "compteVersement",
    "dateAffectation",
    "dateComptable",
    "dateEncaissement",
    "dateEtat",
    "dateValeur",
    "dateVersement",
    "emplacement",
    "etat",
    "exercice",
    "importPPR",
    "libelleRemise",
    "lieu",
    "montantRemise",
    "motif",
    "natureEncaissement",
    "nomPayeur",
    "numeroCheque",
    "numeroRemise",
    "observation",
    "ordre",
    "profilUtilisateur",
    "refBordereaux",
    "refBordereauxVersement",
    "referenceEffet",
    "remiseBancaire",
    "remiseInitiale",
    "sop",
    "soldeRemise",
    "sort",
    "statutAffectations",
    "typeEncaissement",
    "utilisateur",
    "villeCheque"
})
public class RemisesBancairesVO
    extends IEntiteVO
{

    protected String agence;
    protected String agenceVersement;
    protected String avecValidation;
    protected String banqueCheque;
    protected String banqueVersement;
    protected String client;
    protected String codeDirection;
    protected String codeIntermediaire;
    protected String codeMonnaie;
    protected String codePayeur;
    protected String codeService;
    protected String compteCheque;
    protected String compteVersement;
    protected String dateAffectation;
    protected String dateComptable;
    protected String dateEncaissement;
    protected String dateEtat;
    protected String dateValeur;
    protected String dateVersement;
    protected String emplacement;
    protected String etat;
    protected String exercice;
    protected String importPPR;
    protected String libelleRemise;
    protected String lieu;
    protected String montantRemise;
    protected String motif;
    protected String natureEncaissement;
    protected String nomPayeur;
    protected String numeroCheque;
    protected String numeroRemise;
    protected String observation;
    protected String ordre;
    protected String profilUtilisateur;
    protected String refBordereaux;
    protected String refBordereauxVersement;
    protected String referenceEffet;
    protected String remiseBancaire;
    protected String remiseInitiale;
    @XmlElement(name = "SOP")
    protected String sop;
    protected String soldeRemise;
    protected String sort;
    protected String statutAffectations;
    protected String typeEncaissement;
    protected String utilisateur;
    protected String villeCheque;

    /**
     * Obtient la valeur de la propri�t� agence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgence() {
        return agence;
    }

    /**
     * D�finit la valeur de la propri�t� agence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgence(String value) {
        this.agence = value;
    }

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
     * Obtient la valeur de la propri�t� avecValidation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvecValidation() {
        return avecValidation;
    }

    /**
     * D�finit la valeur de la propri�t� avecValidation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvecValidation(String value) {
        this.avecValidation = value;
    }

    /**
     * Obtient la valeur de la propri�t� banqueCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanqueCheque() {
        return banqueCheque;
    }

    /**
     * D�finit la valeur de la propri�t� banqueCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanqueCheque(String value) {
        this.banqueCheque = value;
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
     * Obtient la valeur de la propri�t� client.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * D�finit la valeur de la propri�t� client.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
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
     * Obtient la valeur de la propri�t� codeIntermediaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeIntermediaire() {
        return codeIntermediaire;
    }

    /**
     * D�finit la valeur de la propri�t� codeIntermediaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeIntermediaire(String value) {
        this.codeIntermediaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeMonnaie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeMonnaie() {
        return codeMonnaie;
    }

    /**
     * D�finit la valeur de la propri�t� codeMonnaie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeMonnaie(String value) {
        this.codeMonnaie = value;
    }

    /**
     * Obtient la valeur de la propri�t� codePayeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePayeur() {
        return codePayeur;
    }

    /**
     * D�finit la valeur de la propri�t� codePayeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePayeur(String value) {
        this.codePayeur = value;
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
     * Obtient la valeur de la propri�t� compteCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompteCheque() {
        return compteCheque;
    }

    /**
     * D�finit la valeur de la propri�t� compteCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompteCheque(String value) {
        this.compteCheque = value;
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
     * Obtient la valeur de la propri�t� dateAffectation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAffectation() {
        return dateAffectation;
    }

    /**
     * D�finit la valeur de la propri�t� dateAffectation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAffectation(String value) {
        this.dateAffectation = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateComptable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateComptable() {
        return dateComptable;
    }

    /**
     * D�finit la valeur de la propri�t� dateComptable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateComptable(String value) {
        this.dateComptable = value;
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
     * Obtient la valeur de la propri�t� dateValeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateValeur() {
        return dateValeur;
    }

    /**
     * D�finit la valeur de la propri�t� dateValeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateValeur(String value) {
        this.dateValeur = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateVersement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateVersement() {
        return dateVersement;
    }

    /**
     * D�finit la valeur de la propri�t� dateVersement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateVersement(String value) {
        this.dateVersement = value;
    }

    /**
     * Obtient la valeur de la propri�t� emplacement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplacement() {
        return emplacement;
    }

    /**
     * D�finit la valeur de la propri�t� emplacement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplacement(String value) {
        this.emplacement = value;
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
     * Obtient la valeur de la propri�t� importPPR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportPPR() {
        return importPPR;
    }

    /**
     * D�finit la valeur de la propri�t� importPPR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportPPR(String value) {
        this.importPPR = value;
    }

    /**
     * Obtient la valeur de la propri�t� libelleRemise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelleRemise() {
        return libelleRemise;
    }

    /**
     * D�finit la valeur de la propri�t� libelleRemise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelleRemise(String value) {
        this.libelleRemise = value;
    }

    /**
     * Obtient la valeur de la propri�t� lieu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * D�finit la valeur de la propri�t� lieu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieu(String value) {
        this.lieu = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantRemise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontantRemise() {
        return montantRemise;
    }

    /**
     * D�finit la valeur de la propri�t� montantRemise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontantRemise(String value) {
        this.montantRemise = value;
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
     * Obtient la valeur de la propri�t� nomPayeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPayeur() {
        return nomPayeur;
    }

    /**
     * D�finit la valeur de la propri�t� nomPayeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPayeur(String value) {
        this.nomPayeur = value;
    }

    /**
     * Obtient la valeur de la propri�t� numeroCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCheque() {
        return numeroCheque;
    }

    /**
     * D�finit la valeur de la propri�t� numeroCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCheque(String value) {
        this.numeroCheque = value;
    }

    /**
     * Obtient la valeur de la propri�t� numeroRemise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRemise() {
        return numeroRemise;
    }

    /**
     * D�finit la valeur de la propri�t� numeroRemise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRemise(String value) {
        this.numeroRemise = value;
    }

    /**
     * Obtient la valeur de la propri�t� observation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservation() {
        return observation;
    }

    /**
     * D�finit la valeur de la propri�t� observation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservation(String value) {
        this.observation = value;
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

    /**
     * Obtient la valeur de la propri�t� profilUtilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilUtilisateur() {
        return profilUtilisateur;
    }

    /**
     * D�finit la valeur de la propri�t� profilUtilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilUtilisateur(String value) {
        this.profilUtilisateur = value;
    }

    /**
     * Obtient la valeur de la propri�t� refBordereaux.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefBordereaux() {
        return refBordereaux;
    }

    /**
     * D�finit la valeur de la propri�t� refBordereaux.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefBordereaux(String value) {
        this.refBordereaux = value;
    }

    /**
     * Obtient la valeur de la propri�t� refBordereauxVersement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefBordereauxVersement() {
        return refBordereauxVersement;
    }

    /**
     * D�finit la valeur de la propri�t� refBordereauxVersement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefBordereauxVersement(String value) {
        this.refBordereauxVersement = value;
    }

    /**
     * Obtient la valeur de la propri�t� referenceEffet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceEffet() {
        return referenceEffet;
    }

    /**
     * D�finit la valeur de la propri�t� referenceEffet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceEffet(String value) {
        this.referenceEffet = value;
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
     * Obtient la valeur de la propri�t� remiseInitiale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemiseInitiale() {
        return remiseInitiale;
    }

    /**
     * D�finit la valeur de la propri�t� remiseInitiale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemiseInitiale(String value) {
        this.remiseInitiale = value;
    }

    /**
     * Obtient la valeur de la propri�t� sop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOP() {
        return sop;
    }

    /**
     * D�finit la valeur de la propri�t� sop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOP(String value) {
        this.sop = value;
    }

    /**
     * Obtient la valeur de la propri�t� soldeRemise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldeRemise() {
        return soldeRemise;
    }

    /**
     * D�finit la valeur de la propri�t� soldeRemise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldeRemise(String value) {
        this.soldeRemise = value;
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
     * Obtient la valeur de la propri�t� statutAffectations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatutAffectations() {
        return statutAffectations;
    }

    /**
     * D�finit la valeur de la propri�t� statutAffectations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatutAffectations(String value) {
        this.statutAffectations = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeEncaissement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEncaissement() {
        return typeEncaissement;
    }

    /**
     * D�finit la valeur de la propri�t� typeEncaissement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEncaissement(String value) {
        this.typeEncaissement = value;
    }

    /**
     * Obtient la valeur de la propri�t� utilisateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtilisateur() {
        return utilisateur;
    }

    /**
     * D�finit la valeur de la propri�t� utilisateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtilisateur(String value) {
        this.utilisateur = value;
    }

    /**
     * Obtient la valeur de la propri�t� villeCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleCheque() {
        return villeCheque;
    }

    /**
     * D�finit la valeur de la propri�t� villeCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleCheque(String value) {
        this.villeCheque = value;
    }

}
