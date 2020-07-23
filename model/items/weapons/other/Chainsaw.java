package model.items.weapons.other;

import model.items.weapons.Weapon;

public class Chainsaw extends Weapon {

  public Chainsaw(){
    super( "Mega Chain Saw", Weapon.SIZE_LARGE, 10, 60 );
    
    setAllowsBlock( false );
  }
}