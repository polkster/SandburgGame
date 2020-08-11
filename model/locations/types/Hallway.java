
package model.locations.types;

import model.locations.Location;
import java.util.Random;

public class Hallway extends Location{

  public Hallway(){
    super( 30, false );
  }

  public String getDescription(){

    Random rnd = new Random();

    Integer value = rnd.nextInt(3);

    if ( value == 0 ){
      return "You have entered a short hallway";
    }
    else if ( value == 1 ){
      return "You have entered a long hallway";
    }
    else if ( value == 2 ){
      return "You have entered a massive hallway";
    }

    return "You have entered a long hallway";
  }
}