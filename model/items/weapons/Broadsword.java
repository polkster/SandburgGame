package model.items.weapons;

import model.items.weapons.Weapon;

public class Broadsword extends Weapon {

  public Broadsword(){
    super( "Broadsword", Weapon.SIZE_LARGE, 10, 20 );

    setAllowsBlock( true );
  }
}