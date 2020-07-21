package model.items.consumables;

import model.items.Item;

public class Consumable extends Item {
  
  private Integer minEffectiveness;
  private Integer maxEffectiveness;

  public Consumable( String name, Integer size, Integer minEffectiveness, Integer maxEffectiveness ){
    
    super( name, size );

    this.minEffectiveness = minEffectiveness;
    this.maxEffectiveness = maxEffectiveness;
  }

  public void setMinEffectiveness( Integer minEffectiveness ){
    this.minEffectiveness = minEffectiveness;
  }

  public Integer getMinEffectiveness(){
    return this.minEffectiveness;
  }

  public void setMaxEffectivenessDamage( Integer maxEffectiveness ){
    this.maxEffectiveness = maxEffectiveness;
  }

  public Integer getMaxEffectiveness(){
    return this.maxEffectiveness;
  }
}