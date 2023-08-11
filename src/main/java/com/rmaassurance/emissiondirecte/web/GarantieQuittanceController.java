package com.rmaassurance.emissiondirecte.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmaassurance.emissiondirecte.dtos.response.QtcDetailquittanceResponse;
import com.rmaassurance.emissiondirecte.entities.QtcDetailquittanceEntity;
import com.rmaassurance.emissiondirecte.services.ImpleService.GarantieQuittanceServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/garantie-quittance")
@CrossOrigin
public class GarantieQuittanceController {
    private final GarantieQuittanceServiceImpl garantieQuittanceService;

    public GarantieQuittanceController(GarantieQuittanceServiceImpl garantieQuittanceService) {
        this.garantieQuittanceService = garantieQuittanceService;
    }



    @PostMapping("/saveQuittanceGarantie")
    public ResponseEntity<String> saveEntities(@RequestBody String Quittance,@RequestBody List<String> jsonData) throws JsonProcessingException {

            garantieQuittanceService.saveQuittanceDetailGarantie(Quittance,jsonData );
            return ResponseEntity.ok("Entities saved successfully");

    }


    @PostMapping("/saveQuittanceGarantie2")
    public ResponseEntity<String> saveEntities2(@RequestBody Map<String, Object> requestData) throws JsonProcessingException {
        String quittance = (String) requestData.get("Quittance");
        List<String> jsonData = new ObjectMapper().readValue((String) requestData.get("jsonData"), new TypeReference<List<String>>() {});
        System.out.println(quittance);
        System.out.println(jsonData);
        garantieQuittanceService.saveQuittanceDetailGarantie(quittance,jsonData );
        return ResponseEntity.ok("Entities saved successfully");
    }


    @PostMapping("/garantie/save")
    public void saveGarantie() {
        QtcDetailquittanceEntity qtcDetailquittanceEntity=new QtcDetailquittanceEntity();
          garantieQuittanceService.SaveGarantie(qtcDetailquittanceEntity);
    }

    @GetMapping("/quittancegarantie/{idQuitt}")
    public ResponseEntity<List<QtcDetailquittanceResponse>> getGarantieByQuittance(@PathVariable Long idQuitt) {
        List<QtcDetailquittanceResponse> quittanceList=garantieQuittanceService.getQtcDetailquittanceByQuittance(idQuitt);
        if (quittanceList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(quittanceList);
        }
    }

    @GetMapping("/quittance/{idQuitt}/garantie")
    public ResponseEntity<List<QtcDetailquittanceResponse>> findQuittanceByQuittanceNumber(@PathVariable long quittanceNumber) {
        List<QtcDetailquittanceResponse> quittanceList = garantieQuittanceService.findQuittanceByQuittanceNumber(quittanceNumber);

        if (quittanceList.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(quittanceList);
        }
    }


    @PutMapping("")
    public ResponseEntity<QtcDetailquittanceResponse> updateQtcDetailquittance( @RequestBody QtcDetailquittanceResponse updatedQtcDetailquittanceDTO) {
        QtcDetailquittanceResponse updatedQtcDetailquittance = garantieQuittanceService.update( updatedQtcDetailquittanceDTO);
        return ResponseEntity.ok(updatedQtcDetailquittance);
    }

}


