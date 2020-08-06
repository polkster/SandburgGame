package model.creatures.bosses;

import model.creatures.Creature;

public class Demon extends Creature {

  public Demon(){
    super( "A scary demon", 100, 250, 250, 1000 );
    setSpecial(true);
  }
}
