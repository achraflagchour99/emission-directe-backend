package com.rmaassurance.emissiondirecte.mapper.responseMapper;


import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;
import com.rmaassurance.emissiondirecte.entities.IntermediaireEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IntermediaireMapperResponse {

    //@Mapping(source = "codePolice", target = "codePolice")
    IntermediaireEntity toEntity(IntermediaireResponse intermediaireResponse);
    //@Mapping(source = "codePolice", target = "codePolice")
    IntermediaireResponse toDto(IntermediaireEntity intermediaireEntity);
}