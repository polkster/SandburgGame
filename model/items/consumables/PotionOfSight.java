
/*
* this is made so you can see into other map squares like what kind of  
* creatures are in the other squares so you can use 
* bow or other distacne weopons
*efectiveness range declares how many sqares around you you can se into
*/
package model.consumables;

import model.items.consumables.Consumable;

public class PotionOfSight extends Consumable {
  public PotionOfSight(){
    super("Potion Of Sight", Consumable.SIZE_SMALL, 1, 2);
  }
}
