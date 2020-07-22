package model.items.weapons;

import model.items.weapons.Weapon;

public class BattleAxe extends Weapon {

  public BattleAxe(){
    super( "Battle Axe", Weapon.SIZE_XL, 15, 25 );
    
    setAllowsBlock( false );
  } 
}