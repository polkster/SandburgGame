import io.PlayerConsole;
import model.character.Player;
import model.items.consumables.potions.HealingPotion;
import model.items.weapons.other.Molotov;
import model.items.weapons.axe.ShortAxe;
import model.items.weapons.bladed.Broadsword;
import model.items.weapons.bladed.ShortSword;
import model.items.weapons.blunt.Staff;
import model.items.currency.SackOfJewls;
import model.items.currency.CopperCoin;
import model.items.weapons.blunt.WarHammer;

import model.containers.packs.Backpack;
import model.containers.Container;
import model.containers.small.Pockets;

public class Main {
  public static void main(String[] args) {

    PlayerConsole console = new PlayerConsole(System.out, System.in);

    // student calls here
    runShivsTest(console);
    runJakubtest(console);
    runNavinTest(console);
    runWaleedsTest(console);
    runJohnnyTest(console);
    runAngelinaTest(console);
    runBreannaTest(console);
    runSydneyTest(console);
  }

  private static void runWaleedsTest( PlayerConsole console ){
    Player player = new Player( "Waleed", 10, 8 );

    console.outputPlayer(player);
  }

  private static void runJakubtest( PlayerConsole console ){
    Player player = new Player( "Fin6000", 7, 8 );

    WarHammer hammer = new WarHammer();
    player.setPrimaryWeapon(hammer);

    console.outputPlayer(player);
  }

  private static void runBreannaTest(PlayerConsole console){
    Player player = new Player( "Breanna", 7, 8 );

    console.outputPlayer(player);
  }

  private static void runSydneyTest(PlayerConsole console){
    Player player = new Player("Sydney",1,2);

    console.outputPlayer(player);
  }

  private static void runJohnnyTest(PlayerConsole console){
    Player player = new Player("Bob The Face Flop",6000,350000);

    Broadsword bladed = new Broadsword();
    player.setPrimaryWeapon( bladed );
    SackOfJewls currency = new SackOfJewls();
    console.outputPlayer(player);
    Backpack bp = new Backpack();

    player.setStorage(bp);
    
  }

  private static void runAngelinaTest(PlayerConsole console){
    Player player = new Player("Angelina", 7, 9);

    Staff blunt = new Staff();
    player.setPrimaryWeapon( blunt );
    CopperCoin currency = new CopperCoin();

    console.outputPlayer(player);
  }

  private static void runNavinTest( PlayerConsole console ){
    Player player = new Player("Navin", 9, 9);

    console.outputPlayer(player);
    
    ShortSword sword = new ShortSword();
    player.setPrimaryWeapon(sword);
    HealingPotion potion = new HealingPotion();
    //GoldCoin Coin = 
  }

  private static void runShivsTest(PlayerConsole console){
    Player player = new Player ( "The Great One", 62, 900
   );
    Molotov motlov = new Molotov();

    console.outputPlayer( player );
  }

  private static void runJasonsTest( PlayerConsole console ){
    Player player = new Player("Jason the Fighter", 10, 8 );

    ShortAxe axe = new ShortAxe();
    player.setPrimaryWeapon( axe );

    HealingPotion potion = new HealingPotion();
    Molotov molotov = new Molotov();
    Backpack bp = new Backpack();

    player.setStorage(bp);

    player.getStorage().addItemToContainer( potion );
    player.getStorage().addItemToContainer( molotov );

    console.outputPlayer( player );
  }
}

