package com.study.practice.study.thread.unsafe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTools {
    private static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = new ThreadLocal();

    public static Date parse(String formatPattern, String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }
    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date);
    }

    public static SimpleDateFormat getSimpleDateFormat(String formatPattern){

        SimpleDateFormat simpleDateFormat = null;
        simpleDateFormat = simpleDateFormatThreadLocal.get();

        if(simpleDateFormat == null){
            simpleDateFormat = new SimpleDateFormat(formatPattern);
            simpleDateFormatThreadLocal.set(simpleDateFormat);
            return simpleDateFormat;
        }

        return simpleDateFormat;

    }
}
