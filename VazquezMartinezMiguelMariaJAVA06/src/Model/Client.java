/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author migva
 */
public class Client {
    private int cod_client;
    private String client_name;
    private String client_surname;
    private String client_nif;
    private String client_address;
    private String telephone_num;
    private String lawyer_nif;
    
    public Client(){
        
    }
    
    public Client(int cod_client, String client_name, String client_surname, String client_nif, String client_address, String telephone_num, String lawyer_nif){
        this.cod_client = cod_client;
        this.client_name = client_name;
        this.client_surname = client_surname;
        this.client_nif = client_nif;
        this.client_address = client_address;
        this.telephone_num = telephone_num;
        this.lawyer_nif = lawyer_nif;
    }
    
    public int getCodClient(){
        return cod_client;
    }
    
    public String getClientName(){
        return client_name;
    }
    
    public String getClientSurname(){
        return client_surname;
    }
    
    public String getClientNIF(){
        return client_nif;
    }
    
    public String getClientAddress(){
        return client_address;
    }
    
    public String getClientTelephone(){
        return telephone_num;
    }
    
    public String toString(){
        return  String.valueOf(cod_client)+";"+
                client_name+";"+
                client_surname+";"+
                client_nif+";"+
                client_address+";"+
                telephone_num;
    }
}
