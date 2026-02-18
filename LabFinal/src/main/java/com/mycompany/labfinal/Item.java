/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labfinal;

import java.io.Serializable;

/**
 *
 * @author mahmad
 */
public abstract class Item implements Serializable{
    private int productId;
    private String itemName;
    
    Item(){}

    public Item(int productId, String itemName) {
        this.productId = productId;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getProductId() {
        return productId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public abstract String getCatagory(); 
}
