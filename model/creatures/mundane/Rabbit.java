package model.creatures.mundane;

import model.creatures.Creature;

public class Rabbit extends Creature {

  /**
  * This is a Raabbit
  *
  * A Rabbit is always level 1, and it's hit dice 
  * are 6.  A Rabbit can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Rabbit(){
    super("Rabbit", 1, 6, 1, 4);
  }
}
