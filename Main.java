import io.PlayerConsole;
import model.character.Player;
import model.items.consumables.potions.HealingPotion;
import model.items.weapons.other.Molotov;
import model.items.weapons.axe.ShortAxe;

import model.containers.packs.Backpack;
import model.containers.Container;
import model.containers.small.Pockets;

public class Main {
  public static void main(String[] args) {

    PlayerConsole console = new PlayerConsole(System.out, System.in);

    runJasonsTest(console);

    // student calls here
  }

  private static void runJasonsTest( PlayerConsole console ){
    Player player = new Player("Jason the Fighter", 10, 8 );

    ShortAxe axe = new ShortAxe();
    HealingPotion potion = new HealingPotion();
    Molotov molotov = new Molotov();

    Backpack bp = new Backpack();

    player.setStorage(bp);

    player.getStorage().addItemToContainer( potion );
    player.getStorage().addItemToContainer( molotov );

    player.setPrimaryWeapon( axe );
    

    console.outputPlayer( player );
  }
}

