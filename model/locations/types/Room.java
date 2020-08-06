
package model.locations.types;

import model.locations.Location;

public class Room extends Location{

  public Room(){
    super( 50, false );
  }

  public String getDescription(){
    return "You have entered a large room.";
  }
}