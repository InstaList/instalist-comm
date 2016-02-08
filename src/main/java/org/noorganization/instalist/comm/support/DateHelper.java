package org.noorganization.instalist.comm.support;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static final String FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    public static Date parseDate(String _dateString) {
        SimpleDateFormat parser = new SimpleDateFormat(FORMAT);
        try {
            return parser.parse(_dateString);
        } catch (ParseException _e) {
            return null;
        }
    }

    public static String writeDate(Date _date) {
        SimpleDateFormat parser = new SimpleDateFormat(FORMAT);
        return parser.format(_date);
    }
}