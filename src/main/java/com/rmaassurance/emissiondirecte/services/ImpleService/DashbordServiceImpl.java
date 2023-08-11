package com.rmaassurance.emissiondirecte.services.ImpleService;

import com.rmaassurance.emissiondirecte.dtos.response.QuittanceCountByYearDTO;
import com.rmaassurance.emissiondirecte.repositories.PoliceEntityRepository;
import com.rmaassurance.emissiondirecte.repositories.QtcQuittanceEntityRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashbordServiceImpl {
    private final QtcQuittanceEntityRepository quittanceRepository;
    private final PoliceEntityRepository policeRepository;

    public DashbordServiceImpl(QtcQuittanceEntityRepository quittanceRepository, PoliceEntityRepository policeRepository) {
        this.quittanceRepository = quittanceRepository;
        this.policeRepository = policeRepository;
    }

    public long countQuittance() {
        return quittanceRepository.count();
    }
    public long countPolice() {
        return policeRepository.count();
    }
    public long countValidatedQuittancesByRefQuittanceId() {
        return quittanceRepository.countValidatedQuittancesByRefQuittanceId(1l);
    }
    public long SumValidatedQuittancesByRefQuittanceId() {
        return quittanceRepository.SumValidatedQuittancesByRefQuittanceId(1l);
    }

    public List<QuittanceCountByYearDTO> countQuittancesByYear() {
        List<Object[]> result = quittanceRepository.countQuittancesByYear();
        return result.stream()
                .map(obj -> new QuittanceCountByYearDTO((BigDecimal) obj[0], ((BigDecimal) obj[1]).longValue()))
                .collect(Collectors.toList());
    }



}
