package com.rmaassurance.emissiondirecte.mapper.responseMapper;

import com.rmaassurance.emissiondirecte.dtos.response.QuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuittanceMapperResponse {
    QtcQuittanceEntity toEntity(QuittanceResponse quittanceResponse);
    QuittanceResponse toDto(QtcQuittanceEntity qtcQuittanceEntity);
}