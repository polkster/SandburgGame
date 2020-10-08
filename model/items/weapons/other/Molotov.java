package model.items.weapons.other;

import model.items.weapons.Weapon;

public class Molotov extends Weapon{
  
  public Molotov(){
    super( "Primitive Molotov", Weapon.SIZE_SMALL, 1, 100 );
    
    setAllowsBlock( false );
  }
}
