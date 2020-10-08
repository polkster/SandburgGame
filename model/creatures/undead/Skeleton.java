package model.creatures.undead;

import model.creatures.Creature;

public class Skeleton extends Creature {

  /**
  * This is a Skeleton
  *
  * A skeleton is always level 1, and it's hit dice 
  * are 7.  A skeleton can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Skeleton(){
    super("Skeleton (he doesn't tell anybody but he is scared of chickens)", 1, 10, 1, 6);
  }
}
