package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.dtos.request.PrdProduitDTO;

import java.util.List;

public interface IProduitService {
    public List<PrdProduitDTO> getProduitsPrevoyance();
}
