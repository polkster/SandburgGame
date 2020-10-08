
package model.locations.types;

import model.locations.Location;
import java.util.Random;

public class Room extends Location{

  public Room(){
    super( 50, false );
  }

  public String getDescription(){

    Random rnd = new Random();
    Integer value = rnd.nextInt(3);

    if ( value == 0 ){
      return "You have entered a small room";
    }
    else if ( value == 1 ){
      return "You have entered a servant's quarters";
    }
    else if ( value == 2 ){
      return "You have entered a prince's quarters!";
    }

    return "You have entered a large room.";
  }
}