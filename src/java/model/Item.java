/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author luuti
 */
public class Item {
    private Product product;
    private int quanlity;
    private float sellprice;

    public Item() {
    }

    public Item(Product product, int quanlity, float sellprice) {
        this.product = product;
        this.quanlity = quanlity;
        this.sellprice = sellprice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public float getSellprice() {
        return sellprice;
    }

    public void setSellprice(float sellprice) {
        this.sellprice = sellprice;
    }
    
    
}
