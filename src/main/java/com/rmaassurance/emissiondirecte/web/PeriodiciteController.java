package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.PeriodiciteDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.PeriodiciteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/periodes")
@CrossOrigin
public class PeriodiciteController {
    private final PeriodiciteServiceImpl periodiciteService;
    public PeriodiciteController(PeriodiciteServiceImpl periodiciteService) {
        this.periodiciteService = periodiciteService;
    }

    @GetMapping
    public ResponseEntity<List<PeriodiciteDTO>> getAllPeriodes() {
        List<PeriodiciteDTO> periodes = periodiciteService.getAllPeriods();
        return ResponseEntity.ok(periodes);
    }

}
