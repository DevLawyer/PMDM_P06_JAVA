package Controller;

/**
 * 
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 * 
 * This class is used to turn String objects to GregorianCalendar objects and vice versa.
 * It also has the tools required to check if a certain amount of time has passed
 * between two dates.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateParser {
    /**
     * A SimpleDateFormat will be used to format Strings.
     */
    static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /*------------------------------------------------------------------------*/
    // Converts from a String to a GregorianCalendar.
    public static GregorianCalendar parseDate(String date) {
        /** Strig parameter must have the following format: DD/MM/YYYY
         * We will use the following constructor from GregorianCalendar
         * GregorianCalendar(int year, int month, int day)
         * To extract the day, month, ad year from the String, we will use the
         * substring() method, and then convert that substring to an int.
         */
        GregorianCalendar cal = null;

        try {

            // Try to create a GregorianCalendar object.
            cal = new GregorianCalendar(
                    Integer.parseInt(date.substring(0, 4)),
                    Integer.parseInt(date.substring(5, 7)) - 1, // Calendar month is between 0 and 11
                    Integer.parseInt(date.substring(8)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return cal;
    }
    
    /*------------------------------------------------------------------------*/
    // Converts from GregorianCalendar to String.
    public static String parseDate(GregorianCalendar cal) {
        /**
         * Converts a GregorianCalendar object to a formatted string.
         */
        return toString(cal);
    }

    public static String toString(GregorianCalendar cal) {
        /**
         * Creates a Date object with the same values as the GregorianCalendar parameter.
         * Then, it converts it to a formatted string with SimpleDateFormat and the format() method.
         */
        try {
            Date thisDate = cal.getTime();
            return sdf.format(thisDate);
        } catch (Exception e) {
            // If the date cannot be formatted:
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public static String toString(java.util.Date cal) {
        /**
         * Creates a Date object with the same values as the GregorianCalendar parameter.
         * Then, it converts it to a formatted string with SimpleDateFormat and the format() method.
         */
        try {
            return sdf.format(cal);
        } catch (Exception e) {
            // If the date cannot be formatted:
            System.out.println(e.getMessage());
            return null;
        }
    }

}