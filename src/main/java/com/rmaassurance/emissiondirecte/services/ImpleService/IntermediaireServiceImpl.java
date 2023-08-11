package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;
import com.rmaassurance.emissiondirecte.entities.IntermediaireEntity;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.IntermediaireMapperResponse;
import com.rmaassurance.emissiondirecte.repositories.IntermediaireEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IIntermediaireService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class IntermediaireServiceImpl implements IIntermediaireService {

    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final IntermediaireMapperResponse intermediaireMapperResponse;

    public IntermediaireServiceImpl(IntermediaireEntityRepository intermediaireEntityRepository, IntermediaireMapperResponse intermediaireMapperResponse) {
        this.intermediaireEntityRepository = intermediaireEntityRepository;
        this.intermediaireMapperResponse = intermediaireMapperResponse;
    }

    @Override
    public List<IntermediaireResponse> getAllInterms() {
        List<IntermediaireEntity> intermediaires = intermediaireEntityRepository.findAll();
        return intermediaires.stream()
                .map(intermediaireMapperResponse::toDto)
                .collect(Collectors.toList());
    }
}
