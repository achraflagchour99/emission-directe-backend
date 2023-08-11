package com.rmaassurance.emissiondirecte.mapper;

import com.rmaassurance.emissiondirecte.dtos.request.PoliceDTO;
import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PoliceEntityMapper {

    //@Mapping(source = "codePolice", target = "codePolice")
    PoliceEntity toEntity(PoliceDTO policeDTO);
    //@Mapping(source = "codePolice", target = "codePolice")
    PoliceDTO toDto(PoliceEntity policeEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PoliceEntity partialUpdate(PoliceDTO policeDTO, @MappingTarget PoliceEntity policeEntity);
}