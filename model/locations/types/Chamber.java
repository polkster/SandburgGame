
package model.locations.types;

import model.locations.Location;

public class Chamber extends Location{

  public Chamber(){
    super( 70, false );
  }

  public String getDescription(){
    return "You have entered a royal person's massive  chamber.";
  }
}