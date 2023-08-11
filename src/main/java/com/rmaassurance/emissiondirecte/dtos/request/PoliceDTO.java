package com.rmaassurance.emissiondirecte.dtos.request;

import com.rmaassurance.emissiondirecte.dtos.response.TermeDTO;
import com.rmaassurance.emissiondirecte.entities.IntermediaireEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoliceDTO {
    private Long id;
    private String codePolice;
    private Long numClient ;
    private String raisonSociale ;
    private String adresse ;
    private Date dateEffet;
    private String dateEffetFormatted;
    private Double primeNette;
    private Double taxe ;
    private Double acce ;
    private Double tauxComm ;
    private Date dateTerme ;
    private String dateTermeFormatted;
    private  Date dateEtat;
    private String dateEtatFormatted;
    private Double mnt_taxe_eve ;
    private Double mnt_taxe_parafiscale ;
    private PrdVersioncommercialeDTO prdVersioncommerciale;
    private RefVilleDTO refVille;
    private RefPoliceDTO refPolice;
    private String terme;
    private PeriodiciteDTO periodicite;
    private Date dateEcheance;
    private String dateEcheanceFormatted;
    private IntermediaireDTO intermediaire;
    private TermeDTO typeTerme;
}
