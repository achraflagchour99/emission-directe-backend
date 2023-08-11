package com.rmaassurance.emissiondirecte.dtos.request;

import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import com.rmaassurance.emissiondirecte.entities.PrdProduitEntity;
import com.rmaassurance.emissiondirecte.entities.RefGarantieEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GarantieProduitDTO {

    private  String libelle;

    private  double tauxTaxeEve;

    private RefGarantieEntity refGarantie;

    private PrdProduitEntity prdProduit;


    private PoliceEntity police;
}
