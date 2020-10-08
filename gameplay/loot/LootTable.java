package gameplay.loot;

/**
* This is generic loot that has the potential to be generated on each mob in the game.
* Each creature should call its own generateLoot in the constructor and should override
* the function in their own classes.
*/
public class LootTable {

  public static final Integer MAX_LOOT_LEVEL = 10;

  public LootTable( Integer lootLevel ){

    if ( lootLevel > MAX_LOOT_LEVEL ){
      lootLevel = MAX_LOOT_LEVEL;
    }

    generateLoot( lootLevel );
  }

  private void generateLoot( Integer lootLevel ){
    // TODO: create loot levels on items 
  }
}