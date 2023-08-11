package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.request.PrdProduitDTO;
import com.rmaassurance.emissiondirecte.dtos.request.PrdVersioncommercialeDTO;
import com.rmaassurance.emissiondirecte.dtos.response.VersionGarantiesDTO;
import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import com.rmaassurance.emissiondirecte.entities.PrdVersioncommercialeEntity;
import com.rmaassurance.emissiondirecte.mapper.VersionCommMapper;
import com.rmaassurance.emissiondirecte.repositories.PoliceEntityRepository;
import com.rmaassurance.emissiondirecte.repositories.PrdVersioncommercialeEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IVersionCommercialeService;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VersionComServiceImpl implements IVersionCommercialeService {
    private final PrdVersioncommercialeEntityRepository prdVersioncommercialeEntityRepository;
    private final VersionCommMapper versionCommMapper;
    private final ProduitServiceImpl produitService;
    private final PoliceEntityRepository policeEntityRepository;

    public VersionComServiceImpl(PrdVersioncommercialeEntityRepository prdVersioncommercialeEntityRepository, VersionCommMapper versionCommMapper, ProduitServiceImpl produitService, PoliceEntityRepository policeEntityRepository) {
        this.prdVersioncommercialeEntityRepository = prdVersioncommercialeEntityRepository;
        this.versionCommMapper = versionCommMapper;
        this.produitService = produitService;
        this.policeEntityRepository = policeEntityRepository;
    }

    @Override
    public List<PrdVersioncommercialeDTO> getAllVersions() {
        List<PrdVersioncommercialeEntity> versionscommerciales = prdVersioncommercialeEntityRepository.findPrdVersioncommercialeEntitiesByDirecte(1);
        return versionscommerciales.stream()
                .map(versionCommMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<VersionGarantiesDTO> getGarantiesByCodePolice(String codePolice) {

        PoliceEntity Police= policeEntityRepository.findByCodePolice(codePolice);

        List<Object[]> garanties = prdVersioncommercialeEntityRepository.findGarantiesByVersionCommercialeId(Police.getPrdVersioncommerciale().getId());

        List<VersionGarantiesDTO> versionGarantiesDTOs = new ArrayList<>();

        for (Object[] garantie : garanties) {
            VersionGarantiesDTO versionGarantiesDTO = new VersionGarantiesDTO();
            versionGarantiesDTO.setId((Long) garantie[0]);
            versionGarantiesDTO.setLibelle((String) garantie[1]);
            versionGarantiesDTO.setTaux((Double) garantie[2]);
            versionGarantiesDTOs.add(versionGarantiesDTO);
        }

        return versionGarantiesDTOs;
    }
    @Override
    public List<VersionGarantiesDTO> getGarantiesByVersionId(Long versionId) {

        List<Object[]> garanties = prdVersioncommercialeEntityRepository.findGarantiesByVersionCommercialeId(versionId);

        List<VersionGarantiesDTO> versionGarantiesDTOs = new ArrayList<>();

        for (Object[] garantie : garanties) {
            VersionGarantiesDTO versionGarantiesDTO = new VersionGarantiesDTO();
            versionGarantiesDTO.setId((Long) garantie[0]);
            versionGarantiesDTO.setLibelle((String) garantie[1]);
            versionGarantiesDTO.setTaux((Double) garantie[2]);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(garantie[3]);
            String formattedDate2 = dateFormat.format(garantie[4]);
            versionGarantiesDTO.setDatedebut(formattedDate);
            versionGarantiesDTO.setDatefin(formattedDate2);
            versionGarantiesDTOs.add(versionGarantiesDTO);
        }

        return versionGarantiesDTOs;
    }

    @Override
    public boolean isProduitPrevoyance(PrdVersioncommercialeDTO versioncommercialeDTO) {
        Long versionId = versioncommercialeDTO.getId();
        PrdVersioncommercialeEntity versionCommerciale = prdVersioncommercialeEntityRepository.findById(versionId)
                .orElseThrow(() -> new RuntimeException("Version commerciale non trouvée"));

        Long produitId = versionCommerciale.getIdproduit();
 
        List<PrdProduitDTO> produitsPrevoyance = produitService.getProduitsPrevoyance();

        return produitsPrevoyance.stream()
                .anyMatch(produit -> produit.getId().equals(produitId));
    }
}
