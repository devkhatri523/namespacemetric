package com.example.springmongodb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static Date parseDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss zzz");
        return dateFormat.parse(date);

    }
}
