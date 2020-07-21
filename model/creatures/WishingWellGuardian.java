package model.creatures;

public class WishingWellGuardian extends Creature {

  /**
  * This is a WishingWellGuardian
  *
  * A WishingWellGuardian is always level 1, and it's hit dice 
  * are 6.  A WishingWellGuardian can do a minimum of 1 point of 
  * damage, and a maximum of 4 per attack.
  */

  public WishingWellGuardian(){
    super("Wishing Well Guardian", 1, 6, 1, 4);
  }
}
