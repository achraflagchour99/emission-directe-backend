package com.rmaassurance.emissiondirecte.services.Iservice;

import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;

import java.util.List;

public interface IGarantieQuittanceService {
    public void  saveQtcDetail(List<String> jsonData, QtcQuittanceEntity QtcQuittance);
}
