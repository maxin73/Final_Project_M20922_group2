package com.jemp.buy_product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class product{
    

    public product(){
    }


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String productDescription;
    private float price;
   
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString(){
        return "product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", productDescription=" + productDescription +
        ", price=" + price +
        '}';
    }
    
}
