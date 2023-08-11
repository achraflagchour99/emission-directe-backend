package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.PoliceDTO;
import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;
import com.rmaassurance.emissiondirecte.services.ImpleService.IntermediaireServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/intermediaires")
@CrossOrigin
public class IntermediaireController {
    private final IntermediaireServiceImpl intermediaireService;

    public IntermediaireController(IntermediaireServiceImpl intermediaireService) {
        this.intermediaireService = intermediaireService;
    }
    @GetMapping
    public ResponseEntity<List<IntermediaireResponse>> getAllInterms() {
        List<IntermediaireResponse> interms = intermediaireService.getAllInterms();
        return ResponseEntity.ok(interms);
    }

}
