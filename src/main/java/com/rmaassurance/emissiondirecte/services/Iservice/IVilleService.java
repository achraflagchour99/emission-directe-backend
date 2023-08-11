package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;

import java.util.List;

public interface IVilleService {
    List<RefVilleDTO> getAllVilles();
}
