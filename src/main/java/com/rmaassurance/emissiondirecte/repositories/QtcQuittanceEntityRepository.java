package com.rmaassurance.emissiondirecte.repositories;

import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import com.rmaassurance.emissiondirecte.entities.RefQuittanceEntity;
import com.rmaassurance.emissiondirecte.projection.MaxValuesProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource
@Repository
    public interface QtcQuittanceEntityRepository extends JpaRepository<QtcQuittanceEntity, Long> {

    List<QtcQuittanceEntity> findByRefQuittance(RefQuittanceEntity refQuittanceEntity);
    Page<QtcQuittanceEntity> findAllByDatefinBetween(Date dateDebut, Date dateFin, Pageable pageable);
    Page<QtcQuittanceEntity> findAll(Pageable pageable);
    Page<QtcQuittanceEntity> findByCodepolice(String codePolice, Pageable pageable);
    Page<QtcQuittanceEntity> findByPolice(PoliceEntity police, Pageable pageable);
    Page<QtcQuittanceEntity> findAllByPolice(PoliceEntity police, Pageable pageable);
    Page<QtcQuittanceEntity> findByRefQuittance(RefQuittanceEntity refQuittance, Pageable pageable);
    Page<QtcQuittanceEntity> findByPoliceContainingOrRefQuittanceContainingAndDatefinBetween(PoliceEntity police, RefQuittanceEntity refQuittance, Date dateDebut, Date dateFin, Pageable pageable);

    Page<QtcQuittanceEntity> findByPoliceAndRefQuittanceAndDatefinBetween(PoliceEntity police, RefQuittanceEntity refQuittance, Date dateDebut, Date dateFin, Pageable pageable);
    Page<QtcQuittanceEntity> findByPoliceAndRefQuittance(PoliceEntity police, RefQuittanceEntity refQuittance, Pageable pageable);

    Page<QtcQuittanceEntity> findByPoliceAndDatefinBetween(PoliceEntity police, Date dateDebut, Date dateFin, Pageable pageable);
    Page<QtcQuittanceEntity> findByRefQuittanceAndDatefinBetween(RefQuittanceEntity refQuittance, Date dateDebut, Date dateFin, Pageable pageable);
    Page<QtcQuittanceEntity> findByPoliceContainingAndDatefinBetween(String codePolice, Date dateDebut, Date dateFin, Pageable pageable);

    @Query(value = "SELECT COUNT(*) AS nombre_quittances_validees " +
            " FROM QTC_QUITTANCE " +
            " WHERE REF_QUITTANCE IN (SELECT ID FROM REF_QUITTANCE WHERE id = :refQuittanceId)",
            nativeQuery = true)
    long countValidatedQuittancesByRefQuittanceId(@Param("refQuittanceId") Long refQuittanceId);

    @Query(value = "SELECT SUM(PRIMENETTE) AS PRIMENETTE_quittances_validees " +
            " FROM QTC_QUITTANCE " +
            " WHERE REF_QUITTANCE IN (SELECT ID FROM REF_QUITTANCE WHERE id = :refQuittanceId)",
            nativeQuery = true)
    long SumValidatedQuittancesByRefQuittanceId(@Param("refQuittanceId") Long refQuittanceId);
    @Query(value = "SELECT EXTRACT(YEAR FROM DATEDEBUT) AS year, COUNT(*) AS count FROM QTC_QUITTANCE GROUP BY EXTRACT(YEAR FROM DATEDEBUT)", nativeQuery = true)
    List<Object[]> countQuittancesByYear();


    QtcQuittanceEntity findByPolice(PoliceEntity police);
    QtcQuittanceEntity findByNumeroquittance(String Numeroquittance);


    @Query(value = "SELECT * FROM QTC_QUITTANCE WHERE  ID = 7402", nativeQuery = true)
    QtcQuittanceEntity findQuittanceById( );

    @Query(value = "SELECT max(EXERCICE) AS EXERCICE, max(NUMEROQUITTANCE) AS NUMEROQUITTANCE FROM QTC_QUITTANCE", nativeQuery = true)
    MaxValuesProjection findMaxValues();
}