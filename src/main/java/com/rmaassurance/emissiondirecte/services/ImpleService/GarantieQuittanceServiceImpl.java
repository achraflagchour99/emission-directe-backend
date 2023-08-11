package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmaassurance.emissiondirecte.dtos.request.QtcDetailquittanceDTO;
import com.rmaassurance.emissiondirecte.dtos.request.QtcQuittanceDTO;
import com.rmaassurance.emissiondirecte.dtos.response.QtcDetailquittanceResponse;
import com.rmaassurance.emissiondirecte.dtos.response.QuittanceResponse;
import com.rmaassurance.emissiondirecte.entities.QtcDetailquittanceEntity;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import com.rmaassurance.emissiondirecte.mapper.DetailQuittanceGarantie;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.QtcDetailquittanceMapperResponse;
import com.rmaassurance.emissiondirecte.mapper.responseMapper.QuittanceMapperResponse;
import com.rmaassurance.emissiondirecte.repositories.QtcDetailQuittanceRepository;
import com.rmaassurance.emissiondirecte.repositories.QtcQuittanceEntityRepository;
import com.rmaassurance.emissiondirecte.services.Iservice.IGarantieQuittanceService;
import org.hibernate.Hibernate;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarantieQuittanceServiceImpl implements IGarantieQuittanceService {
    private final QtcDetailquittanceMapperResponse mapperResponse;
    private final QtcQuittanceEntityRepository quittanceRepository;
    private final QuittanceMapperResponse quittanceMapperResponse;
    private static QtcDetailQuittanceRepository qtcDetailQuittanceRepository;
    private final   QtcDetailQuittanceRepository qtcDetailQuittanceRepository2;
    private final QtcQuittanceEntityRepository qtcQuittanceEntityRepository;
    private final DetailQuittanceGarantie mapper;
    private final QuittanceServiceImpl quittanceServiceImpl;
    public GarantieQuittanceServiceImpl(  QtcQuittanceEntityRepository quittanceRepository, QuittanceMapperResponse quittanceMapperResponse, QtcDetailQuittanceRepository qtcDetailQuittanceRepository, QtcQuittanceEntityRepository qtcQuittanceEntityRepository, DetailQuittanceGarantie mapper, QuittanceServiceImpl quittanceServiceImpl, QtcDetailquittanceMapperResponse mapperResponse, QtcDetailQuittanceRepository qtcDetailQuittanceRepository2) {

        this.quittanceRepository = quittanceRepository;
        this.quittanceMapperResponse = quittanceMapperResponse;
        this.qtcDetailQuittanceRepository = qtcDetailQuittanceRepository;
        this.qtcQuittanceEntityRepository = qtcQuittanceEntityRepository;
        this.mapper = mapper;
        this.quittanceServiceImpl = quittanceServiceImpl;
        this.mapperResponse = mapperResponse;
        this.qtcDetailQuittanceRepository2 = qtcDetailQuittanceRepository2;
    }


    @Override
    public void saveQtcDetail(List<String> jsonData,QtcQuittanceEntity  QtcQuittance) {


        System.out.println(jsonData);
        System.out.println("test 1 quittanceSearch "+QtcQuittance.toString());
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            double Tauxtaxe=0;
            double Primenette=0;
            double Montantaccessoire=0;
            double Tauxcommission=0;
            double Montantcommision=0;
            double TauxPrimeEVE=0;
            double PrimeGareEve=0;
            double TauxTaxeParafiscale=0;

            for (String json : jsonData) {
                System.out.println("test 2  " );
                QtcDetailquittanceEntity entity = objectMapper.readValue(json, QtcDetailquittanceEntity.class);
                QtcDetailquittanceEntity qtcDetailquittanceEntity=new QtcDetailquittanceEntity();
                System.out.println("koulla "+json);
                //Ajouter les  attributs
                System.out.println("Ajouter les  attributs "+entity.getId() +" "+entity.getLibelle()  );
                //Ajouter  quittance
                qtcDetailquittanceEntity.setQtcQuittance(QtcQuittance);
                entity.setQtcQuittance(QtcQuittance);

                qtcDetailquittanceEntity.setIdgarantie(entity.getId());
                qtcDetailquittanceEntity.setLibelle(entity.getLibelle());
                qtcDetailquittanceEntity.setPrimenette(entity.getPrimenette());
                qtcDetailquittanceEntity.setTauxtaxe(entity.getTauxtaxe());
                qtcDetailquittanceEntity.setMontantaccessoire(entity.getMontantaccessoire());
                qtcDetailquittanceEntity.setTauxcommission(entity.getTauxcommission());

                 qtcDetailquittanceEntity.setMontantcommision(entity.getMontantcommision());
                qtcDetailquittanceEntity.setPrimeGareEve(entity.getPrimeGareEve());
                qtcDetailquittanceEntity.setTauxTaxeParafiscale(entity.getTauxTaxeParafiscale());
                qtcDetailquittanceEntity.setTauxPrimeEVE(entity.getTauxPrimeEVE());
                // Save the entity qtcDetailquittanceEntity to the repository
                SaveGarantie(entity);




            }




        } catch (Exception e) {
            // Handle the exception or log an error
            System.err.println("Failed to process quittance JSON. JSON Data: " + jsonData);
            e.printStackTrace();
            throw new RuntimeException("Failed to process quittance JSON.", e);

        }
    }

    public void saveQuittanceDetailGarantie(String Quittance,List<String> jsonData) throws JsonProcessingException {

        try{
            QtcQuittanceEntity qtcQuittance= quittanceServiceImpl.saveQuittance(Quittance);


            QtcQuittanceEntity qtc = quittanceRepository.findById(qtcQuittance.getId()).orElseThrow();

            QuittanceResponse quittanceResponse= quittanceMapperResponse.toDto(qtc);

            quittanceMapperResponse.toEntity(quittanceResponse);


            saveQtcDetail(  jsonData,quittanceMapperResponse.toEntity(quittanceResponse));

        }
        catch (Exception e){
            throw new RuntimeException(e.toString());
        }
    }

    public QtcQuittanceEntity findById(Long id) throws ChangeSetPersister.NotFoundException {
        return qtcQuittanceEntityRepository.findById(id)
                .orElseThrow(() -> new ChangeSetPersister.NotFoundException());
    }



    public static void  SaveGarantie( QtcDetailquittanceEntity qtcDetailquittanceEntity){
        //Ajouter  quittance
        //   qtcDetailquittanceEntity.setQtcQuittance(QtcQuittance);
        //Ajouter les  attributs

        qtcDetailQuittanceRepository.save(qtcDetailquittanceEntity);
    }





    /*public List<QtcDetailquittanceResponse> getQtcDetailquittanceByQuittance(Long quittanceId) {
        List<QtcDetailquittanceEntity> entities = qtcDetailQuittanceRepository2.findByQuittance(quittanceId);
        return mapperResponse.toResponseList(entities);
    }*/


    public List<QtcDetailquittanceResponse> getQtcDetailquittanceByQuittance(Long quittanceId) {

        QtcQuittanceEntity qtc = quittanceRepository.findById(quittanceId).orElseThrow();

        QuittanceResponse quittanceResponse= quittanceMapperResponse.toDto(qtc);

        System.out.println( quittanceMapperResponse.toEntity(quittanceResponse));

        List<QtcDetailquittanceEntity> entities = qtcDetailQuittanceRepository2.findByQtcQuittance(quittanceMapperResponse.toEntity(quittanceResponse));

        // Use the mapper to convert entities to DTOs
        List<QtcDetailquittanceResponse> dtos = mapperResponse.toResponseList(entities);

        return dtos;
    }

    public List<QtcDetailquittanceResponse> findQuittanceByQuittanceNumber(long quittanceNumber) {

        List<QtcDetailquittanceEntity> entities = qtcDetailQuittanceRepository2.findByQtcQuittance(quittanceNumber);
        //    List<QtcDetailquittanceEntity> entities = qtcDetailQuittanceRepository2.findByQuittance(quittanceNumber);
        //  qtcDetailQuittanceRepository2.findByQuittance(quittanceNumber)
        // return mapperResponse.toResponseList(entities);
        return  null;
    }



    public QtcDetailquittanceResponse update(QtcDetailquittanceResponse qtcDetailquittanceDTO) {
      try{  System.out.println("Ganrti78 "+qtcDetailquittanceDTO);
    } catch (Exception e) {
        // Handle the exception or log an error along with the JSON data
        System.err.println("Failed to process quittance JSON. JSON Data: " + qtcDetailquittanceDTO);
          System.err.println("Failed to process quittance JSON. JSON Data: " + e);
        e.printStackTrace();
        throw new RuntimeException("Failed to process quittance JSON.", e);

    }
        QtcDetailquittanceEntity qtcDetailquittanceEntity = qtcDetailQuittanceRepository2.findById(qtcDetailquittanceDTO.getId())
                .orElseThrow(() -> new IllegalArgumentException("qtcDetailquittanceEntity not found"));


        System.out.println("Dady mocking "+qtcDetailquittanceDTO.getTauxPrimeEve());
        System.out.println("Ganrtiee "+qtcDetailquittanceDTO.getMontantcommision());

        // quittanceEntity.setPolice(searchUtils.getPoliceEntityById(quittanceDTO.getPoliceid()));

        qtcDetailquittanceEntity.setPrimenette(qtcDetailquittanceDTO.getPrimenette());
        qtcDetailquittanceEntity.setMontantcommision(qtcDetailquittanceDTO.getMontantcommision());
        qtcDetailquittanceEntity.setTauxTaxeParafiscale(qtcDetailquittanceDTO.getTauxTaxeParafiscale());
        qtcDetailquittanceEntity.setPrimeGareEve(qtcDetailquittanceDTO.getPrimeGareEve());
        qtcDetailquittanceEntity.setTauxtaxe(qtcDetailquittanceDTO.getTauxtaxe());
        qtcDetailquittanceEntity.setTauxcommission(qtcDetailquittanceDTO.getTauxcommission());
        qtcDetailquittanceEntity.setMontantaccessoire(qtcDetailquittanceDTO.getMontantaccessoire());

         qtcDetailQuittanceRepository2.save(qtcDetailquittanceEntity);

        return mapperResponse.toResponse(qtcDetailquittanceEntity) ;
    }
}
