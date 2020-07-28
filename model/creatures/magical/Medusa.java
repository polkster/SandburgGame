package model.creatures.magical;

import model.creatures.Creature;

public class Medusa extends Creature {

  /**
  * This is a Medusa
  *
  * A Medusa is always level 1, and it's hit dice 
  * are 6.  A Medusa can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Medusa(){
    super("Medusa", 6, 8, 15, 15);

    setTurnedToStone (true);
  }
}//Johnny