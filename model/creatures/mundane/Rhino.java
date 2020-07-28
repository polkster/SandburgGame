package model.creatures.mundane;

import model.creatures.Creature;

public class Rhino extends Creature {

/**
  * This is a Rhino
  *
  * A Rhino is always level 1, and it's hit dice 
  * are 8.  A Rhino can do a minimum of 1 point of 
  * damage, and a maximum of 6 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Rhino(){
    super("Rhino", 3, 8, 1, 6);
  }
}
