package model.items.consumables;

import model.items.Item;

public class Consumable extends Item {
  
  public static final Integer EFFECT_TYPE_HEALING = 1;  // this will directly restore any lost hitpoints on the player
  public static final Integer EFFECT_TYPE_DAMAGE = 2;   // this will increase the damage potential of the player by the effectiveness amount
  public static final Integer EFFECT_TYPE_REVEAL = 3;   // this will reveal what is in the room in the direction the player chooses
  public static final Integer EFFECT_TYPE_OTHER = 4;    // certain items will just need a check.  As long as the item is on the character, it is consumed.

  private Integer effectType;
  private Integer effectiveness;
 
  public Consumable( String name, Integer size, Integer effectiveness, Integer effectType ){
    
    super( name, size );

    this.effectiveness = effectiveness;  
    this.effectType = effectType;
  }

  public void setEfectiveness( Integer effectiveness ){
    this.effectiveness = effectiveness;
  }

  public Integer getEffectiveness(){
    return this.effectiveness;
  }

  public Integer getEffectType(){
    return this.effectType;
  }

  public void setEffectType( Integer effectType ){
    this.effectType = effectType;
  }
}