package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmaassurance.emissiondirecte.dtos.request.QtcQuittanceDTO;
import com.rmaassurance.emissiondirecte.dtos.response.QuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.*;
import com.rmaassurance.emissiondirecte.mapper.QuittanceMapper;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.QuittanceMapperResponse;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.RefQtcQuittanceMapperResponse;
import com.rmaassurance.emissiondirecte.projection.MaxValuesProjection;
import com.rmaassurance.emissiondirecte.repositories.*;
import com.rmaassurance.emissiondirecte.services.Iservice.IQuittanceService;
import com.rmaassurance.emissiondirecte.utils.DateUtils;
import com.rmaassurance.emissiondirecte.utils.SearchUtils;
import com.rmaassurance.emissiondirecte.utils.ValidationUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuittanceServiceImpl implements IQuittanceService{

    private final RefQtcQuittanceMapperResponse refQtcQuittanceMapperResponse;
    private final QtcQuittanceEntityRepository quittanceRepository;
    private final QuittanceMapper quittanceMapper;
    private final QuittanceMapperResponse quittanceMapperResponse;
    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final RefQuittanceRepository refQuittanceRepository;
    private final HabUtilisateurEntityRepository habUtilisateurRepository;
    private final QtcRemiseEntityRepository qtcRemiseEntityRepository;
    private final PoliceEntityRepository policeEntityRepository;
    private final DateUtils dateUtils;
    private final ValidationUtils validationUtils;
    private final QtcQuittanceEntityRepository qtcQuittanceRepository;
    private final RefVilleEntityRepository refVilleRepository;

    private final SearchUtils searchUtils;
    private final QtcDetailQuittanceRepository qtcDetailQuittanceRepository;


    @Override
    public QtcQuittanceDTO getQuittById(Long id) {
        QtcQuittanceEntity qtcQuittanceEntity = qtcQuittanceRepository.findById(id).orElseThrow();
        return quittanceMapper.toDto(qtcQuittanceEntity);
    }

    @Override
    public QtcQuittanceEntity save(QtcQuittanceDTO quittanceDTO) {

        try{


       if(quittanceDTO.getTauxcommission()>25  ){
             throw new IllegalArgumentException("Le taux de commission ne peut pas dépasser 25%");
         }
        if(quittanceDTO.getMontantaccessoire() != 0 && quittanceDTO.getMontantaccessoire() != 10 && quittanceDTO.getMontantaccessoire() != 15 && quittanceDTO.getMontantaccessoire() != 20 && quittanceDTO.getMontantaccessoire() != 30){
            throw new IllegalArgumentException("Le montant des ACC doit etre 0 or 10 or 15 or 20 or 30");
        }

        /* if(getQuittanceByPoliceId(quittanceDTO.getPoliceid())){
             throw new IllegalArgumentException("Police  deja  existante");
         }*/
          if(!dateUtils.isStartDateAfterEndDate( quittanceDTO.getDatefin().getTime(),quittanceDTO.getDatedebut().getTime())){
            throw new IllegalArgumentException("Date debut est supp de date Fin \n");

        }
     /*   if(!dateUtils.isStartDateAfterEndDate( quittanceDTO.getDateEcheance().getTime() ,quittanceDTO.getDateeffet().getTime())){
            throw new IllegalArgumentException("Date debut est supp de date Fin \n");
        }
        if(!dateUtils.isStartDateAfterEndDate( quittanceDTO.getDateEcheance().getTime() ,quittanceDTO.getDateTerme().getTime())){
            throw new IllegalArgumentException("Date debut est supp de date Fin \n");
        }
        if(! validationUtils.isTaxAmountValid(quittanceDTO.getPrimenette() , quittanceDTO.getMontanttaxe())){
            throw new IllegalArgumentException("Le montant de la taxe ne doit pas etre  supperieur a 15% de la prime \n");
        }
*/


       /* if (quittanceDTO.getQtcRemiseid() != null){
            throw new IllegalArgumentException("Remise  doit  etre inserer \n");
        }*/

       QtcRemiseEntity remise= saveRemise(Double.valueOf(quittanceDTO.getQtcRemiseid()));

        QtcQuittanceEntity quittanceEntity = quittanceMapper.toEntity(quittanceDTO);

        quittanceEntity.setOrdre(String.valueOf(dateUtils.getCurrentYear()));
        quittanceEntity.setMontontremise(quittanceDTO.getMontontremise());





            quittanceEntity.setIntermediaire(searchUtils.getIntermediaireEntityById(quittanceDTO.getIntermediaireid()));
            // quittanceEntity.setHabUtilisateur(searchUtils.getHabUtilisateurEntityById(quittanceDTO.getHabUtilisateurid()));
            quittanceEntity.setQtcRemise(remise);
            quittanceEntity.setMontontremise(1465D);

                  //  searchUtils.getRefQuittanceEntityById(quittanceDTO.getRefQuittanceid());

           RefQuittanceEntity refQuitt=refQuittanceRepository.findById(quittanceDTO.getRefQuittanceid())
                   .orElseThrow(() -> new IllegalArgumentException("RefQuittance not found with id " + quittanceDTO.getRefQuittance()));


            quittanceEntity.setEtatquittance(searchUtils.getRefQuittanceEntityById(quittanceDTO.getRefQuittanceid()).getEtatQuittance());
            quittanceEntity.setRefQuittance(refQuitt);







          quittanceEntity.setPolice(searchUtils.getPoliceEntityById(quittanceDTO.getPoliceid()));
          //  quittanceEntity.setVille(searchUtils.getRefVilleEntityById(quittanceDTO.getVilleclient()));
        quittanceEntity.setPrdVersioncommerciale(searchUtils.getversioncommercialeById(quittanceDTO.getVersioncommerciale()));




        return qtcQuittanceRepository.save(quittanceEntity);
              //  quittanceMapper.toDto(qtcQuittanceRepository.save(qtcQuittanceEntity));


             }
        catch (Exception e){
            System.out.println(e.getMessage()+e.toString());
            return null;
        }
    }

    public  Long  returnId( QtcQuittanceEntity quittanceEntity){
        return quittanceEntity.getId();


    }

    @Override
    public boolean getQuittanceById(Long id) {
/*        PoliceEntity police= policeEntityRepository.findById(id).orElseThrow();
        System.out.println("policepolice "+police.toString());
        QtcQuittanceEntity qtcQuittanceEntity =  quittanceRepository.findByPolice(police);
        System.out.println("qtcQuittanceEntityqtcQuittanceEntity "+qtcQuittanceEntity.toString());
        System.out.println((qtcQuittanceEntity != null) ? true : false);
        return (qtcQuittanceEntity != null) ? true : false; */
        return false;
    }
    public boolean getQuittanceByPoliceId(Long id) {
         PoliceEntity police= policeEntityRepository.findById(id).orElseThrow();
        QtcQuittanceEntity qtcQuittanceEntity =  quittanceRepository.findByPolice(police);
        return (qtcQuittanceEntity != null) ? true : false;

    }



    @Override
    public Page<QtcQuittanceDTO> getAllQuittance(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<QtcQuittanceEntity> quittancePage = quittanceRepository.findAll(pageable);
        List<QtcQuittanceDTO> quittanceDTOList = quittancePage.getContent()
                .stream()
                .map(quittanceMapper::toDto)
                .collect(Collectors.toList());
        return new PageImpl<>(quittanceDTOList, pageable, quittancePage.getTotalElements());
    }


    @Override
    public QtcQuittanceDTO update(QtcQuittanceDTO quittanceDTO) {

        QtcQuittanceEntity quittanceEntity = qtcQuittanceRepository.findById(quittanceDTO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Quittance not found"));


        System.out.println("Dady mocking "+quittanceDTO.getDateemission().getTime());


       // quittanceEntity.setPolice(searchUtils.getPoliceEntityById(quittanceDTO.getPoliceid()));

        quittanceEntity.setDatedebut(quittanceDTO.getDatedebut().getTime());
        quittanceEntity.setDatefin(quittanceDTO.getDatefin().getTime());
        quittanceEntity.setDateemission(quittanceDTO.getDateemission());
        quittanceEntity.setDateetat(quittanceDTO.getDateetat().getTime());
        quittanceEntity = qtcQuittanceRepository.save(quittanceEntity);
        return quittanceMapper.toDto(quittanceEntity);
    }
    @Override
    public List<QtcQuittanceDTO> getByRefQuittanceEntity(Long refQuittanceid) {

  /* RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceid).orElseThrow();//1L
        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findByRefQuittance(refQuittance);
        return quittanceMapper.toQuittanceDTOList(quittanceEntities);
*/
        return null;
    }

    @Override
    public List<QtcQuittanceDTO> searchByDateBetween(Date dateDebut, Date dateFin) {

//  List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findAllByDatefinBetween(dateDebut, dateFin);
//        return quittanceMapper.toQuittanceDTOList(quittanceEntities);*//*

        return null;
    }

    @Override
    public List<QtcQuittanceDTO> searchByCodePolice(Long codePolice) {

/*  PoliceEntity police=policeEntityRepository.findById(codePolice).orElseThrow();//1L || 3

        List<QtcQuittanceEntity> quittanceEntities = quittanceRepository.findAllByPolice(police);


 return quittanceMapper.toQuittanceDTOList(quittanceEntities); */


        return  null;
    }



/*     @Override
    public Page<QuittanceResponse> searchQuittances(Long refQuittanceid, Calendar dateDebut, Calendar dateFin, Long codePolice, int pageNumber, int pageSize) {
        RefQuittanceEntity refQuittance = null;
        PoliceEntity police = null;
        List<QtcQuittanceEntity> quittanceEntities = null;

        if (refQuittanceid != null) {
            refQuittance = refQuittanceRepository.findById(refQuittanceid).orElseThrow();
            quittanceEntities = quittanceRepository.findByRefQuittance(refQuittance);
        } else if (dateDebut != null && dateFin != null) {
            quittanceEntities = quittanceRepository.findAllByDatefinBetween(dateDebut, dateFin);
        } else if (codePolice != null) {
            police = policeEntityRepository.findById(codePolice).orElseThrow();
            quittanceEntities = quittanceRepository.findAllByPolice(police);
        } else {
            quittanceEntities = quittanceRepository.findAll();
            // throw new IllegalArgumentException("At least one parameter must be non-null.");
        }
       // Pageable paging = PageRequest.of(pageNumber, pageSize);
        Page<QtcQuittanceEntity> pagedResult = new PageImpl<>(quittanceEntities, paging, quittanceEntities.size());
        return pagedResult.map(quittanceMapper::toDto);

        Pageable paging = PageRequest.of(pageNumber, pageSize);
        int startIndex = paging.getPageNumber() * paging.getPageSize();
        int endIndex = Math.min(startIndex + paging.getPageSize(), quittanceEntities.size());
        List<QtcQuittanceEntity> pageContent = quittanceEntities.subList(startIndex, endIndex);
        Page<QtcQuittanceEntity> pagedResult = new PageImpl<>(pageContent, paging, quittanceEntities.size());
        return pagedResult.map(quittanceMapperResponse::toDto);
    } */

     @Override
    public Page<QuittanceResponse> searchQuittances(Long refQuittanceid, Date dateDebut, Date dateFin, String codePolice, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        if (refQuittanceid != null) {
            RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceid).orElseThrow();
            return quittanceRepository.findByRefQuittance(refQuittance, pageable).map(quittanceMapperResponse::toDto);
        } else if (dateDebut != null && dateFin != null) {
            return quittanceRepository.findAllByDatefinBetween(dateDebut, dateFin, pageable).map(quittanceMapperResponse::toDto);
        } else if (codePolice != null) {
            PoliceEntity police = policeEntityRepository.findByCodePolice(codePolice);
            return quittanceRepository.findAllByPolice(police, pageable).map(quittanceMapperResponse::toDto);
        } else {
            return quittanceRepository.findAll(pageable).map(quittanceMapperResponse::toDto);
        }
    }




    public List<QuittanceResponse> getAllQuittances() {
        return quittanceRepository.findAll()
                .stream()
                .map(quittanceMapperResponse::toDto)
                .collect(Collectors.toList());
    }




    public List<RefQuittanceEntity> refQu() {
        List<RefQuittanceEntity> refQu= refQuittanceRepository.findAll();
        return refQu;
    }

    public Page<QuittanceResponse> searchQuittances(String codePolice, Long refQuittanceId, Date dateDebut, Date dateFin, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        if (StringUtils.isEmpty(codePolice) && refQuittanceId == null && dateDebut == null && dateFin == null) {

            // Récupérer toutes les données sans critère de recherchesout

            return qtcQuittanceRepository.findAll(pageable).map(quittanceMapperResponse::toDto);
        } else {
            Page<QtcQuittanceEntity> quittancePage;

            if (!StringUtils.isEmpty(codePolice) && refQuittanceId != null && dateDebut != null && dateFin != null) {
                // Recherche par police, refQuittance, date de début et date de fin
                PoliceEntity police = policeEntityRepository.findByCodePolice(codePolice);
                RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceId).orElseThrow();
                quittancePage = qtcQuittanceRepository.findByPoliceAndRefQuittanceAndDatefinBetween(police, refQuittance, dateDebut, dateFin, pageable);
            } else if (!StringUtils.isEmpty(codePolice) && refQuittanceId != null) {
                // Recherche par police et refQuittance
                PoliceEntity police = policeEntityRepository.findByCodePolice(codePolice);
                RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceId).orElseThrow();
                quittancePage = qtcQuittanceRepository.findByPoliceAndRefQuittance(police, refQuittance, pageable);
            } else if (!StringUtils.isEmpty(codePolice) && dateDebut != null && dateFin != null) {
                // Recherche par police, date de début et date de fin
                PoliceEntity police = policeEntityRepository.findByCodePolice(codePolice);
                quittancePage = qtcQuittanceRepository.findByPoliceAndDatefinBetween(police, dateDebut, dateFin, pageable);
            } else if (refQuittanceId != null && dateDebut != null && dateFin != null) {
                // Recherche par refQuittance, date de début et date de fin
                RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceId).orElseThrow();
                quittancePage = qtcQuittanceRepository.findByRefQuittanceAndDatefinBetween(refQuittance, dateDebut, dateFin, pageable);
            } else if (!StringUtils.isEmpty(codePolice)) {
                // Recherche par police uniquement
                PoliceEntity police = policeEntityRepository.findByCodePolice(codePolice);
                quittancePage = qtcQuittanceRepository.findByPolice(police, pageable);
            } else if (refQuittanceId != null) {
                // Recherche par refQuittance uniquement
                RefQuittanceEntity refQuittance = refQuittanceRepository.findById(refQuittanceId).orElseThrow();
                quittancePage = qtcQuittanceRepository.findByRefQuittance(refQuittance, pageable);
            } else if (dateDebut != null && dateFin != null) {
                // Recherche par date de début et date de fin uniquement
                quittancePage = qtcQuittanceRepository.findAllByDatefinBetween(dateDebut, dateFin, pageable);
            }else {
                // Recherche par date de début et date de fin uniquement
                quittancePage = qtcQuittanceRepository.findAllByDatefinBetween(dateDebut, dateFin, pageable);
            }

            return quittancePage.map(quittanceMapperResponse::toDto);
        }
    }



    public QtcRemiseEntity saveRemise(Double prix) {
        if (prix != null) {
            QtcRemiseEntity remise = new QtcRemiseEntity();
            remise.setMontantremise(prix);
            return qtcRemiseEntityRepository.save(remise);
        }
        else {
            throw new RuntimeException("Remise  Error   (prix ou  remise not found)");
        }

    }





    public QtcQuittanceEntity saveQuittance(String jsonData) throws JsonProcessingException {
        try {
            QtcQuittanceDTO quittance;

            // Add logging to see the JSON data being passed
            System.out.println("JSON Data: " + jsonData);

            ObjectMapper objectMapper = new ObjectMapper();

            // Add logging to see if the object mapper is correctly initialized
            System.out.println("Object Mapper Initialized.");

            quittance = objectMapper.readValue(jsonData, QtcQuittanceDTO.class);

            // Add logging to see if the deserialization is successful
            System.out.println("Deserialization successful. Quittance DTO: " + quittance);

            //Methode save quittance
            return save(quittance);
        } catch (Exception e) {
            // Handle the exception or log an error along with the JSON data
            System.err.println("Failed to process quittance JSON. JSON Data: " + jsonData);
            e.printStackTrace();
            throw new RuntimeException("Failed to process quittance JSON.", e);

    }

    }


 /*   public QtcQuittanceEntity findquittanceId( ) {
              QtcQuittanceEntity qtc=quittanceRepository.findById(7402L).orElseThrow(() -> new RuntimeException("Quittance not found"));
         System.out.println( qtc.toString());

        return null;
    }*/



    public   QtcQuittanceEntity findquittanceId(Long idQuittance) {
        QtcQuittanceEntity qtc = qtcQuittanceRepository.findById(idQuittance).orElseThrow();
        QuittanceResponse quittanceResponse= quittanceMapperResponse.toDto(qtc);
        return quittanceMapperResponse.toEntity(quittanceResponse);
    }

    public MaxValuesProjection findMaxValues(){
        return qtcQuittanceRepository.findMaxValues();
    }




}
