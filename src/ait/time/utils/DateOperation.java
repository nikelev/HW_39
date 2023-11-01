package ait.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
    public static int getAge(String birthDate) {



        LocalDate birthDayLocalDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));

        long result = ChronoUnit.YEARS.between(birthDayLocalDate, LocalDate.now());




        return (int) result;
    }

    public static String[] sortStringDates(String[] dates) {
        String [] result= Arrays.copyOf(dates,dates.length);
        DateTimeFormatter dateForm= DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        Arrays.sort(result, (d1,d2)->{
            LocalDate d1LocalDate=LocalDate.parse(d1,dateForm);
            LocalDate d2LocalDate=LocalDate.parse(d2,dateForm);
            return d1LocalDate.compareTo(d2LocalDate);


        });



        return result;
    }
}
