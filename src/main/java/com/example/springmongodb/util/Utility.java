package com.example.springmongodb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Utility {

    public static Date parseDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss zzz");
        return dateFormat.parse(date);

    }

    public static void main(String[] args) throws ParseException {
        String timestamp = "2023-10-04T20:16:30Z";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = outputFormat.parse(outputFormat.format(inputFormat.parse(timestamp)));

        System.out.println("Georgian Date: " + date1);
    }
}
