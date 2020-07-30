package gameplay.combat;

import java.util.List;
import io.PlayerConsole;
import model.character.Player;
import model.creatures.Creature;

/**
* A combat is a series of attacks.  Depending on who wins "initiative", 
* that entity goes first.  Adding "initiative" to "Creature" as a temporary
* variable that shows up only during combat.  There are multiple rounds which 
* get adjudicated based off of interaction from the Player(s)
*/
public class Combat {

  public static final Integer ACTION_MELEE = 1;     // swing whatever you have in your primary
  public static final Integer ACTION_FLEE = 2;      // Run away!
  public static final Integer ACTION_SECONDARY = 3; // use a secondary item (like a wand with charges)
  public static final Integer ACTION_CONSUMABLE = 4;

  private Player player;
  private List<Creature> opponents;

  public Combat( PlayerConsole console, Player player, List<Creature> opponents ){
    this.player = player;
    this.opponents = opponents;
  }

  public Player getPlayer(){
    return this.player;
  }

  /**
  *
  * @param action     What type of action is the player taking
  * @param target     What creature is the player attacking (opponents list index)
  */
  public void executeAction( Integer action, Integer target ){
    if ( action == ACTION_MELEE ){
      processAttacks(target);
    }
    else if ( action == ACTION_FLEE ){
      processEscape();
    }
    else if ( action == ACTION_SECONDARY ){
      processSecondary( target );
    }
    else if ( action == ACTION_CONSUMABLE ){
      processConsumable( target );
    }
  }

  private void processAttacks( Integer target ){

  }

  private void processEscape(){

  }

  private void processSecondary( Integer target ){

  }

  // can only use a consumable that is stored in the pockets.
  private void processConsumable( Integer item ){
    if ( this.player.getMisc().getItems().size() < item ){

    }
  }
}