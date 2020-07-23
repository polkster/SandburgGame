package model.creatures;

import java.util.Random;

public class Creature {

  private boolean allowsEscape;

  private boolean special;

  private boolean Earplugs;

  // parameters
  private String name;
  private Integer level;
  private Integer hitDice;
  private Integer minAttackValue;
  private Integer maxAttackValue;
  
  // calculated values
  private Integer hitPoints = 0;
  
  /*
  * @param 	name			The name of the creature (can be non unique)
  * @param	level			What level the creature is
  *	@param	hitDice			Hitpoints are determined by multiplying (a random value between 1 and hitDice) and level 
  * @param 	minAttackValue	The minimum amount of damage a creature can do with a melee attack
  * @param	maxAttackValue	The maximum amount of damage a creature can do with a melee attack
  */
  public Creature( String name, Integer level, Integer hitDice, Integer minAttackValue, Integer maxAttackValue ){
  	this.name = name;
    this.level = level;
    this.hitDice = hitDice;
    this.minAttackValue = minAttackValue;
    this.maxAttackValue = maxAttackValue;
    this.allowsEscape = true;
    this.special = false;
    
    // this will determine the creatures hit points upon instantiation
    calculateHitPoints();
  }
  
  // a creature's hitdice allows variability in the creatures
  // overall total hit points. 
  private void calculateHitPoints(){
    
    Random rnd = new Random();
    
    // for each level, we roll a hitdice and add it to the overall hitpoints
    for ( Integer i = 0; i < this.level; i++ ){
      Integer val = rnd.nextInt(this.hitDice);

      if ( val == 0 ){
        val = 1;
      }
      
      // this is the abbreviation of this.hitPoints = this.hitPoints + val;
      this.hitPoints += val;
    }
  }
  
  public void setHitDice( Integer hitDice ){
    this.hitDice = hitDice;
  }
  
  public Integer getHitDice(){
    return this.hitDice;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName( String name ){
    this.name = name;
  }
  
  public Integer getLevel(){
    return this.level;
  }
  
  public void setLevel( Integer level ){
    this.level = level;
  }
  
  public Integer getCurrentHitPoints(){
    return this.hitPoints;
  }
  
  public void setCurrentHitpoints( Integer hitPoints ){
    this.hitPoints = hitPoints;
  }
  
  public Integer getMinimumAttackValue(){
    return this.minAttackValue;
  }
  
  public void setMinimumAttackValue( Integer value ){
    this.minAttackValue = value;
  }
  
  public Integer getMaximumAttackValue(){
    return this.maxAttackValue;
  }
  
  public void setMaximumAttackValue( Integer value ){
    this.maxAttackValue = value;
  }

  public boolean allowsEscape(){
    return this.allowsEscape;
  }

  public void setAllowsEscape( boolean allowsEscape ){
    this.allowsEscape = allowsEscape;
  }

  public boolean isSpecial(){
    return this.special;
  }

  public void setSpecial(boolean special){
    this.special = special;
  }
}
