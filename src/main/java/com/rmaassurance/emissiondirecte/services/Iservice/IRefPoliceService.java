package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.RefPoliceDTO;

import java.util.List;

public interface IRefPoliceService {
    List<RefPoliceDTO> getAllStates();
}
