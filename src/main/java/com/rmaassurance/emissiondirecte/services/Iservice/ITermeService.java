package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.RefPoliceDTO;
import com.rmaassurance.emissiondirecte.dtos.response.TermeDTO;

import java.util.List;

public interface ITermeService {
    List<TermeDTO> getAllTermes();
}
