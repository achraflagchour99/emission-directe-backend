package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.request.RefPoliceDTO;
import com.rmaassurance.emissiondirecte.entities.RefPoliceEntity;
import com.rmaassurance.emissiondirecte.mapper.RefPoliceMapper;
import com.rmaassurance.emissiondirecte.repositories.RefPoliceEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IRefPoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RefPoliceServiceImpl implements IRefPoliceService {

    private final RefPoliceEntityRepository refPoliceEntityRepository;
    private final RefPoliceMapper refPoliceMapper;

    @Autowired
    public RefPoliceServiceImpl(RefPoliceEntityRepository refPoliceEntityRepository, RefPoliceMapper refPoliceMapper) {
        this.refPoliceEntityRepository = refPoliceEntityRepository;
        this.refPoliceMapper = refPoliceMapper;
    }
    @Override
    public List<RefPoliceDTO> getAllStates() {
        List<RefPoliceEntity> etats  = refPoliceEntityRepository.findAll();
        return etats.stream()
                .map(refPoliceMapper::toDto)
                .collect(Collectors.toList());
    }
}
