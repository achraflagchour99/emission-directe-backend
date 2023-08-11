package com.rmaassurance.emissiondirecte.mapper;

import com.rmaassurance.emissiondirecte.dtos.response.TermeDTO;
import com.rmaassurance.emissiondirecte.entities.TermeEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TermeMapper {
    TermeEntity toEntity(TermeDTO termeDTO);
    TermeDTO toDto(TermeEntity termeEntity);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TermeEntity partialUpdate(TermeDTO termeDTO, @MappingTarget TermeEntity termeEntity);
}
