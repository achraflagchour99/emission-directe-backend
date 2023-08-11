package com.rmaassurance.emissiondirecte.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodiciteDTO {
    private Long id;
    private String type_periodicite;
}
