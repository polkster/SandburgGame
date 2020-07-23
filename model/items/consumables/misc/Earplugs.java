/* This item allows you to escape if fighting a Siren or creature that prevents you from escape
*/
package model.items.consumables.misc;

import model.items.consumables.Consumable;

public class Earplugs extends Consumable {
  public Earplugs(){
    super("Earplugs", Consumable.SIZE_XS, 123456789);
  }
}
//The reason I made the number so big is because I figured with the siren it could be like if the siren gets that specific intiger it could allow escape.
