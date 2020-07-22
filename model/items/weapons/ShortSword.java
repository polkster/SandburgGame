package model.items.weapons;

import model.items.weapons.Weapon;

public class ShortSword extends Weapon {

  public ShortSword(){
    super( "Short Sword", Weapon.SIZE_SMALL, 1, 6 );

    setAllowsBlock( true );
  }
}