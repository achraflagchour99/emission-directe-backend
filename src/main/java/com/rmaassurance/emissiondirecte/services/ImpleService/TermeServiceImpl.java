package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.response.TermeDTO;
import com.rmaassurance.emissiondirecte.entities.PeriodiciteEntity;
import com.rmaassurance.emissiondirecte.entities.TermeEntity;
import com.rmaassurance.emissiondirecte.mapper.TermeMapper;
import com.rmaassurance.emissiondirecte.repositories.TermeEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.ITermeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TermeServiceImpl implements ITermeService {
    private final TermeEntityRepository termeEntityRepository;
    private final TermeMapper termeMapper;

    public TermeServiceImpl(TermeEntityRepository termeEntityRepository, TermeMapper termeMapper) {
        this.termeEntityRepository = termeEntityRepository;
        this.termeMapper = termeMapper;
    }


    @Override
    public List<TermeDTO> getAllTermes() {
        List<TermeEntity> types = termeEntityRepository.findAll();
        return types.stream()
                .map(termeMapper::toDto)
                .collect(Collectors.toList());
    }
}
