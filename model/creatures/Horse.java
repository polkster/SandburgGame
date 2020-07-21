package model.creatures;

public class Horse extends Creature {

  /**
  * This is a Horse
  *
  * A Horse is always level 1, and it's hit dice 
  * are 4.  A horse can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Horse(){
    super("Horse", 1, 4, 2, 4);
  }
}
