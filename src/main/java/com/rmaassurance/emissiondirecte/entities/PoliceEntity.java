package com.rmaassurance.emissiondirecte.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "POLICE", schema = "CONVERGPARAM")
public class PoliceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String codePolice;
    @NotNull
    private Long numClient ;
    @NotNull
    private String raisonSociale ;
    @NotNull
    private String adresse ;

    private Date dateEffet;

    private Date dateEcheance;

    private Double primeNette;
    private Double taxe ;
    private Double acce ;
    private Double tauxComm ;
    private Date dateTerme ;
    private  Date dateEtat;
    private Double nbrtete ;
    private Double revenueAnnuel ;
    private Double dureeS ;
    private Double ff ;
    private Double mnt_taxe_eve ;
    private Double mnt_taxe_parafiscale ;
    private String terme;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terme_id")
    private TermeEntity typeTerme;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quittance_id")
    private QtcQuittanceEntity quittance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ville_id")
    private RefVilleEntity refVille;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Ref_Police_ID")
    private RefPoliceEntity refPolice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Periodicite_id")
    private PeriodiciteEntity periodicite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRD_VERSION_COMMERCIALE_ID")
    private PrdVersioncommercialeEntity prdVersioncommerciale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERMEDIAIRE_ID")
    private IntermediaireEntity intermediaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HAB_UTILISATEUR")
    private HabUtilisateurEntity habUtilisateur;



}
