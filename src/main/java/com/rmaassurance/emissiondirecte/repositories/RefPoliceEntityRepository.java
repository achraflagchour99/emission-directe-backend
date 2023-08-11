package com.rmaassurance.emissiondirecte.repositories;

import com.rmaassurance.emissiondirecte.entities.RefPoliceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RefPoliceEntityRepository extends JpaRepository<RefPoliceEntity, Long> {
}