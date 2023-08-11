package com.rmaassurance.emissiondirecte.dtos.request;

import com.rmaassurance.emissiondirecte.entities.RefIntermediaireEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntermediaireDTO {
    private Long id;
    private String nomCommercial ;
    private RefIntermediaireEntity refIntermediaireEntity;
}
