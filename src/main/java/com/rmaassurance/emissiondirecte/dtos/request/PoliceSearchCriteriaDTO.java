package com.rmaassurance.emissiondirecte.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoliceSearchCriteriaDTO {
    public Long numClient;
    public String codePolice;
    public PrdVersioncommercialeDTO prdVersioncommerciale;
    public RefVilleDTO refVille;
}
