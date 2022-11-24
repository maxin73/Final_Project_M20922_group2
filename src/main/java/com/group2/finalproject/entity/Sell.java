package com.group2.finalproject.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sell {
  
  //Fields
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String itemName;
  private int price;
  private String itemDescription;
  private String genre;


  //Constructor
  public Sell (){
  }

  public Sell(String itemName, int price, String itemDescription) {
    this.itemName = itemName;
    this.price = price;
    this.itemDescription = itemDescription;
    this.genre = genre;
  }


  //Getter and Setter
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
