package model.items.weapons.bladed;

import model.items.weapons.Weapon;

public class SmallKnife extends Weapon {

  public SmallKnife(){
    super( "Small Knife", Weapon.SIZE_SMALL, 1, 3 );

    setAllowsBlock( false );
  }
}//johnny