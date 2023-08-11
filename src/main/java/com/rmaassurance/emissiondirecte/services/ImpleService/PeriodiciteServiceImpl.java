package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.request.PeriodiciteDTO;
import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;
import com.rmaassurance.emissiondirecte.entities.IntermediaireEntity;
import com.rmaassurance.emissiondirecte.entities.PeriodiciteEntity;
import com.rmaassurance.emissiondirecte.mapper.PeriodiciteMapper;
import com.rmaassurance.emissiondirecte.repositories.PeriodiciteRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IPeriodiciteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeriodiciteServiceImpl implements IPeriodiciteService {

    private final PeriodiciteRepository periodiciteRepository;
    private final PeriodiciteMapper periodiciteMapper;

    public PeriodiciteServiceImpl(PeriodiciteRepository periodiciteRepository, PeriodiciteMapper periodiciteMapper) {
        this.periodiciteRepository = periodiciteRepository;
        this.periodiciteMapper = periodiciteMapper;
    }


    @Override
    public List<PeriodiciteDTO> getAllPeriods() {
        List<PeriodiciteEntity> periodes = periodiciteRepository.findAll();
        return periodes.stream()
                .map(periodiciteMapper::toDto)
                .collect(Collectors.toList());
    }
}
