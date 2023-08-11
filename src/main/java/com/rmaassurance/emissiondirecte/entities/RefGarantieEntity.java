package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "REF_GARANTIE" )
public class RefGarantieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Basic
    @Column(name = "CODE", nullable = true)
    private String code;
    @Basic
    @Column(name = "LIBELLE", nullable = true)
    private String libelle;
    @Basic
    @Column(name = "LIBELLE_ABREGE", nullable = true)
    private String libelleAbrege;
    @Basic
    @Column(name = "PLAFOND", nullable = true)
    private Double plafond;
    @Basic
    @Column(name = "TAUXPRIMECATNAT", nullable = true)
    private Double tauxprimecatnat;
    @Basic
    @Column(name = "TAUXPRIMERCCATNAT", nullable = true)
    private Double tauxprimerccatnat;
    @Basic
    @Column(name = "LIBELLE_AR", nullable = true)
    private String libelleAr;
    @Basic
    @Column(name = "IDTYPEGARANTIE", nullable = true)
    private Long idtypegarantie;
    @Basic
    @Column(name = "CODECOMPTABLE", nullable = true)
    private String codecomptable;
}
