package model.items.weapons.axe;

import model.items.weapons.Weapon;

public class ShortAxe extends Weapon {

  public ShortAxe(){
    super( "Short Axe", Weapon.SIZE_SMALL, 2, 5 );

    setAllowsBlock( false );
  }
}