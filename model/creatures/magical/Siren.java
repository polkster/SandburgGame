package model.creatures.magical;

import model.creatures.Creature;

public class Siren extends Creature {

  /**
  * This is a Siren
  *
  * A Siren is always level 1, and it's hit dice 
  * are 6.  A Siren can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public Siren(){
    super("Siren", 6, 8, 20, 30);

    setAllowsEscape( false );
  }
}