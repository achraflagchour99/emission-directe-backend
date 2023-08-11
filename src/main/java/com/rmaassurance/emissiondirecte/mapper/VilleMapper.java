package com.rmaassurance.emissiondirecte.mapper;

import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;
import com.rmaassurance.emissiondirecte.entities.RefVilleEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VilleMapper {
        RefVilleEntity toEntity(RefVilleDTO refVilleDTO);
        RefVilleDTO toDto(RefVilleEntity refVilleEntity);
        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        RefVilleEntity partialUpdate(RefVilleDTO refVilleDTO, @MappingTarget RefVilleEntity refVilleEntity);
}
