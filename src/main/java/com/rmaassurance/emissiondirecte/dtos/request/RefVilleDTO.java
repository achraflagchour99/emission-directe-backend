package com.rmaassurance.emissiondirecte.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefVilleDTO {
    private Long id;
    private Long code;
    private String libelle;

}
