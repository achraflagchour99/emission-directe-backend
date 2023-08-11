package com.rmaassurance.emissiondirecte.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;


public class QuittanceCountByYearDTO {
    @JsonProperty("YEAR")
    private BigDecimal YEAR;
    @JsonProperty("COUNT")
    private Long COUNT;

    public QuittanceCountByYearDTO(BigDecimal year, Long count) {
        this.YEAR = year;
        this.COUNT = count;
    }




}
