package io;

import model.character.Player;
import model.creatures.Creature;
import model.locations.Location;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PlayerConsole {

    private PrintStream out;
    private Scanner in;

    public PlayerConsole(PrintStream stream, InputStream in){

        this.out = stream;
        this.in = new Scanner(in);

        this.out.println( "Console initialized...");
        this.out.println();
    }

    public String getInput(){

      try{
        return this.in.next();
      }
      catch ( Exception e ){
        e.printStackTrace();
      }

      return null;
    }

    public void outputPlayer(Player player){

        outputStats( player );
        // outputWeapons( player );
        // outputArmor( player );
        outputPlayerInventory( player );

        this.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        this.out.println();
    }

    public void outputLocation(Location location){
        // TODO: implement locations
    }

    public void outputStats( Player player ){
      this.out.println( player.getName() + " currently has " + player.getCurrentHitPoints() + " out of " + player.getMaxHitPoints() + " total hitpoints.");
    }

    public void outputCreature(Creature creature){

        this.out.println(); // adds an extra line of white space
        this.out.println("You have encountered: " + creature.getName() );
        this.out.println(creature.getName() + " has " + creature.getCurrentHitPoints() + " hit points and is level " + creature.getLevel() );
        this.out.println();
    }

    public void outputPlayerInventory(Player player){

        this.out.println();
        this.out.println( "\t" + player.getName() + "'s Inventory");
        this.out.println( "\t--------------------------------------------");

        if ( player.getStorage() == null || player.getStorage().getItems().size() == 0 ) {
            this.out.println("\tNo Items In Backpack");
        }
        else {
            for (int i = 0; i < player.getStorage().getItems().size(); i++) {
                this.out.println("\t" + player.getStorage().getItems().get(i).getName());

            }
        }

        this.out.println( player.getName() + " has an armor class of " + player.getArmorValue());
    }

    public void outputMessage( String message ){
      this.out.println( message );
    }
}
