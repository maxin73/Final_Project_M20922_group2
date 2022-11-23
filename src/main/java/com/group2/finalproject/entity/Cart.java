package com.group2.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.JoinTable;
// import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

    private String itemName;
    private long quantity;
    private long itemPrice;
    

    // @ManyToMany
    
    // @JoinTable(name="cart"),
    // joinColumns = @JoinColumn(name=""),
    // inverseJoinColumns = @JoinColumn(name =""),
    // private List<>  ;
    

    public Cart() {
    }

    public Cart(String itemName, long quantity, long itemPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public long getItemId() {
        return itemId;
    }


    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public long getQuantity() {
        return quantity;
    }


    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }


    public long getItemPrice() {
        return itemPrice;
    }


    public void setItemPrice(long itemPrice) {
        this.itemPrice = itemPrice;
    }

    
}
