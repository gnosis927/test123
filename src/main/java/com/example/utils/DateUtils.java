package com.example.utils;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/*
 *时间工具类
 */

public class DateUtils {
    public static final String STANDARD="yyyy-MM-dd HH:mm:ss";

    /*
     *String转Date
     */
    public static Date stringToDate(String strDate){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(STANDARD);
        DateTime dateTime=dateTimeFormatter.parseDateTime(strDate);
        return dateTime.toDate();
    }
    /*
     *Date转String
     */
    public static String dataToString(Date date){
       if(null==date){
           return StringUtils.EMPTY;
       }
       DateTime dateTime=new DateTime(date);
       return dateTime.toString();
    }
}
