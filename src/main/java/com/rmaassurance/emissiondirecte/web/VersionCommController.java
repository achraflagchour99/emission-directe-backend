package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.PrdVersioncommercialeDTO;
import com.rmaassurance.emissiondirecte.dtos.response.VersionGarantiesDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.VersionComServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/versioncom")
@CrossOrigin
public class VersionCommController {
    private final VersionComServiceImpl versionComService;

    public VersionCommController(VersionComServiceImpl versionComService) {
        this.versionComService = versionComService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<PrdVersioncommercialeDTO>> getAllVersions() {
        List<PrdVersioncommercialeDTO> versions = versionComService.getAllVersions();
        return ResponseEntity.ok(versions);
    }

    @GetMapping("/garanties/{codePolice}")
    public ResponseEntity<List<VersionGarantiesDTO>> getGarantiesByCodePolice(@PathVariable String codePolice){
        List<VersionGarantiesDTO> garanties = versionComService.getGarantiesByCodePolice(codePolice);
                return ResponseEntity.ok(garanties);
    }

    @GetMapping("/garanties/version/{versionId}")
    public ResponseEntity<List<VersionGarantiesDTO>> getGarantiesByVersionId(@PathVariable Long versionId){
        List<VersionGarantiesDTO> garanties = versionComService.getGarantiesByVersionId(versionId);
        return ResponseEntity.ok(garanties);
    }
}
