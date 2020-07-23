package model.items.consumables.potions;

import model.items.consumables.Consumable;

public class PotionOfStrength extends Consumable {
  public PotionOfStrength(){
    super("Potion Of Strength", Consumable.SIZE_SMALL, 3,  Consumable.EFFECT_TYPE_DAMAGE);
  }
}//johnny