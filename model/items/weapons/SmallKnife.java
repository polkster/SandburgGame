package model.items.weapons;

import model.items.weapons.Weapon;

public class SmallKnife extends Weapon {

  public SmallKnife(){
    super( "Small Knife", Weapon.SIZE_XL, 1, 3 );

    setAllowsBlock( false );
  }
}