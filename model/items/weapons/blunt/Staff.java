package model.items.weapons.blunt;

import model.items.weapons.Weapon;

public class Staff extends Weapon {

  public Staff(){
    super( "Staff", Weapon.SIZE_LARGE, 8, 12 );
    
    setAllowsBlock( true );
  } 
}