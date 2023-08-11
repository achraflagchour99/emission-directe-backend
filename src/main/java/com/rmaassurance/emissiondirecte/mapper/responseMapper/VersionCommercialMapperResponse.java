package com.rmaassurance.emissiondirecte.mapper.responseMapper;


import com.rmaassurance.emissiondirecte.dtos.response.PrdVersioncommercialeResponse;
import com.rmaassurance.emissiondirecte.entities.PrdVersioncommercialeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VersionCommercialMapperResponse {

    //@Mapping(source = "codePolice", target = "codePolice")
    PrdVersioncommercialeEntity toEntity(PrdVersioncommercialeResponse prdVersioncommercialeResponse);
    //@Mapping(source = "codePolice", target = "codePolice")
    PrdVersioncommercialeResponse toDto(PrdVersioncommercialeEntity prdVersioncommercialeEntity);
}