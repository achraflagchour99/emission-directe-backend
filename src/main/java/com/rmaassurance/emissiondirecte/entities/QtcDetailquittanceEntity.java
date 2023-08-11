package com.rmaassurance.emissiondirecte.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "QTC_DETAIL_QUITTANCE" )
@JsonIgnoreProperties(ignoreUnknown = true)
/*@ToString(exclude = {"qtcQuittance", "refGarantie"})*/
public class QtcDetailquittanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "IDQUITTANCE")
    private Long idquittance;

    @Column(name = "IDGARANTIE")
    private Long idgarantie;
    @Basic
    @Column(name = "POURCENTAGEGARANTIE", nullable = true)
    private Float pourcentagegarantie;
    @Basic
    @JsonProperty("PrimeNette")
    @Column(name = "PRIMENETTE", nullable = true)
    private Float primenette;
    @Basic
    @Column(name = "MONTANTTAXE", nullable = true)
    private Float montanttaxe;
    @Basic
    @JsonProperty("Tauxcommission")
    @Column(name = "TAUXCOMMISSION", nullable = true)
    private Float tauxcommission;
    @Basic
    @JsonProperty("Commission")
    @Column(name = "MONTANTCOMMISSION", nullable = true)
    private Float montantcommission;
    @Basic
    @Column(name = "TAUXTAXESURCOMMISSION", nullable = true)
    private Float tauxtaxesurcommission;
    @Basic
    @Column(name = "MONTANTTAXESURCOMMISSION", nullable = true)
    private Float montanttaxesurcommission;
    @Basic
    @Column(name = "MONTANTENCAISE", nullable = true)
    private Float montantencaise;
    @Basic
    @Column(name = "MONTANTENCAISSE", nullable = true)
    private Float montantencaisse;
    @Basic
    @Column(name = "MONTANTTAXEPARAFISCALE", nullable = true)
    private Float montanttaxeparafiscale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qtcQuittance")
    private QtcQuittanceEntity qtcQuittance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refGarantie")
    private RefGarantieEntity refGarantie;

    @Basic
    @JsonProperty("Taxe")
    @Column(name = "Tauxtaxe", nullable = true)
    private Float tauxtaxe;
    @Basic
    @JsonProperty("Accessoire")
    @Column(name = "Montantaccessoire", nullable = true)
    private Float montantaccessoire;
    @Basic
    @Column(name = "Montantcommision", nullable = true)
    private Float montantcommision;
    @Basic
    @JsonProperty("PrimeGarEve")
    @Column(name = "PrimeGareEve", nullable = true)
    private Float primeGareEve;
    @Basic
    @JsonProperty("TauxParafiscale")
    @Column(name = "TauxTaxeParafiscale", nullable = true)
    private Float tauxTaxeParafiscale;

    @Basic
    @JsonProperty("TauxprimeEVE")
    @Column(name = "TauxPrimeEVE", nullable = true)
    private Float tauxPrimeEVE;


    @Basic
    @JsonProperty("libelle")
    @Column(name = "libelleGarantie", nullable = true)
    private String libelle;

}
