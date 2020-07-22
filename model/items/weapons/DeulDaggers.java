package model.items.weapons;

import model.items.weapons.Weapon;

public class DeulDaggers extends Weapon {

  public DeulDaggers(){
    super( "Deul Daggers", Weapon.SIZE_SMALL, 2, 4 );

    setAllowsBlock( false );
  }
}