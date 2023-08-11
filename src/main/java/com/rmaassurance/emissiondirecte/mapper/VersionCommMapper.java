package com.rmaassurance.emissiondirecte.mapper;

import com.rmaassurance.emissiondirecte.dtos.request.PrdVersioncommercialeDTO;
import com.rmaassurance.emissiondirecte.entities.PrdVersioncommercialeEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VersionCommMapper {
    PrdVersioncommercialeEntity toEntity(PrdVersioncommercialeDTO prdVersioncommercialeDTO);
    PrdVersioncommercialeDTO toDto(PrdVersioncommercialeEntity prdVersioncommercialeEntity);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PrdVersioncommercialeEntity partialUpdate(PrdVersioncommercialeDTO prdVersioncommercialeDTO, @MappingTarget PrdVersioncommercialeEntity prdVersioncommercialeEntity);
}