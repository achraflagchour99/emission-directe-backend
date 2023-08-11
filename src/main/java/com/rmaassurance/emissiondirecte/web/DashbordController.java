package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.response.QuittanceCountByYearDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.DashbordServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/dashbord")
public class DashbordController {
    private final DashbordServiceImpl dashbordService;

    public DashbordController(DashbordServiceImpl dashbordService) {
        this.dashbordService = dashbordService;
    }

    @GetMapping("/quittance/count")
    public long countUsers() {
        return dashbordService.countQuittance();
    }
    @GetMapping("/police/count")
    public long countPolice() {
        return dashbordService.countPolice();
    }
    @GetMapping("/quittanceValider/count")
    public ResponseEntity<Long> countValidatedQuittancesByRefQuittanceId( ) {
        long count = dashbordService.countValidatedQuittancesByRefQuittanceId();
        return ResponseEntity.ok(count);
    }
    @GetMapping("/quittanceValider/sum")
    public ResponseEntity<Long> SumValidatedQuittancesByRefQuittanceId( ) {
        long count = dashbordService.SumValidatedQuittancesByRefQuittanceId();
        return ResponseEntity.ok(count);
    }



    @GetMapping("/quittance/count-by-year")
    public ResponseEntity<List<QuittanceCountByYearDTO>> getQuittanceCountByYear() {
        List<QuittanceCountByYearDTO> quittanceCounts = dashbordService.countQuittancesByYear();
        return ResponseEntity.ok(quittanceCounts);
    }
}
