package model.items.weapons;

import model.items.weapons.Weapon;

public class ShortAxe extends Weapon {

  public ShortAxe(){
    super( "Short Axe", Weapon.SIZE_SMALL, 2, 5 );

    setAllowsBlock( false );
  }
}