package com.rmaassurance.emissiondirecte.mapper.responseMapper;

import com.rmaassurance.emissiondirecte.dtos.response.QtcDetailquittanceResponse;
import com.rmaassurance.emissiondirecte.entities.QtcDetailquittanceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QtcDetailquittanceMapperResponse {


    QtcDetailquittanceResponse toResponse(QtcDetailquittanceEntity entity);


    QtcDetailquittanceEntity toEntity(QtcDetailquittanceResponse qtcDetailquittanceResponse);

 /*   @Mappings({
            @Mapping(source = "primenette", target = "PRIMENETTE"),
            // Add mappings for other fields as needed
    })*/
     List<QtcDetailquittanceResponse> toResponseList(List<QtcDetailquittanceEntity> entities);
}
