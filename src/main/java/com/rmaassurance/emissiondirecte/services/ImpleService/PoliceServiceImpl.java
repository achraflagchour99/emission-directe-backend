package com.rmaassurance.emissiondirecte.services.ImpleService;


import com.rmaassurance.emissiondirecte.dtos.request.PoliceSearchCriteriaDTO;
import com.rmaassurance.emissiondirecte.dtos.request.PrdVersioncommercialeDTO;
import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;
import com.rmaassurance.emissiondirecte.entities.*;
import com.rmaassurance.emissiondirecte.mapper.PoliceEntityMapper;
import com.rmaassurance.emissiondirecte.repositories.*;
import com.rmaassurance.emissiondirecte.services.Iservice.IPoliceService;
import com.rmaassurance.emissiondirecte.dtos.request.PoliceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PoliceServiceImpl implements IPoliceService {

    private final PoliceEntityRepository policeRepository;
    private final PoliceEntityMapper policeEntityMapper;
    private final PrdVersioncommercialeEntityRepository prdVersioncommerciale;
    private final RefVilleEntityRepository refVilleRepository;
    private final PeriodiciteRepository periodiciteRepository;
    private final RefPoliceEntityRepository refPoliceEntityRepository;
    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final TermeEntityRepository termeEntityRepository;

    @Autowired
    public PoliceServiceImpl(PoliceEntityRepository policeRepository, PoliceEntityMapper policeEntityMapper, PoliceEntityRepository prdVersioncommerciale, PrdVersioncommercialeEntityRepository prdVersioncommerciale1, RefVilleEntityRepository refVilleRepository, PeriodiciteRepository periodiciteRepository, RefPoliceEntityRepository refPoliceEntityRepository, IntermediaireEntityRepository intermediaireEntityRepository, TermeEntityRepository termeEntityRepository) {
        this.policeRepository = policeRepository;
        this.policeEntityMapper = policeEntityMapper;
        this.prdVersioncommerciale = prdVersioncommerciale1;
        this.refVilleRepository = refVilleRepository;
        this.periodiciteRepository = periodiciteRepository;
        this.refPoliceEntityRepository = refPoliceEntityRepository;
        this.intermediaireEntityRepository = intermediaireEntityRepository;
        this.termeEntityRepository = termeEntityRepository;
    }

    @Override
    public PoliceDTO addPolice(PoliceDTO policeDTO) {
        PoliceEntity police = policeEntityMapper.toEntity(policeDTO);
        PoliceEntity savedPolice = policeRepository.save(police);
        return policeEntityMapper.toDto(savedPolice);
    }

    @Override
    public PoliceDTO updatePolice(String codePolice, PoliceDTO policeDTO) {
        PoliceEntity police = policeRepository.findByCodePolice(codePolice);
        PrdVersioncommercialeEntity versioncommerciale = prdVersioncommerciale.findById(policeDTO.getPrdVersioncommerciale().getId()).get();
        RefVilleEntity refVille = refVilleRepository.findById(policeDTO.getRefVille().getId()).get();
        IntermediaireEntity intermediaire = intermediaireEntityRepository.findById(policeDTO.getIntermediaire().getId()).get();
        PeriodiciteEntity periodicite = periodiciteRepository.findById(policeDTO.getPeriodicite().getId()).get();
        RefPoliceEntity refPolice = refPoliceEntityRepository.findById(policeDTO.getRefPolice().getId()).get();
        TermeEntity termeEntity = termeEntityRepository.findById(policeDTO.getTypeTerme().getId()).get();
        police.setPrdVersioncommerciale(versioncommerciale);
        police.setRefVille(refVille);
        police.setIntermediaire(intermediaire);
        police.setPeriodicite(periodicite);
        police.setRefPolice(refPolice);
        police.setTypeTerme(termeEntity);
        policeEntityMapper.partialUpdate(policeDTO, police);
        PoliceEntity updatedPolice = policeRepository.save(police);
        return policeEntityMapper.toDto(updatedPolice);
    }


    @Override
    public List<PoliceDTO> getAllPolices() {
        List<PoliceEntity> polices = policeRepository.findAll();
        return polices.stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public PoliceDTO getPoliceByCodePolice(String codePolice) {
        PoliceEntity police = policeRepository.findByCodePolice(codePolice);
        return policeEntityMapper.toDto(police);
    }

    @Override
    public Page<PoliceDTO> getPoliceByCriteres(PoliceSearchCriteriaDTO policeSearchCriteriaDTO, int pageNo, int pageSize) {
        Specification<PoliceEntity> policeSpecification = Specification.where(null);
        if (policeSearchCriteriaDTO.getNumClient() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("numClient"), policeSearchCriteriaDTO.getNumClient()));
        }
        if (policeSearchCriteriaDTO.getCodePolice() != null) {
            policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("codePolice"), policeSearchCriteriaDTO.getCodePolice()));
        }
        if (policeSearchCriteriaDTO.getPrdVersioncommerciale() != null) {
            PrdVersioncommercialeDTO prdVersionCommercialeDTO = policeSearchCriteriaDTO.getPrdVersioncommerciale();
            if (prdVersionCommercialeDTO.getNomcommercial() != null) {
                policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("prdVersioncommerciale").get("nomcommercial"), prdVersionCommercialeDTO.getNomcommercial()));
            }
        }
        if (policeSearchCriteriaDTO.getRefVille() != null) {
            RefVilleDTO refVilleDTO = policeSearchCriteriaDTO.getRefVille();
            if (refVilleDTO.getLibelle() != null) {
                policeSpecification = policeSpecification.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("refVille").get("libelle"), policeSearchCriteriaDTO.getRefVille().getLibelle()));
            }
        }

        Pageable pageable = PageRequest.of(pageNo, pageSize);
        List<PoliceDTO> policeDTOList = policeRepository.findAll(policeSpecification, pageable)
                .stream()
                .map(policeEntityMapper::toDto)
                .collect(Collectors.toList());

        long count = policeRepository.count(policeSpecification);

        return new PageImpl<>(policeDTOList, pageable, count);


    }
}