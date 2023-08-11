package com.rmaassurance.emissiondirecte.utils;

import org.springframework.stereotype.Component;

@Component
public class ValidationUtils {

    public static boolean isTaxAmountValid(double prime, double taxAmount) {
        double maxTaxAmount = 0.15 * prime;
        return taxAmount <= maxTaxAmount;
    }
}
