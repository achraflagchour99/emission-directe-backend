package com.rmaassurance.emissiondirecte.utils;
import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;
import com.rmaassurance.emissiondirecte.dtos.response.PoliceResponse;
import com.rmaassurance.emissiondirecte.dtos.response.PrdVersioncommercialeResponse;
import com.rmaassurance.emissiondirecte.dtos.response.RefQuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.*;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.IntermediaireMapperResponse;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.PoliceMapperResponse;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.RefQtcQuittanceMapperResponse;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.VersionCommercialMapperResponse;
import com.rmaassurance.emissiondirecte.repositories.IntermediaireEntityRepository;
import com.rmaassurance.emissiondirecte.repositories.PoliceEntityRepository;
import com.rmaassurance.emissiondirecte.repositories.PrdVersioncommercialeEntityRepository;
import com.rmaassurance.emissiondirecte.repositories.RefQuittanceRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProvideDataService {

    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final IntermediaireMapperResponse intermediaireMapperResponse;

    private final PoliceEntityRepository policeEntityRepository;
    private final PoliceMapperResponse policeMapperResponse;

    private final PrdVersioncommercialeEntityRepository prdVersioncommercialeEntityRepository;
    private final VersionCommercialMapperResponse versionCommercialMapperResponse;

    private final RefQuittanceRepository refQuittanceRepository;
    private final RefQtcQuittanceMapperResponse RefQtcQuittanceMapperResponse;



    public List<IntermediaireResponse> getAllIntermediaire() {
        List<IntermediaireEntity> intermediaire = intermediaireEntityRepository.findAll();
        List<IntermediaireResponse> intermediaireResponseList = intermediaire.stream()
                .map(intermediaireMapperResponse::toDto)
                .collect(Collectors.toList());
        return intermediaireResponseList;
    }


    public List<PoliceResponse> getAllPolice() {
        List<PoliceEntity> police = policeEntityRepository.findAll();
        List<PoliceResponse> policeResponseList = police.stream()
                .map(policeMapperResponse::toDto)
                .collect(Collectors.toList());
        return policeResponseList;
    }


    public List<PrdVersioncommercialeResponse> getAllVersionCommercial() {
        List<PrdVersioncommercialeEntity> versionCommercial = prdVersioncommercialeEntityRepository.findAll();
        List<PrdVersioncommercialeResponse> versionCommercialResponseList = versionCommercial.stream()
                .map(versionCommercialMapperResponse::toDto)
                .collect(Collectors.toList());
        return versionCommercialResponseList;
    }

    public List<RefQuittanceResponse> getAllRefQuittance() {
        List<RefQuittanceEntity> refQuittance = refQuittanceRepository.findAll();
        List<RefQuittanceResponse> refQuittanceResponseList = refQuittance.stream()
                .map(RefQtcQuittanceMapperResponse::toDto)
                .collect(Collectors.toList());
        return refQuittanceResponseList;
    }

}
