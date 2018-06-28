package com.text.demo.tools;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ConvertDate {
    public static final String DATE_HOUR = "yyyy-MM-dd HH:mm";
    public static String convertDate(Date date,String formatData){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(date);
    }
}
