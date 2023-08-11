package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Calendar;

@Entity
@Data
@Table(name = "HAB_UTILISATEUR", schema = "CONVERGPARAM")
public class HabUtilisateurEntity {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "BLOQUE", nullable = true)
    private boolean bloque;
    @Basic
    @Column(name = "CHANGMOTDEPASSEALACONNEXION", nullable = true)
    private String changmotdepassealaconnexion;
    @Basic
    @Column(name = "DATEDEBUTACCES", nullable = true)
    private Calendar datedebutacces;
    @Basic
    @Column(name = "DATEFINACCES", nullable = true)
    private Calendar datefinacces;
    @Basic
    @Column(name = "EMAIL", nullable = true)
    private String email;
    @Basic
    @Column(name = "LOGIN", nullable = true)
    private String login;
    @Basic
    @Column(name = "NOM", nullable = true)
    private String nom;
    @Basic
    @Column(name = "PRENOM", nullable = true)
    private String prenom;
    @Basic
    @Column(name = "SUPERUTILISATEUR", nullable = true)
    private String superutilisateur;
    @Basic
    @Column(name = "TELEPHONE", nullable = true)
    private String telephone;
    @Basic
    @Column(name = "TYPEUTILISATEUR", nullable = true)
    private String typeutilisateur;
    @Basic
    @Column(name = "MATRICULE", nullable = true)
    private String matricule;
    @Basic
    @Column(name = "MULTISOCIETE", nullable = true)
    private String multisociete;
    @Basic
    @Column(name = "MODEPACK", nullable = true)
    private String modepack;
    @Basic
    @Column(name = "IDENTITE", nullable = true)
    private String identite;
    @Basic
    @Column(name = "IDPROFIL", nullable = true)
    private Long idprofil;
    @Basic
    @Column(name = "IDRESPONSABLE", nullable = true)
    private Long idresponsable;
    @Basic
    @Column(name = "AUTORISETOUTPRODUIT", nullable = true)
    private String autorisetoutproduit;
    @Basic
    @Column(name = "AUTORISETOUTEAGENCE", nullable = true)
    private String autorisetouteagence;


}
