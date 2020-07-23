package model.items.armorpieces;

import model.items.Item;

public class Armor extends Item {

  private Integer protection;
 
  public Armor( String name, Integer size, Integer protection){
    
    super( name, size );
    this.protection = protection;  
  }

  public void setProtection( Integer protection ){
    this.protection = protection;
  }

  public Integer getProtection(){
    return this.protection;
  }
}
