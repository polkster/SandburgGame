
package model.locations.types;

import model.locations.Location;

public class Hallway extends Location{

  public Hallway(){
    super( 30, false );
  }

  public String getDescription(){
    return "You have entered a long hallway";
  }
}