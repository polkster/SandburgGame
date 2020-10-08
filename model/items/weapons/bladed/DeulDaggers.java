package model.items.weapons.bladed;

import model.items.weapons.Weapon;

public class DeulDaggers extends Weapon {

  public DeulDaggers(){
    super( "Deul Daggers", Weapon.SIZE_SMALL, 3, 6 );

    setAllowsBlock( true );
  }
}//johnny