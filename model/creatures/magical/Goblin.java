package model.creatures.magical;

import model.creatures.Creature;

public class Goblin extends Creature {

/*
  * This is a Goblin
  *
  * A Goblin is always level 1, and it's hit dice 
  * are 4.  A Goblin can do a minimum of 1 point of 
  * damage, and a maximum of 3 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Goblin(){
    super("Goblin", 5,1,4,3);    
  }
}