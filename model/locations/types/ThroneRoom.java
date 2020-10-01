
package model.locations.types;

import model.locations.Location;
import model.creatures.specialmundane.LichKing;
import java.util.Random;

public class ThroneRoom extends Location{

  public ThroneRoom(){
    super( 100, false );
  }

  public String getDescription(){
    return "You have entered a royal antechamber";
  }

  @Override
  protected void spawnBaddies(){

    addOpponent( new LichKing() );
  }
}