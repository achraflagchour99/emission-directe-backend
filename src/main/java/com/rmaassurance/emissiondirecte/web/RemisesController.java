package com.rmaassurance.emissiondirecte.web;
import com.rmaassurance.emissiondirecte.constants.GlobalConst;
import com.rmaassurance.emissiondirecte.dtos.response.RemiseDTO;
import com.rmaassurance.emissiondirecte.generatedClasses.*;
import com.rmaassurance.emissiondirecte.generatedClasses.Exception;
import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ws.client.core.WebServiceTemplate;
@RestController
@RequestMapping("/remises")
@CrossOrigin
public class RemisesController {


    @Autowired
    private final WebServiceTemplate webServiceTemplate;

    public RemisesController(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    @GetMapping("/search")
    public RemiseDTO searchRemises(@RequestParam String numRemise) throws Exception {
        ObjectFactory objectFactory = new ObjectFactory();
        RemiseDTO remiseDTO = new RemiseDTO();
        SearchRemisesVO searchRemisesVO = objectFactory.createSearchRemisesVO();
        searchRemisesVO.setRemiseBancaire(numRemise);
        searchRemisesVO.setCodeService(GlobalConst.codeService);
        SearchRemises searchRemises = objectFactory.createSearchRemises();
        searchRemises.setEntiteVO(searchRemisesVO);

        JAXBElement searchremises = objectFactory.createSearchRemises(searchRemises);

        // Appeler le web service
        JAXBElement<SearchRemisesResponse> response = (JAXBElement<SearchRemisesResponse>) webServiceTemplate.marshalSendAndReceive(searchremises);
        SearchRemisesResponse searchRemisesResponse = response.getValue();
        ResultVO remise = searchRemisesResponse.getReturn();
        // Vérifier que le résultat est de type ResultVO
        if (remise instanceof ResultVO) {
            ResultVO result = (ResultVO) remise;
            // Récuperer la valeur d'entrée de MyEntry à travers l'Adapter et retourner l'objet remisesBancairesVO
            if (result.getResult() != null && result.getResult() instanceof Adapter) {
                Adapter adapter = (Adapter) result.getResult();
                if (adapter.getFEntries() != null && !adapter.getFEntries().isEmpty()) {
                    MyEntry myEntry = adapter.getFEntries().get(0);
                    if (myEntry.getFValue() instanceof RemisesBancairesVO) {
                        RemisesBancairesVO remisesBancairesVO = (RemisesBancairesVO) myEntry.getFValue();
                        remiseDTO.setMontantRemise(Float.parseFloat(remisesBancairesVO.getMontantRemise()));
                        return remiseDTO;
                    }
                }
            }
        }

        return null;
    }
}
