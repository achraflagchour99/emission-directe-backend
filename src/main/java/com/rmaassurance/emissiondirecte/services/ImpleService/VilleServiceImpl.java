package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;
import com.rmaassurance.emissiondirecte.entities.RefVilleEntity;
import com.rmaassurance.emissiondirecte.mapper.VilleMapper;
import com.rmaassurance.emissiondirecte.repositories.RefVilleEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IVilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VilleServiceImpl implements IVilleService {

    private final RefVilleEntityRepository refVilleEntityRepository;
    private final VilleMapper villeMapper;

    @Autowired
    public VilleServiceImpl(RefVilleEntityRepository refVilleEntityRepository, VilleMapper villeMapper) {
        this.refVilleEntityRepository = refVilleEntityRepository;
        this.villeMapper = villeMapper;
    }
    @Override
    public List<RefVilleDTO> getAllVilles() {
        List<RefVilleEntity> villes  = refVilleEntityRepository.findAll();
        return villes.stream()
                .map(villeMapper::toDto)
                .collect(Collectors.toList());
    }
}
