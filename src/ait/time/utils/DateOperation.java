package ait.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOperation {
    public static int getAge(String birthDate) {



        LocalDate birthDayLocalDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));

        long result = ChronoUnit.YEARS.between(birthDayLocalDate, LocalDate.now());




        return (int) result;
    }

    public static String[] sortStringDates(String[] dates) {

        return null;
    }
}
