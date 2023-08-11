package com.rmaassurance.emissiondirecte.constants;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public final class GlobalConst {
    public static final String codeService = "W1041";
    public static final List<Integer> DE_PRODUITS = Arrays.asList(77, 67, 66, 63);
    public static final double DE_TAUX_APPLICABLE = 0.1;
    public static final LocalDate DE_DATE_APPLICATION = LocalDate.of(2019, 1, 1);
    public static final LocalDate EVE_DATE_MISE_EN_VIGUEUR = LocalDate.of(2020, 1, 1);
    public static final double EVE_TAUX_TAXE_PARA = 0.01;
    public static final double TAXE_SUR_COMMISSION = 0.14;
    public static final boolean CTRL_PRIME_REMISE = true;


    private GlobalConst() {

    }
}
