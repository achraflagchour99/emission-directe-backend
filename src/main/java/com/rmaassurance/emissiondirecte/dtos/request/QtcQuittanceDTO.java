package com.rmaassurance.emissiondirecte.dtos.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rmaassurance.emissiondirecte.dtos.response.RefQuittanceResponse;
import com.rmaassurance.emissiondirecte.dtos.response.RemiseDTO;
import com.rmaassurance.emissiondirecte.entities.RefQuittanceEntity;
import com.rmaassurance.emissiondirecte.utils.CalendarDeserializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class QtcQuittanceDTO {
    private Long id;
    @JsonIgnore
    private int codesociete;
    private String naturequittance;
    private String numeroquittance;

    @JsonProperty("idCodePolice")
    private String codepolice;
    private String numeroquittanceorigine;
    private String codeclient;
    private Long codeintermediaire;
    private Long codebranche;
    private String nomclient;
    private String prenomclient;
    private String adresseclient;
    private Long villeclient;
    private String typequittance;

    private double primenette;

    private double tauxtaxe;
    @JsonIgnore
    private double montanttaxe;

    private double montantaccessoire;
    @JsonIgnore
    private double montantencaisse;
    @JsonIgnore
    private double montantcommisionretenue;
    @JsonIgnore
    private double montantcommisionristourne;
    @JsonIgnore
    private double montontremise;
    @JsonIgnore
    private String periodicite;

    private Calendar datedebut;

    @JsonDeserialize(using = CalendarDeserializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Calendar datefin;


    private String etatquittance;
    private Calendar dateetat;
    private Calendar dateeffet;
    private Long idoperationprelevement;
    private Long idutilisateurristourne;
    private Long idutilisateurvalidateur;
    private Long idproduit;
    private Long idremise;

    private double tauxcommission;
    @JsonIgnore
    private double montantcommission;
    @JsonIgnore
    private double synchrone;
    @JsonIgnore
    private Calendar datesynchronisation;
    @JsonIgnore
    private double montantcommision;
    private Long numeroquittanceOld;
    private Calendar datevalidation;

    private double montanttaxeparafiscale;
    @JsonIgnore
    private double tauxcommissioncatnat;
    private Long idquittanceorigine;
    private String typequittanceprevoyance;
    private Long forcee;
    private String exercice;
    private String ordre;
    private Long codeIntermediaire;
    private Long intermediaireid;
    public Long refQuittanceid;

    // private RefQuittanceEntity refQuittance;
    private Long qtcRemiseid;
    //private QtcRemiseEntity qtcRemise;
    private Long habUtilisateurid;
    //private HabUtilisateurEntity habUtilisateur;

    //private List<QtcDetailquittanceEntity> qtcDetailquittance;


    private Long policeid;
    private Calendar dateEcheance;
    private Calendar dateTerme;
    private Date dateemission;

    @JsonProperty("tauxprimenette")
    private Double tauxprimenette;

    private Double primeGareEve;
    @JsonIgnore
    private Double tauxTaxeParafiscale;

    private Long versioncommerciale;

    private RemiseDTO remiseDTO;
    private RefQuittanceEntity refQuittanceEntity;
    private RefQuittanceResponse refQuittance ;

}
