package com.rmaassurance.emissiondirecte.repositories;


import com.rmaassurance.emissiondirecte.entities.HabAssocUtilisateurProduitEntity;
import com.rmaassurance.emissiondirecte.entities.QtcDetailquittanceEntity;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface QtcDetailQuittanceRepository extends JpaRepository<QtcDetailquittanceEntity, Long>{
    @Query("SELECT q FROM QtcDetailquittanceEntity q WHERE q.qtcQuittance.id = :quittanceId")
    List<QtcDetailquittanceEntity> findByQtcQuittance(@Param("quittanceId") Long quittanceId);


    @Query(value = "SELECT * FROM QTC_DETAIL_QUITTANCE WHERE QTC_QUITTANCE = ?1", nativeQuery = true)
    List<QtcDetailquittanceEntity> findByQuittance(long quittance);

    @Query(value = "SELECT * FROM QTC_DETAIL_QUITTANCE WHERE QTC_QUITTANCE = 16402", nativeQuery = true)
    List<QtcDetailquittanceEntity> findByQtcQuittance();


    List<QtcDetailquittanceEntity> findByQtcQuittance(QtcQuittanceEntity qtcQuittance);

}