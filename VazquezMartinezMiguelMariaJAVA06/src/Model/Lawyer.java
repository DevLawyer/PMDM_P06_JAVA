/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Model;

import Controller.DateParser;
import java.util.GregorianCalendar;

public class Lawyer {
    private int cod_lawyer;
    private String lawyerNIF;
    private String lawyerName;
    private String lawyerSurname;
    private int phoneExt;
    private String userName;
    private String photo = "default.jpg";
    private GregorianCalendar entryDate;
    private float hoursFee;
    
    public Lawyer(){
        
    }
    
    public Lawyer(int cod_lawyer, String lawyerNIF, String lawyerName, String lawyerSurname, int phoneExt, String userName, String photo, String entryDate, int hoursFee){
        this.cod_lawyer = cod_lawyer;
        this.lawyerNIF = lawyerNIF;
        this.lawyerName = lawyerName;
        this.lawyerSurname = lawyerSurname;
        this.phoneExt = phoneExt;
        this.userName = userName;
        this.photo = photo;
        this.entryDate = DateParser.parseDate(entryDate);
        this.hoursFee = hoursFee;
    }
    
    public int getCodLawyer(){
        return cod_lawyer;
    }
    
    public String getLawyerNIF(){
        return lawyerNIF;
    }
    public String getLawyerName(){
        return lawyerName;
    }
    public String getLawyerSurname(){
        return lawyerSurname;
    }
    public int getLawyerPhoneExt(){
        return phoneExt;
    }
    public String getLawyerUserName(){
        return userName;
    }
    public String getLawyerPhoto(){
        return photo;
    }
    public String getLawyerEntryDateFormat(){
        return DateParser.parseDate(entryDate);
    }
    
    public GregorianCalendar getLawyerEntryDate(){
        return entryDate;
    }
    
    public float getLawyerHoursFee(){
        return hoursFee;
    }
    
    public void setLawyerPhoto(String photo){
        this.photo = photo;
    }
    
    public void setLawyerNIF(String lawyerNIF){
        this.lawyerNIF = lawyerNIF;
    }
    
    public void setLawyerEntryDate(String entryDate){
        this.entryDate = DateParser.parseDate(entryDate);
    }
}
