package com.rmaassurance.emissiondirecte.services.ImpleService;


import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import com.rmaassurance.emissiondirecte.mapper.QuittanceMapper;
import com.rmaassurance.emissiondirecte.repositories.QtcQuittanceEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testSer {
    @Autowired
    private   QtcQuittanceEntityRepository quittanceRepository;
    @Autowired
    private   QuittanceMapper quittanceMapper;





    public String getAllQuittance22() {
        System.out.println("getAllQuittance 3");
        return "quittanceRepository.findAll()";
    }

    public List<QtcQuittanceEntity> getAllQuittance2() {
        System.out.println("getAllQuittance 3");
        return quittanceRepository.findAll();
    }

}
