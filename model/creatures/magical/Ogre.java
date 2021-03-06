package model.creatures.magical;

import model.creatures.Creature;

public class Ogre extends Creature {

/*
  * This is a Ogre
  *
  * A Ogre is always level 1, and it's hit dice 
  * are 8.  A Ogre can do a minimum of 3 points of 
  * damage, and a maximum of 6 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Ogre(){
    super("Shrek", 6,8,3,6);    
  }
}