package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.QtcQuittanceDTO;
import com.rmaassurance.emissiondirecte.dtos.response.QuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface IQuittanceService {

    QtcQuittanceDTO getQuittById(Long id);
    QtcQuittanceEntity save(QtcQuittanceDTO qtcQuittanceDTO);
    Page<QtcQuittanceDTO> getAllQuittance(int pageNumber, int pageSize);
    boolean getQuittanceById(Long id);
    QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO);
    public List<QtcQuittanceDTO> getByRefQuittanceEntity(Long refQuittanceid);
    List<QtcQuittanceDTO> searchByDateBetween(Date dateDebut, Date dateFin);
    public List<QtcQuittanceDTO> searchByCodePolice(Long codePolice);
    public Page<QuittanceResponse> searchQuittances(Long refQuittanceid, Date dateDebut, Date dateFin, String codePolice, int pageNumber, int pageSize);


}
