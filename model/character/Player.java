package model.character;

// creature
import model.creatures.Creature;

// containers
import model.containers.Container;
import model.containers.small.Pockets;

// items
import model.items.Item;
import model.items.weapons.Weapon;
import model.items.armorpieces.Armor;

// Copyright 2020 - Jason Polk
public class Player extends Creature {

  private Armor chest = null;
  private Armor leg = null;
  private Armor feet = null;
  private Armor head = null;
  private Armor eye = null;

  private Container storage = null;
  private Container misc = new Pockets();

  private Weapon primary = null;
  private Weapon secondary = null;

  private Integer copperPieces = 0; 
  private Integer silverPieces = 0; // 10 copper pieces = 1 silver piece
  private Integer goldPieces = 0;   // 10 silver pieces = 1 gold piece

  public static final Integer ARMOR_SLOT_CHEST = 1;
  public static final Integer ARMOR_SLOT_LEG = 2;
  public static final Integer ARMOR_SLOT_FEET = 3;
  public static final Integer ARMOR_SLOT_HEAD = 4;
  public static final Integer ARMOR_SLOT_EYE = 5;

  public Player( String name, Integer level, Integer hitDice ){
      super( name, level, hitDice, -1, -1 );
  }

  public void setArmor( Integer slot, Armor piece ){
    if ( slot == ARMOR_SLOT_CHEST ){
      this.chest = piece;
    }
    else if ( slot == ARMOR_SLOT_LEG ){
      this.leg = piece;
    }
    else if ( slot == ARMOR_SLOT_FEET ){
      this.feet = piece;
    }
    else if ( slot == ARMOR_SLOT_HEAD ){
      this.head = piece;
    }
    else if ( slot == ARMOR_SLOT_EYE ){
      this.eye = piece;
    }
    else{
      System.out.println("TRIED TO EQUIP ARMOR IN THE WRONG SLOT!");
    }
  }

  public Armor getArmor( Integer slot ){
    if ( slot == ARMOR_SLOT_CHEST ){
      return this.chest;
    }
    else if ( slot == ARMOR_SLOT_LEG ){
      return this.leg;
    }
    else if ( slot == ARMOR_SLOT_FEET ){
      return this.feet;
    }
    else if ( slot == ARMOR_SLOT_HEAD ){
      return this.head;
    }
    else if ( slot == ARMOR_SLOT_EYE ){
      return this.eye;
    }
    else{
      System.out.println("TRIED TO EQUIP ARMOR IN THE WRONG SLOT!");
    }

    return null;
  }
  
  public Integer getArmorValue(){
    
    Integer value = 0;

    if ( this.chest != null ){
      value += this.chest.getProtection();
    }

    if ( this.head != null ){
      value += this.head.getProtection();
    }

    if ( this.leg != null ){
      value += this.leg.getProtection();
    }

    if ( this.feet != null ){
      value += this.feet.getProtection();
    }

    if ( this.eye != null ){
      value += this.eye.getProtection();
    }

    return value;
  }

  public Integer getAvailableStorageSlots(){

    Integer slots = 0;

    if ( this.storage != null ){
      slots += this.storage.getSlots();
    }

    if ( this.misc != null ){
      slots += this.misc.getSlots();
    }

    return slots;
  }

  public Container getStorage(){
    return this.storage;
  }

  public void setStorage( Container container ){
    this.storage = container;
  }

  public Container getMisc(){
    return this.misc;
  }

  public void setMisc( Container container ){
    this.misc = container;
  }

  public Weapon getPrimaryWeapon(){
    return this.primary;
  }

  public Weapon getSecondaryWeapon(){
    return this.secondary;
  }

  public void setPrimaryWeapon( Weapon weapon ){
    this.primary = weapon;
  }

  public void setSecondaryWeapon( Weapon weapon ){
    this.secondary = weapon;
  }
}