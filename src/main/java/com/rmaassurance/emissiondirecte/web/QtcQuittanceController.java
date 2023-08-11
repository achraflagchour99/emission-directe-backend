package com.rmaassurance.emissiondirecte.web;

import com.rmaassurance.emissiondirecte.dtos.request.QtcQuittanceDTO;
import com.rmaassurance.emissiondirecte.dtos.response.QuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import com.rmaassurance.emissiondirecte.entities.RefQuittanceEntity;
import com.rmaassurance.emissiondirecte.projection.MaxValuesProjection;
import com.rmaassurance.emissiondirecte.services.ImpleService.QuittanceServiceImpl;
import com.rmaassurance.emissiondirecte.services.ImpleService.testSer;
import com.rmaassurance.emissiondirecte.utils.SearchUtils;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/quittances")
@CrossOrigin
public class QtcQuittanceController {

    @Autowired
    private QuittanceServiceImpl quittanceService;
    @Autowired
    private SearchUtils searchUtils;
    @Autowired
    private testSer t;
    @PostMapping("")
        public QtcQuittanceEntity create(@RequestBody QtcQuittanceDTO quittanceDTO) {
        System.out.println(quittanceDTO);
        return quittanceService.save(quittanceDTO);
    }
    @PostMapping("/testpost")
    public String createtest() {
        return "null";
    }
    @GetMapping("")
    @Operation(summary = "getAllQuittances")
    public ResponseEntity<Page<QtcQuittanceDTO>> getAllQuittance(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "3") int pageSize) {
        Page<QtcQuittanceDTO> quittancePage = quittanceService.getAllQuittance(pageNumber, pageSize);
        return ResponseEntity.ok(quittancePage);
    }
    @GetMapping("/{id}")
    public boolean getQuittanceById(@PathVariable Long id) {
        return quittanceService.getQuittanceByPoliceId(id);
    }

    @GetMapping("/getQuitt/{id}")
    public QtcQuittanceDTO getquittbyid(@PathVariable Long id){
        return quittanceService.getQuittById(id);
    }
    @PutMapping("")
    public QtcQuittanceDTO update(@RequestBody QtcQuittanceDTO quittanceDTO) {
        return quittanceService.update(quittanceDTO);
    }
    @GetMapping("/ref/{refQuittance}")
    public List<QtcQuittanceDTO> getByRefQuittance(@PathVariable Long refQuittance) {
        return quittanceService.getByRefQuittanceEntity(refQuittance);
    }

    @GetMapping("/date")
    public List<QtcQuittanceDTO> searchByDate(@RequestParam("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut, @RequestParam("dateFin")  @DateTimeFormat(pattern =  "yyyy-MM-dd") Date dateFin) {
        System.out.println(dateFin +" "+dateDebut);
        return quittanceService.searchByDateBetween(dateDebut,dateFin);
    }

    @GetMapping("/codepolice/{codePolice}")
    public List<QtcQuittanceDTO> searchByCodePolice(@PathVariable Long codePolice) {
        return quittanceService.searchByCodePolice(codePolice);
    }
    @GetMapping("/search")
    public ResponseEntity<Page<QuittanceResponse>> searchQuittances(
            @RequestParam(required = false) Long refQuittanceid,
            @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateDebut,
            @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dateFin,
            @RequestParam(required = false) String codePolice,
            @RequestParam() int pageNumber,
            @RequestParam() int pageSize) {

        Page<QuittanceResponse> quittanceDTOs = quittanceService.searchQuittances(refQuittanceid, dateDebut, dateFin, codePolice, pageNumber, pageSize);

        return ResponseEntity.ok(quittanceDTOs);
    }




  /*  @GetMapping("/getAllQuittances")
    public   ResponseEntity<List<QtcQuittanceDTO>>getAllQuittances()  {

        List<QtcQuittanceDTO> quittanceDTOList=quittanceService.getAllQuittances();
        return ResponseEntity.ok(quittanceDTOList);
    }*/

    @GetMapping("/getAllQuittances")
    public ResponseEntity<List<QuittanceResponse>> getAllQuittances() {
        List<QuittanceResponse> quittances = quittanceService.getAllQuittances();
        return new ResponseEntity<>(quittances, HttpStatus.OK);
    }






    @GetMapping("/searchNew")
    public ResponseEntity<Page<QuittanceResponse>> searchQuittances(
            @RequestParam(required = false) String codePolice,
            @RequestParam(required = false) Long refQuittanceId,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        Page<QuittanceResponse> quittancePage = quittanceService.searchQuittances(codePolice, refQuittanceId, dateDebut, dateFin, pageNumber, pageSize);
        return ResponseEntity.ok(quittancePage);
    }

    @GetMapping("/testRef")
    public List<RefQuittanceEntity> refQu()
             {
       List<RefQuittanceEntity> refQu= quittanceService.refQu();

        return refQu;
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveQuittance(@RequestBody String jsonData) {
        try {
            quittanceService.saveQuittance(jsonData);
            return ResponseEntity.ok("Quittance saved successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save quittance. Reason: " + e.getMessage());
        }
    }


    @GetMapping("/qtc/{idQuittance}")
    public ResponseEntity<QtcQuittanceEntity> getQuittanceBy (@PathVariable Long idQuittance)   {
        QtcQuittanceEntity quittance = quittanceService.findquittanceId(idQuittance);
        return ResponseEntity.ok(quittance);
    }


    @GetMapping("/refquittances/{id}")
    public RefQuittanceEntity getRefQuittanceEntityById(@PathVariable Long id) {
        return searchUtils.getRefQuittanceEntityById(id);

    }


    @GetMapping("/maxValues")
    public MaxValuesProjection getMaxExercice() {
        return quittanceService.findMaxValues();
    }

}
