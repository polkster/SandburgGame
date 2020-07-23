package model.creatures.magical;

import model.creatures.Creature;

public class Guardian extends Creature {

  public static final Integer GUARDIAN_ATTACK_PUNCH = 1;
  public static final Integer GUARDIAN_ATTACK_CHOKE = 2;
  public static final Integer GUARDIAN_ATTACK_KICK = 3;
  public static final Integer GUARDIAN_ATTACK_STOMP = 4;

  private static final Integer GUARDIAN_HITDICE = 12;
  private static final Integer GUARDIAN_MIN_DAMAGE = 3;
  private static final Integer GUARDIAN_MAX_DAMAGE = 18;
  
  private Integer GuardianAttackType;
      
	public Guardian( String name, Integer level, Integer GuardianAttackType ){
      super(name, level, GUARDIAN_HITDICE, GUARDIAN_MIN_DAMAGE, GUARDIAN_MAX_DAMAGE);
      
      this.GuardianAttackType = GuardianAttackType;

      setSpecial(true);
  }
  
  public Integer getGuarndianAttackType(){
    return this.GuardianAttackType;
  }//johnny
}
