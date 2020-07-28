import io.PlayerConsole;
import model.character.Player;
import model.items.consumables.potions.HealingPotion;
import model.items.weapons.axe.ShortAxe;


public class Main {
  public static void main(String[] args) {

    PlayerConsole console = new PlayerConsole(System.out, System.in);

    runJasonsTest(console);

  }

  private static void runJasonsTest( PlayerConsole console ){
    Player player = new Player("Jason the Fighter", 10, 8 );

    ShortAxe axe = new ShortAxe();
    HealingPotion potion = new HealingPotion();

    player.setPrimaryWeapon( axe );

    console.outputPlayer( player );
  }
}

