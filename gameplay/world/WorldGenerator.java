package gameplay.world;

import java.util.List;
import java.util.Random;

import model.locations.Location;
import model.locations.types.Chamber;
import model.locations.types.Hallway;
import model.locations.types.Room;

import java.util.ArrayList;

public class WorldGenerator {

  public static Location[][] generateWorld( int width, int height ){
    
    Random random = new Random(System.currentTimeMillis());
    Location [][] world = new Location[width][height];

    for ( int w = 0; w < width; w++ ){
      for ( int h = 0; h < height; h++ ){

        int locationType = random.nextInt(3);  

        if ( locationType == 0 ){
          world[w][h] = new Chamber();
        }
        else if ( locationType == 1 ){
          world[w][h] = new Hallway();
        }
        else if ( locationType == 2 ){
          world[w][h] = new Room();
        }
        
      }
    }

    return world;
  }
}