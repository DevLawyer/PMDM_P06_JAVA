/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Model;

public class Entity {

    // CONSTRUCTOR METHODS /////////////////////////////////////////////////////
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
    
    
    // ATTRIBUTES //////////////////////////////////////////////////////////////
    private int cod_entity;
    private String entity_name;
    private String entity_address;
    private String telephone_num;
}
