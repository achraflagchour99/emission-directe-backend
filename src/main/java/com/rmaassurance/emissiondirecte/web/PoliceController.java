package com.rmaassurance.emissiondirecte.web;
import com.rmaassurance.emissiondirecte.dtos.request.PoliceDTO;
import com.rmaassurance.emissiondirecte.dtos.request.PoliceSearchCriteriaDTO;
import com.rmaassurance.emissiondirecte.dtos.request.PrdVersioncommercialeDTO;
import com.rmaassurance.emissiondirecte.dtos.request.RefVilleDTO;
import com.rmaassurance.emissiondirecte.services.ImpleService.PoliceServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/polices")
@CrossOrigin(exposedHeaders = "X-Total-Count")
public class PoliceController {
    public PoliceSearchCriteriaDTO policeSearchCriteriaDTO;

    private final PoliceServiceImpl policeService;

    public PoliceController(PoliceServiceImpl policeService) {
        this.policeService = policeService;
    }

    @PostMapping("/add")
    public ResponseEntity<PoliceDTO> addPolice(@RequestBody @Validated PoliceDTO policeDTO) {
        PoliceDTO savedPoliceDTO = policeService.addPolice(policeDTO);
        return ResponseEntity
                .created(URI.create("/polices/" + savedPoliceDTO.getCodePolice()))
                .body(savedPoliceDTO);
    }

    @PutMapping("/{codePolice}")
    public ResponseEntity<PoliceDTO> updatePolice(@PathVariable String codePolice, @RequestBody @Validated PoliceDTO policeDTO) {
        PoliceDTO updatedPoliceDTO = policeService.updatePolice(codePolice, policeDTO);
        return ResponseEntity.ok(updatedPoliceDTO);
    }

    @GetMapping
    public ResponseEntity<List<PoliceDTO>> getAllPolices() {
        List<PoliceDTO> policesDTO = policeService.getAllPolices();
        return ResponseEntity.ok(policesDTO);
    }
    @GetMapping("/consult/{codePolice}")
    public ResponseEntity<PoliceDTO> ConsultPolice(@PathVariable String codePolice) {
        PoliceDTO policeDTO = policeService.getPoliceByCodePolice(codePolice);
        return ResponseEntity.ok(policeDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<List<PoliceDTO>> getPoliceByCriteres(@RequestParam(name = "numClient", required = false) Long numClient,
                                                               @RequestParam(name = "codePolice", required = false) String codePolice,
                                                               @RequestParam(name = "versioncommerciale", required = false) String versioncommerciale,
                                                               @RequestParam(name = "ville", required = false) String ville,
                                                               @RequestParam(name = "page", defaultValue = "0") int page,
                                                               @RequestParam(name = "size", defaultValue = "5") int size) {

        PoliceSearchCriteriaDTO policeSearchCriteriaDTO = new PoliceSearchCriteriaDTO();
        policeSearchCriteriaDTO.setNumClient(numClient);
        policeSearchCriteriaDTO.setCodePolice(codePolice);

        PrdVersioncommercialeDTO prdVersioncommercialeDTO = new PrdVersioncommercialeDTO();
        prdVersioncommercialeDTO.setNomcommercial(versioncommerciale);
        policeSearchCriteriaDTO.setPrdVersioncommerciale(prdVersioncommercialeDTO);

        RefVilleDTO refVilleDTO = new RefVilleDTO();
        refVilleDTO.setLibelle(ville);
        policeSearchCriteriaDTO.setRefVille(refVilleDTO);

        Page<PoliceDTO> policesDTO = policeService.getPoliceByCriteres(policeSearchCriteriaDTO, page, size);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        for (PoliceDTO policeDTO : policesDTO.getContent()) {
            if (policeDTO.getDateEffet() != null) {
                policeDTO.setDateEffetFormatted(dateFormat.format(policeDTO.getDateEffet()));
            }
            if (policeDTO.getDateEtat() != null) {
                policeDTO.setDateEtatFormatted(dateFormat.format(policeDTO.getDateEtat()));
            }
            if (policeDTO.getDateEcheance() != null) {
                policeDTO.setDateEcheanceFormatted(dateFormat.format(policeDTO.getDateEcheance()));
            }
            if (policeDTO.getDateTerme() != null) {
                policeDTO.setDateTermeFormatted(dateFormat.format(policeDTO.getDateTerme()));
            }
        }
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(policesDTO.getTotalElements()))
                .body(policesDTO.getContent());
    }

}

