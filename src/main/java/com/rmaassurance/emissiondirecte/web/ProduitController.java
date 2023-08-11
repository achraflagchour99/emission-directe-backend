package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.PrdProduitDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.ProduitServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produits")
@CrossOrigin
public class ProduitController {
    private ProduitServiceImpl produitService;

    public ProduitController(ProduitServiceImpl produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/de_produits")
    public List<PrdProduitDTO> getProducts() {
       return produitService.getProduitsPrevoyance();
    }
}
