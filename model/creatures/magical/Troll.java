package model.creatures.magical;

import model.creatures.Creature;

public class Troll extends Creature{

/*
  * This is a Troll
  *
  * A Troll is always level 1, and it's hit dice 
  * are 3.  A Troll can do a minimum of 1 point of 
  * damage, and a maximum of 2 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Troll(){
    super("Troll", 1, 3, 1, 2);    
  }
}