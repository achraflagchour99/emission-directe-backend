package com.rmaassurance.emissiondirecte.repositories;


import com.rmaassurance.emissiondirecte.entities.HabAssocUtilisateurProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabAssocUtilisateurProduitEntityRepository extends JpaRepository<HabAssocUtilisateurProduitEntity, Long>{}