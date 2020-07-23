package model.containers;

import java.util.List;

import model.items.Item;
import java.util.ArrayList;

public class Container {

  private Integer slots;
  
  // updated as items are added
  private Integer slotsInUse = 0;

  private List<Item> items;

  public Container( String name, Integer slots ){
    this.slots = slots;
    this.items = new ArrayList<Item>();
  }

  public Integer getSlots(){
    return this.slots;
  }

  public boolean addItemToContainer( Item item ){
    
    if ( this.slotsInUse + item.getSize() > this.slots ){
      return false;
    }

    items.add(item);
    this.slotsInUse += item.getSize();

    return true;
  }

  public boolean removeItemFromContainer( Integer index ){
    if ( index < this.items.size() ){
      Item item = this.items.get(index);

      this.slotsInUse -= item.getSize();
      this.items.remove( index );

      return true;
    }

    return false;
  }
}