/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Model;

import Controller.DateParser;
import Errors.ErrorsMsg;
import java.util.GregorianCalendar;

public class Issue { 
    
    // CONSTRUCTOR METHODS /////////////////////////////////////////////////////
    public Issue(int cod_issue, String issue_description, String entry_date, String end_date, int hours_num, int cod_client, int cod_entity, float cost) throws ErrorsMsg{
        setCodIssue(cod_issue);
        setIssueDescription(issue_description);
        setEntryDate(entry_date);
        setEndDate(end_date);
        setNumHours(hours_num);
        setCodClient(cod_client);
        setCodEntity(cod_entity);
        setCost(cost);
    }
    
    
    // GETTER METHODS //////////////////////////////////////////////////////////
    public int getCodIssue(){
        return cod_issue;
    }
    
    public String getIssueDescription(){
        return issue_description;
    }
    
    public GregorianCalendar getEntryDate(){
        return entry_date;
    }
    
    public GregorianCalendar getEndDate(){
        return end_date;
    }
    
    public int getNumHours(){
        return hours_num;
    }
    
    public int getCodClient(){
        return cod_client;
    }
    
    public int getCodEntity(){
        return cod_entity;
    }
    
    public float getCost(){
        return cost;
    }
    
    
    // SETTER METHODS //////////////////////////////////////////////////////////
    public void setCodIssue(int cod_issue){
        this.cod_issue = cod_issue;
    }
    
    public void setIssueDescription(String issue_description){
        this.issue_description = issue_description;
    }
    
    public void setEntryDate(String entry_date) throws ErrorsMsg{
        this.entry_date = DateParser.parseDate(entry_date);
    }
    
    public void setEndDate(String end_date) throws ErrorsMsg{
        if(end_date == null){
            this.end_date = null;
        } else {
            this.end_date = DateParser.parseDate(end_date);
        }
    }
    
    public void setNumHours(int hours_num){
        this.hours_num = hours_num;
    }
    
    public void setCodClient(int cod_client){
        this.cod_client = cod_client;
    }
    
    public void setCodEntity(int cod_entity){
        this.cod_entity = cod_entity;
    }
    
    public void setCost(float cost){
        this.cost = cost;
    }
    
    
    
    public String toString(){
        return String.valueOf(cod_issue)+";"+
                issue_description+";"+
                DateParser.parseDate(entry_date)+";"+
                (end_date == null? "Activo": DateParser.parseDate(end_date))+";"+
                String.valueOf(hours_num)+";"+
                String.valueOf(cod_client)+";"+
                String.valueOf(cod_entity)+";"+
                String.valueOf(cost);
    }
    
    
    // ATTRIBUTES //////////////////////////////////////////////////////////////
    private int cod_issue;
    private String issue_description;
    private GregorianCalendar entry_date;
    private GregorianCalendar end_date;
    private int hours_num;
    private int cod_client;
    private int cod_entity;
    private float cost;
}
