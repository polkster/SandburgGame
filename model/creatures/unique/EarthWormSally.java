package model.creatures.unique;

import model.creatures.Creature;

public class EarthWormSally extends Creature {

  /**
  * This is a EarthwormSally
  *
  * A EarthwormSally is always level 1, and it's hit dice 
  * are 6.  A earthwormsally can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  // String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue
  public EarthWormSally(){
    super("Earth Worm Sally", 1, 6, 1, 4);
    //EARTHWORM SALLY SPREADING DESASES FROM FLROIDA TO CALI
  }
}
