package model.items.weapons.bladed;

import model.items.weapons.Weapon;

public class Dieplz extends Weapon {

  public Dieplz(){
    super( "Dieplz", Weapon.SIZE_XL, 200, 700 );

    setAllowsBlock( true );
  }
}