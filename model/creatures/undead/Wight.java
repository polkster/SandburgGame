package model.creatures.undead;

import model.creatures.Creature;

public class Wight extends Creature {
  
  /**
  * This is a zombie.
  *
  * By default, a zombie is level 2 and 
  * it's hit dice are 6.  The minimum damage it 
  * can do is 1 point, and the max is 6
  */
  public Wight(){
    super("Wight", 4, 10, 5, 10);
  }
}