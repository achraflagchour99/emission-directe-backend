package com.rmaassurance.emissiondirecte.dtos.request;

import jakarta.persistence.Basic;
import lombok.Data;


@Data
public class QtcGarantiesDTO {

    @Basic
    private Object code;
    @Basic
    private Object libelle;
    @Basic
    private Object taux;
    @Basic
    private Object idproduit;
    @Basic
    private Object idparametresepargne;
    @Basic
    private Object idparametresprevoyance;
    @Basic
    private Object idparametresdommages;
    @Basic
    private Object datedebut;
    @Basic
    private Object datefin;
    @Basic
    private Object formule;
    @Basic
    private Object idgarantie;
    @Basic
    private Object usecatnat;
    @Basic
    private Object tauxventilation;
    @Basic
    private Object categorieacaps;


}
