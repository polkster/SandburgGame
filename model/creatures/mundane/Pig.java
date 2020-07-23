package model.creatures.mundane;

import model.creatures.Creature;

public class Pig extends Creature {

  /**
  * This is a Pig
  *
  * A Pig is always level 1, and it's hit dice 
  * are 6.  A Pig can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Pig(){
    super("Pig", 1, 2, 1, 2);
  }
}
