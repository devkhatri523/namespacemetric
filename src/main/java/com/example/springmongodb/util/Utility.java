package com.example.springmongodb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Utility {
    private static final String ISO_FORMAT="yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String LOCAL_FORMAT ="yyyy-MM-dd'T'HH:mm:ss";

    public static LocalDateTime parseDate(String date) throws ParseException {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(ISO_FORMAT);
        LocalDateTime ldt = LocalDateTime.parse(date, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(LOCAL_FORMAT);
        return LocalDateTime.parse(ldt.toString(),outputFormatter);

    }


    public static void main(String[] args) throws ParseException {
        System.out.println(getFormattedDateString(LocalDateTime.now().minusMinutes(15)));
    }





    /* add this line on your query url formatter
     .queryParam("from",getFormattedDateString(LocalDateTime.now().minusMinutes(15))).
     queryParam("to",getFormattedDateString(LocalDateTime.now().minusMinutes(15)))

     */

    public static String  getFormattedDateString(LocalDateTime dateTime) throws ParseException {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(LOCAL_FORMAT);
        return dateTime.format(inputFormatter);

    }




}
