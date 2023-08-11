package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.PeriodiciteDTO;
import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;

import java.util.List;

public interface IPeriodiciteService {
    List<PeriodiciteDTO> getAllPeriods();
}
