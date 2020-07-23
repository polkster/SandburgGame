package model.creatures.undead;

import model.creatures.Creature;

public class Zombie extends Creature {
  
  /**
  * This is a zombie.
  *
  * By default, a zombie is level 2 and 
  * it's hit dice are 6.  The minimum damage it 
  * can do is 1 point, and the max is 6
  */
  public Zombie(){
    super("Zombie", 2, 6, 1, 6);
  }
}