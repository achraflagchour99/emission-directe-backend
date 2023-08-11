package com.rmaassurance.emissiondirecte.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    @JsonProperty("PrimeNette")
    private double primeNette;

    @JsonProperty("Taxe")
    private double taxe;

    @JsonProperty("Accessoire")
    private double accessoire;

    @JsonProperty("Tauxcommission")
    private double tauxCommission;

    @JsonProperty("Commission")
    private double commission;

    @JsonProperty("TauxprimeEVE")
    private double tauxPrimeEVE;

    @JsonProperty("PrimeGarEve")
    private double primeGarEve;

    @JsonProperty("TauxParafiscale")
    private double tauxParafiscale;
}
