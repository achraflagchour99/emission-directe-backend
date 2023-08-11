package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.constants.GlobalConst;
import com.rmaassurance.emissiondirecte.dtos.request.PrdProduitDTO;
import com.rmaassurance.emissiondirecte.entities.PrdProduitEntity;
import com.rmaassurance.emissiondirecte.mapper.PrdProduitMapper;
import com.rmaassurance.emissiondirecte.repositories.PrdProduitEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IProduitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitServiceImpl implements IProduitService {
    private final PrdProduitEntityRepository produitsRep;
    private final PrdProduitMapper prdProduitMapper;
    public ProduitServiceImpl(PrdProduitEntityRepository produitsRep, PrdProduitMapper prdProduitMapper){
        this.produitsRep=produitsRep;
        this.prdProduitMapper=prdProduitMapper;
    }
    @Override
    public List<PrdProduitDTO> getProduitsPrevoyance() {
        List<PrdProduitEntity> products = produitsRep.findAll();
        return products.stream()
                .map(prdProduitMapper::toDto)
                .filter(product -> GlobalConst.DE_PRODUITS.contains(Integer.parseInt(product.getCode())))
                .collect(Collectors.toList());
    }
}
