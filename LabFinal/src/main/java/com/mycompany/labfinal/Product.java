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
public class Product extends Item implements Serializable{
    int productId;
    String title;

    public Product() {}
    public Product(int productId,String title){
    this.productId=productId;
    this.title=title;
    }
    public Product(Product p){
    this.productId=p.productId;
    this.title=p.title;
    }

    public int getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
     
    @Override
    public String toString(){
    return ("productId:"+this.productId+",Title:"+this.title);
    }    

    @Override
    public String getCatagory() {
        return "Product";
    }
    
}
