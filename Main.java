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
import model.items.weapons.bladed.DeulDaggers;
import model.items.currency.GoldBar;
import model.items.consumables.potions.PotionOfSight;
import model.items.currency.GoldCoin;
import model.items.consumables.misc.Earplugs;

import model.containers.packs.Backpack;
import model.containers.Container;
import model.containers.small.Pockets;


// armor imports
import model.items.armorpieces.chest.ThickSweater;
import model.items.armorpieces.chest.KevlarVest;
import model.items.armorpieces.feet.SteelToedBoots;
import model.items.armorpieces.feet.Crocs;
import model.items.armorpieces.legs.KevlarPants; 
import model.items.armorpieces.head.ThickBeanie;
import model.items.armorpieces.head.TheGodHelm;

// navin's imports
import model.items.armorpieces.chest.SteelChestPlate;
import model.items.armorpieces.legs.SteelLeggings;
import model.items.armorpieces.feet.SteelBoots;
import model.items.armorpieces.head.SteelHelmet;


public class Main {
  public static void main(String[] args) {

    PlayerConsole console = new PlayerConsole(System.out, System.in);

    runJasonsTest(console);
    
    // student calls here
    //runShivsTest(console);
    //runJakubtest(console);
    runNavinTest(console);
    //runWaleedsTest(console);
    runJohnnyTest(console);
    runAngelinaTest(console);
    //runBreannaTest(console);
    //runSydneyTest(console);
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
    Player player = new Player("Bob the face flop",3,5);

    Broadsword bladed = new Broadsword();
    player.setPrimaryWeapon( bladed );
    SackOfJewls currency = new SackOfJewls();
    GoldBar moola = new GoldBar();
    TheGodHelm Mewin = new TheGodHelm();
    Crocs Melose = new Crocs();

    Backpack bp = new Backpack();

    player.setStorage(bp);
       
    player.setArmor( Player.ARMOR_SLOT_HEAD, Mewin );
    player.setArmor( Player.ARMOR_SLOT_FEET, Melose);
    
    player.getStorage().addItemToContainer( currency );
    player.getStorage().addItemToContainer( moola );

 

    console.outputPlayer(player);
    
  }

  private static void runAngelinaTest(PlayerConsole console){
    Player player = new Player("Angelina", 7, 9);
    
    //instantiate armor
    ThickSweater chest = new ThickSweater();
    SteelToedBoots feet = new SteelToedBoots();
    KevlarPants legs = new KevlarPants();
    ThickBeanie head = new ThickBeanie();

    Staff blunt = new Staff();
    player.setPrimaryWeapon( blunt );
    DeulDaggers bladed = new DeulDaggers();
    CopperCoin currency = new CopperCoin();
    PotionOfSight potions = new PotionOfSight();
    Earplugs misc = new Earplugs();
    Backpack bp = new Backpack();
    
    player.setStorage(bp);
    player.setArmor( Player.ARMOR_SLOT_CHEST, chest);
    player.setArmor(Player.ARMOR_SLOT_FEET, feet);
    player.setArmor(Player.ARMOR_SLOT_LEG, legs);
    player.setArmor(Player.ARMOR_SLOT_HEAD, head);
    
    player.getStorage().addItemToContainer( currency );
    player.getStorage().addItemToContainer( bladed );
    player.getStorage().addItemToContainer( potions );
    player.getStorage().addItemToContainer( misc );

    console.outputPlayer(player);
  }

  private static void runNavinTest( PlayerConsole console ){
    Player player = new Player("Navin", 9, 9);
    
    ShortSword sword = new ShortSword();
    player.setPrimaryWeapon(sword);
    
    HealingPotion potion = new HealingPotion();
    GoldCoin currency = new GoldCoin();
    // instantiate some armor!
    SteelChestPlate chestPlate = new SteelChestPlate();
    SteelBoots Boots = new SteelBoots();
    SteelHelmet Helmet = new SteelHelmet();
    SteelLeggings Leggings= new SteelLeggings();
    Backpack bp = new Backpack();
    player.setStorage(bp);
    player.setArmor(Player.ARMOR_SLOT_CHEST, chestPlate);
    player.setArmor(Player.ARMOR_SLOT_FEET, Boots);
    player.setArmor(Player.ARMOR_SLOT_HEAD, Helmet);
    player.setArmor(Player.ARMOR_SLOT_LEG, Leggings);

    bp.addItemToContainer(potion);
    bp.addItemToContainer(currency);
    bp.addItemToContainer(sword);


    console.outputPlayer(player);
  }

  private static void runShivsTest(PlayerConsole console){
    Player player = new Player ( "The Great One", 62, 900 );
    Molotov motlov = new Molotov();

    console.outputPlayer( player );
  }

  private static void runJasonsTest( PlayerConsole console ){
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

    console.outputPlayer( player );
  }
}

