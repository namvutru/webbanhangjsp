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
public class OderDetail {
    private String orid;   
    private Product pr;
    private int quanlity;
    private float sellprice;

    public OderDetail() {
    }

    public OderDetail(String orid, Product pr, int quanlity, float sellprice) {
        this.orid = orid;
        this.pr = pr;
        this.quanlity = quanlity;
        this.sellprice = sellprice;
    }

    public String getOrid() {
        return orid;
    }

    public void setOrid(String orid) {
        this.orid = orid;
    }

    public Product getPr() {
        return pr;
    }

    public void setPr(Product pr) {
        this.pr = pr;
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
