package model.items.consumables.oneuseweapons;

import model.items.Item;
import model.items.consumables.Consumable;

public class ToasterFullOBoom extends Consumable {

  public ToasterFullOBoom(){
    super( "Toaster Full O Boom", Item.SIZE_SMALL, 20000, Consumable.EFFECT_TYPE_DAMAGE );
    
  }
}