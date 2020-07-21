package model.items;

public class Item {
  
  public static final Integer SIZE_XS = 1;
  public static final Integer SIZE_SMALL = 2;
  public static final Integer SIZE_MEDIUM = 4;
  public static final Integer SIZE_LARGE = 8;
  public static final Integer SIZE_XL = 16;

  private String name;
  private Integer size;

  public Item( String name, Integer size ){
    this.name = name;
    this.size = size;
  }

  public void setSize( Integer size ){
    this.size = size;
  }

  public Integer getSize(){
    return this.size;
  }

  public void setName( String name ){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}