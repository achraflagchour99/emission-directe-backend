package com.rmaassurance.emissiondirecte.web;


import com.rmaassurance.emissiondirecte.dtos.request.RefPoliceDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.RefPoliceServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/polices/etats")
@CrossOrigin
public class RefPoliceController {
   private final RefPoliceServiceImpl refPoliceService;

    public RefPoliceController(RefPoliceServiceImpl refPoliceService) {
        this.refPoliceService = refPoliceService;
    }
    @GetMapping
    public ResponseEntity<List<RefPoliceDTO>> getAllStates() {
        List<RefPoliceDTO> etats = refPoliceService.getAllStates();
        return ResponseEntity.ok(etats);
    }

}
