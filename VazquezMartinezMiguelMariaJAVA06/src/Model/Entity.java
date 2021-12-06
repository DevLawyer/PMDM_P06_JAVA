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
public class Entity {
    private int cod_entity;
    private String entity_name;
    private String entity_address;
    private String telephone_num;
    
    public Entity(int cod_entity, String entity_name, String entity_address, String telephone_num){
        this.cod_entity = cod_entity;
        this.entity_name = entity_name;
        this.entity_address = entity_address;
        this.telephone_num = telephone_num;
    }
    
    public String toString(){
        return String.valueOf(cod_entity)+";"+
                entity_name+";"+
                entity_address+";"+
                telephone_num;
    }
}
