package model.creatures;

public class Skeleton extends Creature {

  /**
  * This is a Skeleton
  *
  * A skeleton is always level 1, and it's hit dice 
  * are 6.  A skeleton can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Skeleton(){
    super("Skeleton", 1, 6, 1, 4);
  }
}
