package com.rmaassurance.emissiondirecte.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class DateUtils {
    public  int getCurrentYear(){
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    public static boolean isStartDateAfterEndDate(Date startDate, Date endDate) {
        return startDate.after(endDate);
    }

}
