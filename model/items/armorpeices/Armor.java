package model.items.armorpeices;

import model.items.Item;

public class Armor extends Item {

     private Integer Protection;
 
    public Armor( String name, Integer size, Integer Protection){
    
    super( name, size );
    this.Protection = Protection;  
  }

  public void setProtection( Integer Protection ){
    this.Protection = Protection;
  }

  public Integer getProtection(){
    return this.Protection;
  }
}
