package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;
import com.rmaassurance.emissiondirecte.dtos.response.TermeDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.TermeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/termes")
@CrossOrigin
public class TermeController {
   private final TermeServiceImpl termeService;

    public TermeController(TermeServiceImpl termeService) {
        this.termeService = termeService;
    }

    @GetMapping
    public ResponseEntity<List<TermeDTO>> getAllTypes() {
        List<TermeDTO> types = termeService.getAllTermes();
        return ResponseEntity.ok(types);
    }

}
