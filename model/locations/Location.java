package model.locations;

import model.creatures.undead.Skeleton;
import model.creatures.undead.Zombie;
import model.creatures.magical.Witch;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import model.creatures.Creature;

public class Location{

  private Random rnd = new Random();
  private boolean escapeHatch = false;
  private List<Creature> opponents = new ArrayList<Creature>();

  public Location(int chanceOfSpawn, boolean isEscapeHatch){

    this.escapeHatch = isEscapeHatch;

    checkSpawn(chanceOfSpawn);
  }

  public void setOpponents(List<Creature> list){
    this.opponents = list;
  }

  public List<Creature> getOpponents(){
    return this.opponents;
  }

  public String getDescription(){
    return "You have entered a new area";
  }

  private void checkSpawn(int chance){
    Integer val = rnd.nextInt(100);

    if ( val < chance ){
      spawnBaddies();
    }
  }

  public boolean isEscapeHatch(){
    return this.escapeHatch;
  }

  public void setEscapeHatch(boolean value){
    this.escapeHatch = value;
  }

  private void spawnBaddies(){
    Integer total = 1;

    // 75% chance for Skeleton
    // 20% chance for Zombie
    // 5% chance for Witch

    for ( int i = 0; i < total; i++ ){
      int perc = rnd.nextInt(100)+1;

      if ( perc <=75 ){
        this.opponents.add( new Skeleton() );
      }
      else if ( perc <= 95 && perc > 75 ){
        this.opponents.add( new Zombie() );
      }
      else if ( perc <= 100 && perc > 95 ){
        this.opponents.add( new Witch() );
      }
    }
  }
}