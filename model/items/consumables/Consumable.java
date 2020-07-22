package model.items.consumables;

import model.items.Item;

public class Consumable extends Item {
  
    private Integer Efectiveness;
 
    public Consumable( String name, Integer size, Integer Efectiveness){
    
    super( name, size );
    this.Efectiveness = Efectiveness;  
  }

  public void setEfectiveness( Integer Efectiveness ){
    this.Efectiveness = Efectiveness;
  }

  public Integer getEfectiveness(){
    return this.Efectiveness;
  }
}