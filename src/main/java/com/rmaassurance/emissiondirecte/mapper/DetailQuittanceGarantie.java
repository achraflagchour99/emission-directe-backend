package com.rmaassurance.emissiondirecte.mapper;


import com.rmaassurance.emissiondirecte.entities.MyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DetailQuittanceGarantie {


    MyEntity mapJsonToEntity(String json);
}
