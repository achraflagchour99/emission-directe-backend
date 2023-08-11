package com.rmaassurance.emissiondirecte.mapper;
import com.rmaassurance.emissiondirecte.dtos.request.PrdProduitDTO;
import com.rmaassurance.emissiondirecte.entities.PrdProduitEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PrdProduitMapper {
    PrdProduitEntity toEntity(PrdProduitDTO prdProduitDTO);
    PrdProduitDTO toDto(PrdProduitEntity prdProduitEntity);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PrdProduitEntity partialUpdate(PrdProduitDTO prdProduitDTO, @MappingTarget PrdProduitEntity prdProduitEntity);
}
