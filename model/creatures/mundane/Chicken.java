package model.creatures.mundane;

import model.creatures.Creature;
public class Chicken extends Creature {

  /**
  * This is a chicken
  *
  * A chicken is always level 1, and it's hit dice 
  * are 2.  A chicken can do a minimum of 1 point of 
  * damage, and a maximum of 2 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Chicken(){
    super("Chicken", 1, 2, 1, 2);
  }
}