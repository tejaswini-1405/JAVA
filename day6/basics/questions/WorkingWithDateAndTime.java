package basics.questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Date: " +date);
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date & Time: " + dateTime);
        /*
        display the day of the month
        display the day of year
        display the week Name, Month Name, month Number
        E - Name of the day;(mon -Sun)
        D - Day of the year (1-366) (including leap year)
        dd - Day of the month (1-31)
        M - Month Number(1-12)
        MMM-Month name- jan-Dec
         */
        DateTimeFormatter format= DateTimeFormatter.ofPattern("E, MMM , YYYY");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formattedn date is:" + formattedDateTime);

    }
}
