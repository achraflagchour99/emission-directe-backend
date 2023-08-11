package com.rmaassurance.emissiondirecte.repositories;


import com.rmaassurance.emissiondirecte.entities.HabMotdepasseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HabMotdepasseEntityRepository extends JpaRepository<HabMotdepasseEntity, Long>
{
}