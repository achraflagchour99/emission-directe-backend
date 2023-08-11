package com.rmaassurance.emissiondirecte.mapper;


import com.rmaassurance.emissiondirecte.dtos.request.QtcQuittanceDTO;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuittanceMapper {

    QtcQuittanceDTO toDto(QtcQuittanceEntity entity);

    QtcQuittanceEntity toEntity(QtcQuittanceDTO qtcQuittanceDTO);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    QtcQuittanceEntity partialUpdate(QtcQuittanceDTO qtcQuittanceDTO, @MappingTarget QtcQuittanceEntity entity);

    List<QtcQuittanceDTO> toQuittanceDTOList(List<QtcQuittanceEntity> quittanceEntityList);


}
