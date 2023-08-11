package com.rmaassurance.emissiondirecte.mapper.responseMapper;


import com.rmaassurance.emissiondirecte.dtos.response.RefQuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.RefQuittanceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RefQtcQuittanceMapperResponse {

    //@Mapping(source = "codePolice", target = "codePolice")
    RefQuittanceEntity toEntity(RefQuittanceResponse refQuittanceResponse);
    //@Mapping(source = "codePolice", target = "codePolice")
    RefQuittanceResponse toDto(RefQuittanceEntity refQuittanceEntity);
}