package com.rmaassurance.emissiondirecte.mapper.responseMapper;

import com.rmaassurance.emissiondirecte.dtos.response.PoliceResponse;
import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PoliceMapperResponse {

    PoliceEntity toEntity(PoliceResponse policeResponse);
    PoliceResponse toDto(PoliceEntity policeEntity);
}