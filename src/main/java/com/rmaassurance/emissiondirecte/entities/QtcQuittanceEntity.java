package com.rmaassurance.emissiondirecte.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "QTC_QUITTANCE" )
@JsonIgnoreProperties(ignoreUnknown = true)
public class QtcQuittanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODESOCIETE")
    private String codesociete;
    @Basic
    @Column(name = "NATUREQUITTANCE")
    private String naturequittance;

    @Basic
    @Column(name = "CODEPOLICE")
    private String codepolice;
    @Basic
    @Column(name = "NUMEROQUITTANCEORIGINE")
    private String numeroquittanceorigine;
    @Basic
    @Column(name = "CODECLIENT" )
    private String codeclient;
    @Basic
    @Column(name = "CODEINTERMEDIAIRE" )
    private Long codeintermediaire;
    @Basic
    @Column(name = "CODEBRANCHE", nullable = true)
    private Long codebranche;
    @Basic
    @Column(name = "NOMCLIENT", nullable = true)
    private String nomclient;
    @Basic
    @Column(name = "PRENOMCLIENT", nullable = true)
    private String prenomclient;
    @Basic
    @Column(name = "ADRESSECLIENT", nullable = true)
    private String adresseclient;

    @Basic
    @Column(name = "TYPEQUITTANCE", nullable = true)
    private String typequittance;
    @Positive
    @Column(name = "PRIMENETTE", nullable = true)
    private Double primenette;
    @Basic
    @Column(name = "TAUXTAXE", nullable = true)
    private Double tauxtaxe;
    @Basic
    @Column(name = "MONTANTTAXE", nullable = true)
    private Double montanttaxe;
    @Basic
    @Column(name = "MONTANTACCESSOIRE", nullable = true)
    private Double montantaccessoire;
    @Basic
    @Column(name = "MONTANTENCAISSE", nullable = true)
    private Double montantencaisse;
    @Basic
    @Column(name = "MONTANTCOMMISIONRETENUE", nullable = true)
    private Double montantcommisionretenue;
    @Basic
    @Column(name = "MONTANTCOMMISIONRISTOURNE", nullable = true)
    private Double montantcommisionristourne;
    @Basic
    @Column(name = "MONTONTREMISE", nullable = true)
    private Double montontremise;
    @Basic
    @Column(name = "PERIODICITE", nullable = true)
    private String periodicite;
    @Basic
    @Column(name = "DATEDEBUT", nullable = true)
    private Date datedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Date datefin;
    @Basic
    @Column(name = "DATEEMISSION", nullable = true)
    private Date dateemission;
    @Basic
    @Column(name = "ETATQUITTANCE", nullable = true)
    private String etatquittance;

    @Basic
    @Column(name = "DATEEFFET", nullable = true)
    private Date dateeffet;
    @Basic
    @Column(name = "IDOPERATIONPRELEVEMENT", nullable = true)
    private Long idoperationprelevement;
    @Basic
    @Column(name = "IDUTILISATEURRISTOURNE", nullable = true)
    private Long idutilisateurristourne;
    @Basic
    @Column(name = "IDUTILISATEURVALIDATEUR", nullable = true)
    private Long idutilisateurvalidateur;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Long idproduit;

    @Basic
    @Column(name = "TAUXCOMMISSION", nullable = true)
    private Double tauxcommission;
    @Basic
    @Column(name = "MONTANTCOMMISSION", nullable = true)
    private Double montantcommission;
    @Basic
    @Column(name = "SYNCHRONE", nullable = true)
    private Long synchrone;
    @Basic
    @Column(name = "DATESYNCHRONISATION", nullable = true)
    private Date datesynchronisation;
    @Basic
    @Column(name = "MONTANTCOMMISION", nullable = true)
    private Double montantcommision;
    @Basic
    @Column(name = "NUMEROQUITTANCE_OLD", nullable = true)
    private Long numeroquittanceOld;
    @Basic
    @Column(name = "DATEVALIDATION", nullable = true)
    private Date datevalidation;
    @Basic
    @Column(name = "MONTANTTAXEPARAFISCALE", nullable = true)
    private Double montanttaxeparafiscale;
    @Basic
    @Column(name = "TAUXCOMMISSIONCATNAT", nullable = true)
    private Double tauxcommissioncatnat;
    @Basic
    @Column(name = "IDQUITTANCEORIGINE", nullable = true)
    private Long idquittanceorigine;
    @Basic
    @Column(name = "TYPEQUITTANCEPREVOYANCE", nullable = true)
    private String typequittanceprevoyance;
    @Basic
    @Column(name = "FORCEE", nullable = true)
    private Long forcee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Intermediaire_ID")
    private IntermediaireEntity intermediaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refQuittance_id")
    private RefQuittanceEntity refQuittance;





    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDREMISE")
    private QtcRemiseEntity qtcRemise;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habUtilisateur")
    private HabUtilisateurEntity habUtilisateur;

    /*Ajouter*/
    @Column(name = "VILLECLIENT")
    private String VILLECLIENT;
   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VILLECLIENT")
    private RefVilleEntity ville;*/

    private String exercice;
    private String ordre;

    private Date dateEcheance;
    private Date dateTerme;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "police_id")
    private PoliceEntity police;


    @Basic
    @Column(name = "DATEETAT", nullable = true)
    private Date dateetat;

    @Basic
    @Column(name = "NUMEROQUITTANCE", nullable = true)
    private String numeroquittance;


    @Basic
    @Column(name = "TauxPrimeNette")
    private Double tauxPrimeNette;

    @Basic
    @Column(name = "PrimeGareEve ")
    private Double primeGareEve ;


    @Basic
    @Column(name = "TauxTaxeParafiscale ")
    private Double tauxTaxeParafiscale;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prdVersioncommerciale")
    private PrdVersioncommercialeEntity prdVersioncommerciale;

    @Basic
    @Column(name = "TauxPrimeEVE", nullable = true)
    private Double TauxPrimeEVE;




}
