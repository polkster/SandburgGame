package model.items.currency;

import model.items.Item;

public class Money extends Item {

    private Integer Value;
 
    public Money( String name, Integer size, Integer Value){
    
    super( name, size );
    this.Value = Value;  
  }

  public void setValue( Integer Value ){
    this.Value = Value;
  }

  public Integer getValue(){
    return this.Value;
  }
}
//johnny
  