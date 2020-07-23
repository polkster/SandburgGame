package model.items.consumables.potions;

import model.items.consumables.Consumable;

public class HealingPotion extends Consumable {
  public HealingPotion(){
    super("Potion Of Healing", Consumable.SIZE_SMALL, 15);
  }
}