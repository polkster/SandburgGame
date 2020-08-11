import java.util.List;

import gameplay.combat.Combat;
import gameplay.world.WorldGenerator;

import java.util.ArrayList;
import java.util.Random;

import io.PlayerConsole;
import model.character.Player;
import model.items.consumables.potions.HealingPotion;
import model.items.weapons.other.Molotov;
import model.locations.Location;
import model.items.weapons.axe.ShortAxe;
import model.items.weapons.bladed.Broadsword;
import model.items.weapons.bladed.ShortSword;
import model.items.weapons.blunt.Staff;
import model.items.currency.SackOfJewls;
import model.items.currency.CopperCoin;
import model.items.weapons.blunt.WarHammer;
import model.items.weapons.bladed.DeulDaggers;
import model.items.currency.GoldBar;
import model.items.consumables.potions.PotionOfSight;
import model.items.currency.GoldCoin;
import model.items.consumables.misc.Earplugs;
import model.containers.packs.Backpack;
import model.containers.packs.BackPackingPack;
import model.containers.Wagons.OxDrawnWagon;
import model.containers.Container;
import model.containers.small.Pockets;
import model.items.consumables.oneuseweapons.ToasterFullOBoom;
import model.items.weapons.bladed.Dieplz;


// armor imports
import model.items.armorpieces.chest.ThickSweater;
import model.items.armorpieces.chest.KevlarVest;
import model.items.armorpieces.feet.SteelToedBoots;
import model.items.armorpieces.feet.Crocs;
import model.items.armorpieces.legs.KevlarPants; 
import model.items.armorpieces.head.ThickBeanie;
import model.items.armorpieces.head.TheGodHelm;
import model.items.armorpieces.eyes.Sunglasses;
// navin's imports
import model.items.armorpieces.chest.SteelChestPlate;
import model.items.armorpieces.legs.SteelLeggings;
import model.items.armorpieces.feet.SteelBoots;
import model.items.armorpieces.head.SteelHelmet;
import model.items.armorpieces.eyes.SteelGlasses;

// bad guy imports
import model.creatures.Creature;
import model.creatures.magical.Ogre;
import model.creatures.magical.Siren;
import model.creatures.bosses.Demon;


public class Main {

  private static Location [][] world = null;
  private static Random random = new Random();

  private static int playerX = 0;
  private static int playerY = 0;

  public static void main(String[] args) {

    boolean alive = true;
    PlayerConsole console = new PlayerConsole(System.out, System.in);
    Player player = loadWaleed(console);

    createWorld();
    spawnPlayer();

    while ( alive ){
      Location location = world[playerX][playerY];

      console.outputMessage(location.getDescription());
      console.outputMessage("There are " + location.getOpponents().size() + " creatures in this room" );
      
      showEscapeHatch(location, console);
      showOptionMenu(location, player, console);
    }
  }

  private static void showEscapeHatch(Location location, PlayerConsole console){
    if ( location.isEscapeHatch() ){
      console.outputMessage("You have found the escape hatch!");
    }
  }

  private static void showOptionMenu(Location location, Player player, PlayerConsole console){

    if ( location.getOpponents().size() > 0 ){
      runCombat( console, player, location );
    }
    else{
      processMovement( location, console );
    }
  }

  private static void processMovement( Location location, PlayerConsole console ){
    
    String options = fetchMovementOptions();

    if ( location.isEscapeHatch() ){
      options += "U) escape!";
    }

    console.outputMessage(options);

    String input = console.getInput().toUpperCase();

    if ( options.indexOf(input+")") > -1 ){
      if ( input.equals("N") ){
        playerY--;
      }
      else if ( input.equals("S") ){
        playerY++;
      }
      else if ( input.equals("W") ){
        playerX--;
      }
      else if ( input.equals("E") ){
        playerX++;
      }
      else if ( input.equals("U") ){
        console.outputMessage("You have escaped the dungeon!");
        console.outputMessage("GAME OVER!  You finished the game!");
        System.exit(0);
      }
    }

    console.outputMessage("You go: " + input+"\n\n");
  }

  private static String fetchMovementOptions(){
    String options = "";

    if ( playerY > 0 ){
      options = "N) North    ";
    }

    if ( playerX < world.length-1 ){
      options += "E) East    ";
    }

    if ( playerX > 0 ){
      options += "W) West    ";
    }

    if ( playerY < world.length-1 ){
      options += "S) South    ";
    }

    return options;
  }

  private static void spawnPlayer(){
    int x = random.nextInt(world.length);
    int y = random.nextInt(world.length);

    playerX = x;
    playerY = y;
  }

  private static void createWorld(){

    int worldSize = 5;
    world = WorldGenerator.generateWorld(worldSize,worldSize);

    int x = random.nextInt(worldSize);
    int y = random.nextInt(worldSize);

    playerX = random.nextInt(worldSize);
    playerY = random.nextInt(worldSize);

    world[x][y].setEscapeHatch(true); // this is the place they have to find to escape!
  }

  private static Player loadWaleed( PlayerConsole console ){
    Player player = new Player( "Waleed", 10, 8 );

    DeulDaggers daggers = new DeulDaggers();
    player.setPrimaryWeapon( daggers );

    SteelChestPlate chest = new SteelChestPlate();
    SteelToedBoots boots = new SteelToedBoots();
    SteelHelmet helmet = new SteelHelmet();
    SteelLeggings leggings = new SteelLeggings();

    player.setArmor( Player.ARMOR_SLOT_CHEST, chest );
    player.setArmor( Player.ARMOR_SLOT_FEET, boots );
    player.setArmor( Player.ARMOR_SLOT_HEAD, helmet );
    player.setArmor( Player.ARMOR_SLOT_LEG, leggings );

    console.outputPlayer(player);

    return player;
  }

  private static void runJakubtest( PlayerConsole console ){
    Player player = new Player( "Fin6000", 7, 8 );

    WarHammer hammer = new WarHammer();
    player.setPrimaryWeapon(hammer);

    console.outputPlayer(player);
  }

  private static Player loadBreanna(PlayerConsole console){
    Player player = new Player( "Breanna", 7, 8 );

    WarHammer hammer = new WarHammer();
    player.setPrimaryWeapon( hammer );

    KevlarVest vest = new KevlarVest();
    player.setArmor( Player.ARMOR_SLOT_CHEST, vest );

    console.outputPlayer(player);

    return player;
  }

  private static Player loadSydney(PlayerConsole console){
    Player player = new Player("Sydney",1,2);

    ShortSword sword = new ShortSword();
    player.setPrimaryWeapon(sword);

    console.outputPlayer(player);

    return player;
  }

  private static Player loadJohnny(PlayerConsole console){
    Player player = new Player("Bob the face flop",10000,500);

    Broadsword bladed = new Broadsword();
    player.setPrimaryWeapon( bladed );
    SackOfJewls currency = new SackOfJewls();
    GoldBar moola = new GoldBar();
    TheGodHelm Mewin = new TheGodHelm();
    Crocs Melose = new Crocs();
    ToasterFullOBoom BOOM = new ToasterFullOBoom();
    Dieplz DIE = new Dieplz();

    OxDrawnWagon wn = new OxDrawnWagon();

    player.setStorage(wn);
       
    player.setArmor( Player.ARMOR_SLOT_HEAD, Mewin );
    player.setArmor( Player.ARMOR_SLOT_FEET, Melose);
    
    player.getStorage().addItemToContainer( currency );
    player.getStorage().addItemToContainer( moola );
    player.getMisc().addItemToContainer( BOOM );
    player.setPrimaryWeapon( DIE );

    console.outputPlayer(player); 

    return player;
  }

  private static void runAngelinaTest(PlayerConsole console){
    Player player = new Player("Angelina", 7, 11);
    
    //instantiate armor
    ThickSweater chest = new ThickSweater();
    SteelToedBoots feet = new SteelToedBoots();
    KevlarPants legs = new KevlarPants();
    ThickBeanie head = new ThickBeanie();
    Sunglasses eyes = new Sunglasses();

    Staff blunt = new Staff();
    player.setPrimaryWeapon( blunt );
    DeulDaggers bladed = new DeulDaggers();
    CopperCoin currency = new CopperCoin();
    PotionOfSight potions = new PotionOfSight();
    HealingPotion potion = new HealingPotion();
    Earplugs misc = new Earplugs();
    Backpack bp = new Backpack();
    
    player.setStorage(bp);
    player.setArmor( Player.ARMOR_SLOT_CHEST, chest);
    player.setArmor(Player.ARMOR_SLOT_FEET, feet);
    player.setArmor(Player.ARMOR_SLOT_LEG, legs);
    player.setArmor(Player.ARMOR_SLOT_HEAD, head);
    player.setArmor(Player.ARMOR_SLOT_EYE, eyes);
    
    player.getStorage().addItemToContainer( currency );
    player.getStorage().addItemToContainer( bladed );
    player.getStorage().addItemToContainer( potions );
    player.getStorage().addItemToContainer( potion);
    player.getMisc().addItemToContainer(misc); 


    console.outputPlayer(player);
  }

  private static Player loadNavin( PlayerConsole console ){
    Player player = new Player("Navin", 9, 9);
    
    WarHammer hammer = new WarHammer();
    player.setPrimaryWeapon(hammer);
    
    HealingPotion potion = new HealingPotion();
    GoldCoin currency = new GoldCoin();
    // instantiate some armor!

    Backpack bp = new Backpack(); 
    bp.addItemToContainer(currency);
    
    SteelChestPlate chestPlate = new SteelChestPlate();
    SteelBoots Boots = new SteelBoots();
    SteelHelmet Helmet = new SteelHelmet();
    SteelLeggings Leggings= new SteelLeggings();
    SteelGlasses Eyes = new SteelGlasses();
    
    player.setStorage(bp);
    player.setArmor(Player.ARMOR_SLOT_CHEST, chestPlate);
    player.setArmor(Player.ARMOR_SLOT_FEET, Boots);
    player.setArmor(Player.ARMOR_SLOT_HEAD, Helmet);
    player.setArmor(Player.ARMOR_SLOT_LEG, Leggings);
    player.setArmor(Player.ARMOR_SLOT_EYE, Eyes);

    bp.addItemToContainer(potion);
    bp.addItemToContainer(hammer);

    console.outputPlayer( player );

    return player;
  }

  private static Player loadShiv(PlayerConsole console){
    Player player = new Player ( "The Great One",7000, 900 );
    
    Molotov motlov = new Molotov();
    WarHammer hammer = new WarHammer();
    SteelBoots Boots = new SteelBoots();
    SteelHelmet Helmet = new SteelHelmet();
    SteelChestPlate chestPlate = new SteelChestPlate();
    SteelLeggings Leggings= new SteelLeggings();
    SteelGlasses Glasses = new SteelGlasses();
    Backpack bp = new Backpack();
    player.setStorage(bp);

    player.setArmor(Player.ARMOR_SLOT_CHEST, chestPlate);
    player.setArmor(Player.ARMOR_SLOT_FEET, Boots);
    player.setArmor(Player.ARMOR_SLOT_HEAD, Helmet);
    player.setArmor(Player.ARMOR_SLOT_LEG, Leggings);
    ShortAxe axe = new ShortAxe();
    console.outputPlayer( player );

    player.setPrimaryWeapon(hammer);

    return player;
  }

  private static Integer getCombatAction(String action){

    try{
      Integer combatAction = Integer.parseInt(action);

      return combatAction;
    }
    catch ( NumberFormatException e ){
      // throwing this away
    }

    return 0;
  }

  private static void runCombat( PlayerConsole console, Player player, Location location ){

    boolean inCombat = true;

    Combat combat = new Combat( console, player, location.getOpponents() );
    String action = "";

    while ( inCombat ){
    
      console.outputMessage(" "+Combat.ACTION_MELEE + ") Primary Attack   " + Combat.ACTION_FLEE + ") Flee    " +
                          Combat.ACTION_SECONDARY + ") Secondary Attack    " + Combat.ACTION_CONSUMABLE + ") Use Consumable");
    
      action = getPlayerCombatAction(console);
      
      if ( action != null ){

        int combatAction = getCombatAction(action);
        int state = combat.executeAction(combatAction, 0);

        if ( state == Combat.STATE_DEAD ){
          console.outputMessage("Your character has died.  So sad!!!");
          console.outputMessage("\nGAME OVER");
          System.exit(0);
        }
        else if ( state == Combat.STATE_FLED ){
          console.outputMessage("You have successfully fled the combat!");
          inCombat = false;

          fleeRandomDirection(console);
          location.setOpponents(combat.getOpponents());
        }
        else if ( state == Combat.STATE_ALIVE ){
          if ( combat.getOpponentCount() == 0 ){
            inCombat = false;
            console.outputMessage("You have successfully defeated your opponents!");
            location.setOpponents(combat.getOpponents());
          }
        }
      }
    }
  }

  private static void fleeRandomDirection( PlayerConsole console ){
    console.outputMessage("You have sucessfully fled!");

    if ( playerX -1 > 0 ){
      playerX--;
    }

    if ( playerY -1 > 0 ){
      playerY--;
    }
  }

  private static String getPlayerCombatAction( PlayerConsole console ){

    String value = console.getInput();

    return value;
  }

  private static Player loadCharacter(){
    Player player = new Player("Jason the Fighter", 10, 8 );

    // instantiate some armor!
    SteelChestPlate chestPlate = new SteelChestPlate();

    ShortAxe axe = new ShortAxe();
    player.setPrimaryWeapon( axe );

    HealingPotion potion = new HealingPotion();
    Molotov molotov = new Molotov();
    Backpack bp = new Backpack();

    player.setStorage(bp);
    player.setArmor( Player.ARMOR_SLOT_CHEST, chestPlate );

    player.getStorage().addItemToContainer( potion );
    player.getStorage().addItemToContainer( molotov );

    return player;
  }
}

