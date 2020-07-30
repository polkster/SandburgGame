package model.creatures.mundane;

import model.creatures.Creature;

public class Elephant extends Creature {

/**
  * This is a Elephant
  *
  * A Elephant is always level 1, and it's hit dice 
  * are 10.  A Elephant can do a minimum of 1 point of 
  * damage, and a maximum of 8 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Elephant(){
    super("Elephant", 5, 10, 1, 8);
  }
}
