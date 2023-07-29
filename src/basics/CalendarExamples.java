/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.util.Calendar;

/**
 *
 * @author Abhi
 */
public class CalendarExamples {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;  // January is 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
        System.out.println("Current Time: " + hour + ":" + minute + ":" + second);
//        System.out.println("\n--EXAMPLE OVER--\n");
//        calendar.set(Calendar.YEAR, 2023);
//        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
//        calendar.set(Calendar.DAY_OF_MONTH, 7);
//        System.out.println("Updated date: " + calendar.getTime());
//        System.out.println("\n--EXAMPLE OVER--\n");
//        calendar.add(Calendar.MONTH, 1);
//        calendar.add(Calendar.DAY_OF_MONTH, -10);
//        System.out.println("Modified date: " + calendar.getTime());
//        System.out.println("\n--EXAMPLE OVER--\n");
//        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
//        System.out.println("Maximum day of month: " + maxDayOfMonth);
//        System.out.println("Minimum day of month: " + minDayOfMonth);
//        System.out.println("\n--EXAMPLE OVER--\n");
//        calendar.roll(Calendar.MONTH, true);
//        calendar.roll(Calendar.DATE, false);
//        System.out.println("Rolled date: " + calendar.getTime());
//        System.out.println("\n--EXAMPLE OVER--\n");
//        int weekYear = calendar.getWeekYear();
//        System.out.println("Week year: " + weekYear);
//        System.out.println("\n--EXAMPLE OVER--\n");
//        System.out.println("Weeks in week year:" + calendar.getWeeksInWeekYear());
//        System.out.println("\n--EXAMPLE OVER--\n");
//        System.out.println("TimeZone: " + calendar.getTimeZone().getDisplayName());
//          System.out.println("\n--EXAMPLE OVER--\n");
//          System.out.println("Type of Calendar is " +  calendar.getCalendarType());  
//          System.out.println("\n--EXAMPLE OVER--\n");
        System.out.println("Current time in Millis : " + calendar.getTimeInMillis()); 
        
    }
}
