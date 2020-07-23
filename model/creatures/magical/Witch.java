package model.creatures.magical;

import model.creatures.Creature;

public class Witch extends Creature {

/*
  * This is a Witch
  *
  * A Witch is always level 1, and it's hit dice 
  * are 4.  A Witch can do a minimum of 1 point of 
  * damage, and a maximum of 3 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Witch(){
    super("Witch", 4, 6, 10, 15);    
  }
}