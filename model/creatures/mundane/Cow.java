package model.creatures.mundane;

import model.creatures.Creature;
public class Cow extends Creature {

  /**
  * This is a Cow
  *
  * A Cow is always level 1, and it's hit dice 
  * are 4.  A Cow can do a minimum of 1 point of 
  * damage, and a maximum of 3 per attack.
  */
  //angelina

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Cow(){
    super("Cow", 1, 4, 1, 3);
  }
}