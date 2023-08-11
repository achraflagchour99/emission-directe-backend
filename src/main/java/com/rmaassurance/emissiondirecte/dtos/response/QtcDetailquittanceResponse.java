package com.rmaassurance.emissiondirecte.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import com.rmaassurance.emissiondirecte.entities.RefGarantieEntity;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QtcDetailquittanceResponse {

    private Long id;
    @JsonProperty("idquittance")
    private Long idQuittance;

    @JsonProperty("idgarantie")
    private Long idGarantie;

    @JsonProperty("pourcentagegarantie")
    private Float pourcentageGarantie;

    @JsonProperty("primenette")
    private Float primenette;
    @JsonProperty("montanttaxe")
    private Float montantTaxe;
    @JsonProperty("tauxcommission")
    private Float tauxcommission;
    @JsonProperty("montantcommission")
    private Float montantcommision;
    @JsonProperty("tauxtaxesurcommission")
    private Float tauxtaxesurcommission;
    @JsonProperty("montanttaxesurcommission")
    private Float montanttaxesurcommission;
    @JsonProperty("montantencaise")
    private Float montantencaise;
    @JsonProperty("montanttaxeparafiscale")
    private Float montanttaxeparafiscale;
    @JsonProperty("qtcQuittance")
    private QtcQuittanceEntity qtcQuittance;
    @JsonProperty("refGarantie")
    private RefGarantieEntity refGarantie;
    @JsonProperty("Tauxtaxe")
    private Float tauxtaxe;
    @JsonProperty("Montantaccessoire")
        private Float montantaccessoire;



    @JsonProperty("PrimeGareEve")
    private Float primeGareEve;

    @JsonProperty("TauxTaxeParafiscale")
    private Float tauxTaxeParafiscale;

    @JsonProperty("TauxPrimeEVE")
    private Float tauxPrimeEve;

    private String libelle;



}
