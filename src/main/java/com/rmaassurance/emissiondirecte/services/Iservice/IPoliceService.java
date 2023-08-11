package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.PoliceDTO;
import com.rmaassurance.emissiondirecte.dtos.request.PoliceSearchCriteriaDTO;
import org.springframework.data.domain.Page;

import java.util.List;


public interface IPoliceService {
    PoliceDTO addPolice(PoliceDTO policeDTO);
    PoliceDTO updatePolice(String codePolice, PoliceDTO policeDTO);
    List<PoliceDTO> getAllPolices();
    Page<PoliceDTO> getPoliceByCriteres(PoliceSearchCriteriaDTO policeSearchCriteriaDTO, int pageNo, int pageSize);
    PoliceDTO getPoliceByCodePolice(String codePolice);
}
