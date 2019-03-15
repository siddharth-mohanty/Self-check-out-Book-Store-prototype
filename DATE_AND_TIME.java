import java.util.*;

public class DATE_AND_TIME extends SPACEDOT
{
    public static void getDateandTime()
    {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();//constructor initialised

        day = date.get(Calendar.DAY_OF_MONTH);//constructor used to get the non static metho
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        long j;

        System.out.println("Date : "+day+"/"+(month+1)+"/"+year);
        if(date.get(Calendar.HOUR_OF_DAY)<12)

        {
            if(minute<10)
                System.out.println("Time : "+hour+" : 0"+minute+" AM");

            else
                System.out.println("Time : "+hour+" : "+minute+" AM");

        }

      
        if(date.get(Calendar.HOUR_OF_DAY)>= 12)

        {
            if(minute<10)
                System.out.println("Time : "+hour+" : 0"+minute+" PM");

            else
                System.out.println("Time : "+hour+" : "+minute+" PM");

        }

      
    }
}