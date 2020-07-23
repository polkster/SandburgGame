package model.items.weapons.other;

import model.items.weapons.Weapon;

public class WW2 Molotov extends Weapon{
  
  public WW2 Molotov(){
    super( " WW2 Molotov", Weapon.SIZE_SMALL, 1, 100 );
    
    setAllowsBlock( false );
  }
}
