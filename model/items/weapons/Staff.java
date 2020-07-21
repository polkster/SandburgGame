package model.items.weapons;

import model.items.weapons.Weapon;

public class Staff extends Weapon {

  public Staff(){
    super( "Staff", Weapon.SIZE_LARGE, 3, 6 );
    
    setAllowsBlock( true );
  } 
}