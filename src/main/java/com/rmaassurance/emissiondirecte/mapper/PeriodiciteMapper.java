package com.rmaassurance.emissiondirecte.mapper;

import com.rmaassurance.emissiondirecte.dtos.request.PeriodiciteDTO;
import com.rmaassurance.emissiondirecte.dtos.request.PoliceDTO;
import com.rmaassurance.emissiondirecte.entities.PeriodiciteEntity;
import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PeriodiciteMapper {
    PeriodiciteEntity toEntity(PeriodiciteDTO periodiciteDTO);
    PeriodiciteDTO toDto(PeriodiciteEntity periodiciteEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PeriodiciteEntity partialUpdate(PeriodiciteDTO periodiciteDTO, @MappingTarget PeriodiciteEntity periodiciteEntity);
}