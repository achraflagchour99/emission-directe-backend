package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;

@Entity
@Data
@Table(name = "QTC_GARANTIES" )
public class QtcGarantiesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "CODE", nullable = true)
    private String code;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private String libelle;
    @Basic
    @Column(name = "TAUX", nullable = true)
    private Double taux;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Long idproduit;
    @Basic
    @Column(name = "IDPARAMETRESEPARGNE", nullable = true)
    private Long idparametresepargne;
    @Basic
    @Column(name = "IDPARAMETRESPREVOYANCE", nullable = true)
    private Long idparametresprevoyance;
    @Basic
    @Column(name = "IDPARAMETRESDOMMAGES", nullable = true)
    private Long idparametresdommages;
    @Basic
    @Column(name = "DATEDEBUT", nullable = true)
    private Calendar datedebut;
    @Basic
    @Column(name = "DATEFIN", nullable = true)
    private Calendar datefin;
    @Basic
    @Column(name = "FORMULE", nullable = true)
    private String formule;
    @Basic
    @Column(name = "IDGARANTIE", nullable = true)
    private Long idgarantie;
    @Basic
    @Column(name = "USECATNAT", nullable = true)
    private String usecatnat;
    @Basic
    @Column(name = "TAUXVENTILATION", nullable = true)
    private Double tauxventilation;
    @Basic
    @Column(name = "CATEGORIEACAPS", nullable = true)
    private String categorieacaps;



}
