package com.rmaassurance.emissiondirecte.web;

import lombok.Data;

import java.util.List;

@Data
public class SaveQuittanceRequest {
    private String Quittance;
    private List<String> jsonData;

    // Add getters and setters
}
