package model.items.weapons;

import model.items.Item;

public class Weapon extends Item {
  
  private Integer minDamage;
  private Integer maxDamage;

  public Weapon( String name, Integer size, Integer minDamage, Integer maxDamage ){
    
    super( name, size );
    this.minDamage = minDamage;
    this.maxDamage = maxDamage;
  }

  public void setMinDamage( Integer minDamage ){
    this.minDamage = minDamage;
  }

  public Integer getMinDamage(){
    return this.minDamage;
  }

  public void setMaxDamage( Integer maxDamage ){
    this.maxDamage = maxDamage;
  }

  public Integer getMaxDamage(){
    return this.maxDamage;
  }
}
