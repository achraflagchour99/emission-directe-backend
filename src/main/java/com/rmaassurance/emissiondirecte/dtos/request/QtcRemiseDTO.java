package com.rmaassurance.emissiondirecte.dtos.request;

import jakarta.persistence.Basic;
import lombok.Data;


@Data
public class QtcRemiseDTO {


    @Basic
    private Object numeroremise;
    @Basic
    private Object montantremise;
    @Basic
    private Object sens;
    @Basic
    private Object etat;
    @Basic
    private Object dateetat;
    @Basic
    private Object montantconsomme;
    @Basic
    private Object datecomptabilisation;
    @Basic
    private Object idoperationprelevement;
    @Basic
    private Object montantdiff;
    @Basic
    private Object lettreproduit;
    @Basic
    private Object soldeinitial;



}
