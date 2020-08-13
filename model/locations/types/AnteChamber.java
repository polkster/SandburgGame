
package model.locations.types;

import model.locations.Location;
import model.creatures.magical.Goblin;
import model.creatures.undead.Wight;

import java.util.Random;

public class AnteChamber extends Location{

  public AnteChamber(){
    super( 70, false );
  }

  public String getDescription(){
    return "You have entered a royal antechamber";
  }

  @Override
  protected void spawnBaddies(){

    Integer total = 1;   
    Random rnd = new Random(); 

    for ( int i = 0; i < total; i++ ){
      int perc = rnd.nextInt(100)+1;

      if ( perc <=75 ){
        addOpponent( new Wight() );
      }
      else{
        addOpponent( new Goblin() );
      }
    }
  }
}