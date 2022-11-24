package com.finalproject.m20922.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long buyItemId;

    private String buyItemName;
    private String buyItemPrice; 
    private String buyItemDescription;

    public Buy() {
    }

    public Buy(String buyItemName, String buyItemPrice, String buyItemDescription) {
        this.buyItemName = buyItemName;
        this.buyItemPrice = buyItemPrice;
        this.buyItemDescription = buyItemDescription;
    }

    public long getBuyItemId() {
        return buyItemId;
    }

    public void setBuyItemId(long buyItemId) {
        this.buyItemId = buyItemId;
    }

    public String getBuyItemName() {
        return buyItemName;
    }

    public void setBuyItemName(String buyItemName) {
        this.buyItemName = buyItemName;
    }

    public String getBuyItemPrice() {
        return buyItemPrice;
    }

    public void setBuyItemPrice(String buyItemPrice) {
        this.buyItemPrice = buyItemPrice;
    }

    public String getBuyItemDescription() {
        return buyItemDescription;
    }

    public void setBuyItemDescription(String buyItemDescription) {
        this.buyItemDescription = buyItemDescription;
    }

    

}