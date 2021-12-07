package Controller;

/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

import Errors.ErrorsMsg;
import Errors.ErrorsSaveLogs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateParser {
    /**
     * A SimpleDateFormat will be used to format Strings.
     */
    static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /*------------------------------------------------------------------------*/
    // Converts from a String to a GregorianCalendar.
    public static GregorianCalendar parseDate(String date) throws ErrorsMsg {
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
        } catch (IllegalArgumentException ex) {
            ErrorsSaveLogs.saveLogError(ex.getMessage());
            throw new ErrorsMsg(1);
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
        } catch (Exception ex) {
            // If the date cannot be formatted:
            ErrorsSaveLogs.saveLogError(ex.getMessage());
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
        } catch (Exception ex) {
            // If the date cannot be formatted:
            ErrorsSaveLogs.saveLogError(ex.getMessage());
            return null;
        }
    }

}