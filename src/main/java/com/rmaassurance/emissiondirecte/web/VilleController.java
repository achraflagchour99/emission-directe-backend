package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.VilleServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/villes")
@CrossOrigin
public class VilleController {
   private final VilleServiceImpl villeService;

    public VilleController(VilleServiceImpl villeService) {
        this.villeService = villeService;
    }
    @GetMapping
    public ResponseEntity<List<RefVilleDTO>> getAllVilles() {
        List<RefVilleDTO> villes = villeService.getAllVilles();
        return ResponseEntity.ok(villes);
    }

}
