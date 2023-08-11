package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.IntermediaireDTO;
import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;

import java.util.List;

public interface IIntermediaireService {
    List<IntermediaireResponse> getAllInterms();
}
