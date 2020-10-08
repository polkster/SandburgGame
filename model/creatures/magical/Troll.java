package model.creatures.magical;

import model.creatures.Creature;

public class Troll extends Creature {

/*
  * This is a Troll
  *
  * A Troll is always level 1, and it's hit dice 
  * are 4.  A Troll can do a minimum of 2 points of 
  * damage, and a maximum of 3 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Troll(){
    super("Troll", 4, 4,2,3 );    
  }
}