package gr.aueb.cf.notesapp.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateStampHelper {
    public static String getDateStamp() {
        long currentTime = System.currentTimeMillis(); //getting current time in millis
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        String showTime = String.format("%1$tI:%1$tM:%1$tS%1$Tp", calendar);
        ///current  date
        Date now = new Date();
        long timestamp = now.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        String dateStr = sdf.format(timestamp);
        String dateStamp = showTime + dateStr;

        return dateStamp;
    }

    public static long getTimeStampInMilliSeconds() {
        Date now = new Date();
        return now.getTime();
    }

}
