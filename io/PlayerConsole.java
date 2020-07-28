package io;

import model.character.Player;
import model.creatures.Creature;
import model.locations.Location;

import java.io.InputStream;
import java.io.PrintStream;

public class PlayerConsole {

    private PrintStream out;
    private InputStream in;

    public PlayerConsole(PrintStream stream, InputStream in){

        this.out = stream;
        this.in = in;

        this.out.println( "Console initialized...");
        this.out.println();
    }

    public void outputPlayer(Player player){

        outputStats( player );
        outputWeapons( player );
        outputArmor( player );
        outputPlayerInventory( player );
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
        this.out.println(creature.getName() + " has " + creature.getCurrentHitPoints() + " at level " + creature.getLevel() );
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

        this.out.println();

        if ( player.getMisc() == null || player.getMisc().getItems().size() == 0 ) {
            this.out.println("\tNo Items In Pockets");
        }
        else {
            for (int i = 0; i < player.getMisc().getItems().size(); i++) {
                this.out.println("\t" + player.getMisc().getItems().get(i).getName());
            }
        }
    }

    private void outputWeapons( Player player ){

        this.out.println(); // adding some whitespace
        this.out.print(player.getName() + " is weilding ");

        if ( player.getPrimaryWeapon() == null ){
            this.out.print( "nothing in their primary hand");
        }
        else{
            this.out.print( "a " + player.getPrimaryWeapon().getName() + " in their primary hand");
        }

        this.out.print( " and " );

        if ( player.getSecondaryWeapon() == null ){
            this.out.println( "nothing in their secondary hand." );
        }
        else{
            this.out.println( "a " + player.getSecondaryWeapon().getName() + " in their secondary hand." );
        }
    }

    private void outputArmor( Player player ){
        this.out.println();

        this.out.println( player.getName() + " has an armor class of " + player.getArmorValue());
    }
}
