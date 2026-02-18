/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labfinal;

/**
 *
 * @author mahmad
 */
public class InventoryItem extends Product implements Stockable{
    int ItemID;
    int StockQuantity;

    public InventoryItem() {}
    public InventoryItem(int productId,String title,int ItemID,int StockQuantity){
    super(productId, title);
    this.ItemID=ItemID;
    this.StockQuantity=StockQuantity;
    }
    
    @Override
    public void addStock(int quantity) throws StockOverflowException {
        if(this.StockQuantity<=100){
        this.StockQuantity+=quantity;
    }
        else{
            throw new StockOverflowException("Stock Limit Exceeded!");
        }
    }
    
    @Override
    public String getCatagory(){
    return ("InventoryItem");
    }
    
    @Override
    public String toString(){
    return ("ItemID:"+this.ItemID+",Quantity:"+this.StockQuantity);
    }
}
