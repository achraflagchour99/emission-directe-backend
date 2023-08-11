package com.rmaassurance.emissiondirecte.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Cache;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionGarantiesDTO {
    private Long id;
    private String libelle;
    private Double taux;
    private String datedebut;
    private String datefin;
}
