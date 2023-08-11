package com.rmaassurance.emissiondirecte.mapper;

import com.rmaassurance.emissiondirecte.dtos.request.RefPoliceDTO;
import com.rmaassurance.emissiondirecte.entities.RefPoliceEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RefPoliceMapper {
        RefPoliceEntity toEntity(RefPoliceDTO refPoliceDTO);
        RefPoliceDTO toDto(RefPoliceEntity refPoliceEntity);
        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        RefPoliceEntity partialUpdate(RefPoliceDTO refPoliceDTO, @MappingTarget RefPoliceEntity refPoliceEntity);
}
