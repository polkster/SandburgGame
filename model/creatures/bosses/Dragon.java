package model.Creatures.bosses;

import model.creatures.Creature;

public class Dragon extends Creature {

  public static final Integer DRAGON_BREATH_FIRE = 1;
  public static final Integer DRAGON_BREATH_ICE = 2;
  public static final Integer DRAGON_BREATH_POISON = 3;
  public static final Integer DRAGON_BREATH_ACID = 4;

  private static final Integer DRAGON_HITDICE = 12;
  private static final Integer DRAGON_MIN_DAMAGE = 3;
  private static final Integer DRAGON_MAX_DAMAGE = 18;
  
  private Integer dragonBreathType;
      
	public Dragon( String name, Integer level, Integer dragonBreathType ){
      super(name, level, DRAGON_HITDICE, DRAGON_MIN_DAMAGE, DRAGON_MAX_DAMAGE);
      
      this.dragonBreathType = dragonBreathType;
  }
  
  public Integer getDragonBreathType(){
    return this.dragonBreathType;
  }
}
