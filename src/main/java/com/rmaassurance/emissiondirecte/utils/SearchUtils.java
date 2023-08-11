package com.rmaassurance.emissiondirecte.utils;


import com.rmaassurance.emissiondirecte.entities.*;
import com.rmaassurance.emissiondirecte.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchUtils {
    private final QtcQuittanceEntityRepository quittanceRepository;
    private final IntermediaireEntityRepository intermediaireEntityRepository;
    private final RefQuittanceRepository refQuittanceRepository;
    private final HabUtilisateurEntityRepository habUtilisateurRepository;
    private final QtcRemiseEntityRepository qtcRemiseEntityRepository;
    private final PoliceEntityRepository policeEntityRepository;
    private final QtcQuittanceEntityRepository qtcQuittanceRepository;
    private final RefVilleEntityRepository refVilleRepository;
    private final PrdVersioncommercialeEntityRepository prdVersioncommerciale;

    public PrdVersioncommercialeEntity getversioncommercialeById(long id) {
        return prdVersioncommerciale.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("prdVersioncommerciale not found with id " + id));
    }
    public IntermediaireEntity getIntermediaireEntityById(Long id) {
        return intermediaireEntityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Intermediaire not found with id " + id));
    }

    public RefQuittanceEntity getRefQuittanceEntityById(Long id) {
        return refQuittanceRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("RefQuittance not found with id " + id));
    }

    public HabUtilisateurEntity getHabUtilisateurEntityById(Long id) {
        return habUtilisateurRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("HabUtilisateur not found with id " + id));
    }

    public QtcRemiseEntity getQtcRemiseEntityById(Long id) {
        return qtcRemiseEntityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("QtcRemise not found with id " + id));
    }

    public PoliceEntity getPoliceEntityById(Long id) {
        return policeEntityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Police not found with id " + id));
    }

    public RefVilleEntity getRefVilleEntityById(Long id) {
        return refVilleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("RefVille not found with id " + id));
    }
}
