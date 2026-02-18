/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.labfinal;

/**
 *
 * @author mahmad
 */
public interface Stockable {
    void addStock(int quantity) throws StockOverflowException;
}
