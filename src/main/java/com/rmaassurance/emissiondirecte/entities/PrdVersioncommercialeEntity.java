package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

@Entity
@Data
@Table(name = "PRD_VERSIONCOMMERCIALE", schema = "CONVERGPARAM")
public class PrdVersioncommercialeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "NOMCOMMERCIAL", nullable = true)
    private String nomcommercial;
    @Basic
    @Column(name = "DATEEDEBUT", nullable = true)
    private LocalDateTime dateedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private LocalDateTime  datefin;
    @Basic
    @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
    private String comptebancaireprestation;
    @Basic
    @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
    private String comptebancaireservice;
    @Basic
    @Column(name = "REFHOMOLOGATION", nullable = true)
    private String refhomologation;
    @Basic
    @Column(name = "CODEINTERMEDIAIRE", nullable = true)
    private Integer codeintermediaire;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Long idproduit;
    @Basic
    @Column(name = "IDSOCIETE", nullable = true)
    private Long idsociete;
    @Basic
    @Column(name = "DELAIMODIFENINSTANCE", nullable = true)
    private Integer delaimodifeninstance;

    @Column(name = "NOMBREMAXADHESION")
    private Long nombremaxadhesion;
    @Basic
    @Column(name = "CODE", nullable = true)
    private String code;
    @Basic
    @Column(name = "NOMCOMMERCIAL_AR", nullable = true)
    private String nomcommercialAr;
    @Basic
    @Column(name = "PLAFONDINDEMNITE", nullable = true)
    private Double plafondindemnite;
    @Basic
    @Column(name = "DATEMAJPRODUIT", nullable = true)
    private LocalDateTime datemajproduit;

    @Column(name = "EMIS_DIRECTE", nullable = true)
    private int directe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intermediaire", referencedColumnName = "ID")
    private IntermediaireEntity intermediaire;


    /*@OneToMany(mappedBy = "prdVersioncommerciale", fetch = FetchType.LAZY)
    private List<PoliceEntity> polices;*/
}