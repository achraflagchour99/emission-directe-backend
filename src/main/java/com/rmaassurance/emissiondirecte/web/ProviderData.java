package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.response.IntermediaireResponse;
import com.rmaassurance.emissiondirecte.dtos.response.PoliceResponse;
import com.rmaassurance.emissiondirecte.dtos.response.PrdVersioncommercialeResponse;
import com.rmaassurance.emissiondirecte.dtos.response.RefQuittanceResponse;
import com.rmaassurance.emissiondirecte.utils.ProvideDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provider")
@CrossOrigin
@RequiredArgsConstructor
public class ProviderData {
  private final ProvideDataService provideDataService;

    @GetMapping("/intermediaires")
    public ResponseEntity<List<IntermediaireResponse>> getAllIntermediaire() {
        List<IntermediaireResponse> intermediaireResponseList = provideDataService.getAllIntermediaire();
        return ResponseEntity.ok(intermediaireResponseList);
    }

    @GetMapping("/polices")
    public ResponseEntity<List<PoliceResponse>> getAllPolice() {
        List<PoliceResponse> policeResponseList = provideDataService.getAllPolice();
        return ResponseEntity.ok(policeResponseList);
    }

    @GetMapping("/versions-commerciales")
    public ResponseEntity<List<PrdVersioncommercialeResponse>> getAllVersionCommercial() {
        List<PrdVersioncommercialeResponse> versionCommercialResponseList = provideDataService.getAllVersionCommercial();
        return ResponseEntity.ok(versionCommercialResponseList);
    }

    @GetMapping("/ref-quittances")
    public ResponseEntity<List<RefQuittanceResponse>> getAllRefQuittance() {
        List<RefQuittanceResponse> refQuittanceResponseList = provideDataService.getAllRefQuittance();
        return ResponseEntity.ok(refQuittanceResponseList);
    }
}
