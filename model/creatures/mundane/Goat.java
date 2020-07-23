package model.creatures.mundane;

import model.creatures.Creature; 
public class Goat extends Creature {

  /**
  * This is a Goat
  *
  * A goat is always level 1, and it's hit dice 
  * are 5.  A goat can do a minimum of 2 point of 
  * damage, and a maximum of 5 per attack.
  */
  //angelina

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Goat(){
    super("Goat", 1, 5, 2, 5);
  }
}