package gameplay.combat;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import io.PlayerConsole;
import model.character.Player;
import model.creatures.Creature;
import model.items.weapons.Weapon;

import model.items.consumables.*;

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

  public static final Integer STATE_ALIVE = 1;
  public static final Integer STATE_DEAD = 2;
  public static final Integer STATE_FLED = 3;

  private Player player;
  private List<Creature> opponents;
  private PlayerConsole console;

  public Combat( PlayerConsole console, Player player, List<Creature> opponents ){
    this.player = player;
    this.opponents = opponents;
    this.console = console;

    outputCombatInfo();
  }

  public List<Creature> getOpponents(){
    return this.opponents;
  }

  private void outputCombatInfo(){

    for ( int i = 0; i < opponents.size(); i++ ){
      this.console.outputCreature(opponents.get(i));
    }
  }

  public Player getPlayer(){
    return this.player;
  }

  public Integer getOpponentCount(){
    return (this.opponents != null ) ? this.opponents.size() : 0;
  }

  /**
  *
  * @param action     What type of action is the player taking
  * @param target     What creature is the player attacking (opponents list index)
  */
  public Integer executeAction( Integer action, Integer target ){
    if ( action == ACTION_MELEE ){
      return processAttacks(target);
    }
    else if ( action == ACTION_FLEE ){
      if ( processEscape() ){
        return STATE_FLED;
      }
    }
    else if ( action == ACTION_SECONDARY ){
      return processSecondary( target );
    }
    else if ( action == ACTION_CONSUMABLE ){
      return processConsumable( target );
    }

    return STATE_ALIVE;
  }

  private Integer processAttacks( Integer target ){

    if ( this.opponents != null && target < this.opponents.size() ){
      Creature creature = this.opponents.get(target);

      if ( processAttack( this.player, creature ) ){

        removeOpponent( target );
      }

      for ( int i = 0; i < this.opponents.size(); i++ ){
        creature = this.opponents.get(i);

        if( processAttack( creature, this.player ) ){
          return STATE_DEAD;
        }
      }    
    }
    else{
      this.console.outputMessage("There is no one to attack!");
    }

    return STATE_ALIVE;
  }

  private void removeOpponent(Integer target){

    List<Creature> list = new ArrayList<Creature>();

    for ( int i = 0; i < this.opponents.size(); i++ ){
      if ( i != target ){
        list.add( this.opponents.get(i) );
      }
    }  

    this.opponents = list;  
  }

  private boolean processEscape(){
    if ( this.opponents != null ){
      for ( int i = 0; i < this.opponents.size(); i++ ){
        Creature creature = this.opponents.get(i);

        if ( !creature.allowsEscape() ){
          return false;
        }
      }
    }

    return true;
  }

  private Integer processSecondary( Integer target ){
    return STATE_ALIVE;
  }

  // can only use a consumable that is stored in the pockets.
  private Integer processConsumable( Integer item ){

    if ( item < this.player.getMisc().getItems().size() ){

      Consumable consumable = (Consumable)this.player.getMisc().getItems().get(item);
      Integer value = consumable.getEffectiveness();

      if ( consumable.getEffectType() == Consumable.EFFECT_TYPE_HEALING ){
        this.player.setCurrentHitpoints( this.player.getCurrentHitPoints() + value );

        this.console.outputMessage(this.player.getName() + " has used a healing item for " + value + " hitpoints");
      }
      else if( consumable.getEffectType() == Consumable.EFFECT_TYPE_DAMAGE ){
        
        Integer [] targets = new Integer[this.opponents.size()];
        for ( int i = 0; i < this.opponents.size(); i++ ){
          Creature creature = this.opponents.get(i);

          creature.setCurrentHitpoints( creature.getCurrentHitPoints() - value );

          if ( creature.getCurrentHitPoints() <= 0 ){
            this.console.outputMessage(creature.getName() + " has died from boom damage!" );
            targets[i] = 1;
          }
          else{
            targets[i] = 0;
          }
        }

        for ( int i = targets.length-1; i >=0; i-- ){
          if ( targets[i] == 1 ){
            removeOpponent(i);
          }
        }
      }
    }
    else{
      this.console.outputMessage("You don't have any consumables!");
    }

    removeConsumable( item );

    return STATE_ALIVE;
  }

  private void removeConsumable( Integer item ){
    if ( this.player.getMisc() != null && item < this.player.getMisc().getItems().size() ){
      this.player.getMisc().removeItemFromContainer(item);
    }
  }

  private Integer rollAttack( int min, int max ){
    Random rnd = new Random(System.currentTimeMillis());

    Integer value = rnd.nextInt( max );

    if ( value < min ){
      value = min;
    }

    return value;
  }

  private boolean processAttack( Creature attacker, Creature defender ){

    Integer minDamage = attacker.getMinimumAttackValue();
    Integer maxDamage = attacker.getMaximumAttackValue();

    if ( attacker instanceof Player ){
      Player player = (Player)attacker;

      if ( player.getPrimaryWeapon() != null ){
        Weapon primary = player.getPrimaryWeapon();

        minDamage = primary.getMinDamage();
        maxDamage = primary.getMaxDamage();
      }
    }

    Integer attackValue = rollAttack(minDamage, maxDamage);
    Integer hitPoints = defender.getCurrentHitPoints();

    if ( defender instanceof Player ){
      Player player = (Player)defender;
      Integer armor = player.getArmorValue();

      attackValue -= armor;

      if ( attackValue <= 0 ){
        attackValue = 1;
        this.console.outputMessage(player.getName() + "'s armor absorbed most of the damage from " + attacker.getName() + "'s attack");
      }
    }

    if ( attackValue != 0 ){
      this.console.outputMessage(attacker.getName() + " hits " + defender.getName() + " for " + attackValue + " points of damage.");
      defender.setCurrentHitpoints( defender.getCurrentHitPoints() - attackValue);
    }

    if ( defender.getCurrentHitPoints() <= 0 ){
      this.console.outputMessage(defender.getName() + " has died!\n");
      return true;
    }

    this.console.outputMessage(defender.getName() + " has " + defender.getCurrentHitPoints() + " out of " + defender.getMaxHitPoints()+" hitpoints remaining.\n");

    return false;
  }
}