/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Errors;

import java.util.Date;

public class ErrorsMsg extends Exception {
    private static String message;
    
    public ErrorsMsg(int errorCode) {
        /**
         * Shows on console which error ocurred.
         */
        switch (errorCode) {
            case 1 -> {
                invalidEntryDateMessage();
            }
            case 2 -> {
                invalidNIFMessage();
            }
            case 3 -> {
                invalidHoursMessage();
            }
            case 4 -> {
                invalidDescriptionMessage();
            }
            case 5 -> {
                invalidEndDateMessage();
            }
            case 6 -> {
                dbErrorConnectMessage();
            }
            case 7 -> {
                dbErrorDisconnectMessage();
            }
            case 8 -> {
                dbErrorQueryMessage();
            }
            case 9 -> {
                emptyDateMessage();
            }
            case 10 -> {
                invalidComboBoxMessage();
            }

        }
    }
    
    public ErrorsMsg(String message) {
        super(message);
    }

    public static final void invalidEntryDateMessage() {
        /**
         * Shows an error message for when the format of the date string, or the
         * values of the fields in the date string are invalid.
         */
        message = "Error - Fecha no válida. \n Por favor, introduzca una fecha con formato \"YYYY-MM-DD\"";
    }

    public static final void invalidNIFMessage() {
        /**
         * Shows an error message for when the salary is invalid.
         */
        message = "Error - El DNI introducido no es válido.";
    }

    public static final void invalidHoursMessage() {
        /**
         * Shows an error message for when the ID is invalid.
         */
        message = "Error - El número de horas no es válido.";
    }
    
    public static final void invalidDescriptionMessage(){
        /**
         * Shows an error message for when the description is longer than 50 characters.
         */
        message = "Error - La descripción es demasiado larga";
    }
    
    public static final void invalidEndDateMessage(){
        /**
         * Shows an error message for when the end date is before entry date.
         */
        message = "Error - La fecha de finalización no puede ser anterior al inicio.";
    }
    
    public static final void dbErrorConnectMessage(){
        /**
         * Shows an error message for when could not login to the data base.
         */
        message = "Error - No se ha podido conectar con la base de datos.";
    }
    
    public static final void dbErrorDisconnectMessage(){
        /**
         * Shows an error message for when could not disconect from data base.
         */
        message = "Error - No se ha podido desconectar con la base de datos.";
    }
    
    public static final void dbErrorQueryMessage(){
        /**
         * Shows an error message for when the query has failed.
         */
        message = "Error - No se ha podido ejercutar la consulta adecuadamente.";
    }
    
    public static final void emptyDateMessage(){
        /**
         * Shows an error message for when the entry date field is empty.
         */
        message = "Error - Debe indicar al menos una fecha de inicio.";
    }
    
    public static final void invalidComboBoxMessage(){
        /**
         * Shows an error message for when the user has not selected a client or entity.
         */
        message = "Error - Debe indicar un valor para Cliente y Órgano.";
    }
    
    
    /*------------------------------------------------------------------------*/
    public static void checkIssueDescription(String description) throws ErrorsMsg {
        if(description.length() > 50){
            throw new ErrorsMsg(4);
        }
    }
    
    public static void checkNumHours(String num) throws ErrorsMsg {
        try{
            if(Integer.valueOf(num) < 0){
                throw new ErrorsMsg(3);
            }
        } catch(Exception ex){
            throw new ErrorsMsg(3);
        }
    }
    
    public static void checkDates(Date entryDate, Date endDate) throws ErrorsMsg{
        if(entryDate == null){
            throw new ErrorsMsg(9);
        } else if(endDate != null && entryDate.compareTo(endDate) > 0){
            throw new ErrorsMsg(5);
        }
    }
    
    public static void checkComboBox(String client, String entity) throws ErrorsMsg{
        if("CLIENTE".equals(client)){
            throw new ErrorsMsg(10);
        } else if ("ÓRGANO".equals(entity)){
            throw new ErrorsMsg(10);
        }
    }

    /*------------------------------------------------------------------------*/
    public void showMessage() {
        /**
         * Show the full traceback of the exception.
         */
        System.out.println(this.getMessage());
    }

    @Override
    public String getMessage() {
        return message;
    }
}
