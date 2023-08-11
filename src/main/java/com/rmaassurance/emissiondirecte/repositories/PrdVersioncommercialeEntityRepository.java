package com.rmaassurance.emissiondirecte.repositories;

import com.rmaassurance.emissiondirecte.entities.PrdVersioncommercialeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PrdVersioncommercialeEntityRepository extends JpaRepository<PrdVersioncommercialeEntity, Long> {
        @Query(value = " SELECT qg.IDGARANTIE AS id, qg.LIBELLE AS libelle, qg.TAUX AS taux, qg.DATEDEBUT AS datedebut, qg.DATEFIN AS datefin " +
                "FROM PRD_VERSIONCOMMERCIALE v " +
                "JOIN PRD_PRODUIT p ON v.IDPRODUIT = p.ID " +
                "JOIN QTC_GARANTIES qg ON p.ID = qg.IDPRODUIT " +
                "JOIN REF_GARANTIE g ON qg.IDGARANTIE = g.ID " +
                "WHERE v.id = :id ORDER BY qg.CODE asc",
                nativeQuery = true)
        List<Object[]> findGarantiesByVersionCommercialeId(@Param("id") Long id);
        List<PrdVersioncommercialeEntity> findPrdVersioncommercialeEntitiesByDirecte(int directe);
}