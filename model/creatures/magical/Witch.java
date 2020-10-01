package model.creatures.magical;

import model.creatures.Creature;

public class Witch extends Creature {

/*
  * This is a Witch
  *
  * A Witch is always level 1, and it's hit dice 
  * are 4.  A Witch can do a minimum of 2 points of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Witch(){
    super("Witch", 2, 4, 2, 4 );    
  }
}