package model.items.weapons;

import model.items.weapons.Weapon;

public class Grenade extends Weapon{
  
  public Grenade(){
    super( "Grenade", Weapon.SIZE_SMALL, 1, 100 );
  }
}
//should this be here since this is more like a midevil game??? Also if we keep it shoundn't this be a consumable since a grenade is a one time thing.