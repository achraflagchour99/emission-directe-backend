package com.rmaassurance.emissiondirecte.dtos.request;

import jakarta.persistence.Basic;
import lombok.Data;


@Data
public class HabUtilisateurDTO {

    @Basic
    private Object bloque;
    @Basic
    private Object changmotdepassealaconnexion;
    @Basic
    private Object datedebutacces;
    @Basic
    private Object datefinacces;
    @Basic
    private Object email;
    @Basic
    private Object login;
    @Basic
    private Object nom;
    @Basic
    private Object prenom;
    @Basic
    private Object superutilisateur;
    @Basic
    private Object telephone;
    @Basic
    private Object typeutilisateur;
    @Basic
    private Object matricule;
    @Basic
    private Object multisociete;
    @Basic
    private Object modepack;
    @Basic
    private Object identite;
    @Basic
    private Object idprofil;
    @Basic
    private Object idresponsable;
    @Basic
    private Object autorisetoutproduit;
    @Basic
    private Object autorisetouteagence;


}
