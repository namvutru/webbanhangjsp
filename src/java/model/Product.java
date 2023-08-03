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
public class Product {
    private String masp;
    private String tensp;
    private String loaisp;
    private float giasp;
    private String anhsp;
    private int sumquanlity;
    private String idseller;
    private int hire;
    public Product() {
    }

    public Product(String masp, String tensp, String loaisp, float giasp, String anhsp, int sumquanlity, String idseller,int hire) {
        this.masp = masp;
        this.tensp = tensp;
        this.loaisp = loaisp;
        this.giasp = giasp;
        this.anhsp = anhsp;
        this.sumquanlity = sumquanlity;
        this.idseller = idseller;
        this.hire=hire;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public float getGiasp() {
        return giasp;
    }

    public void setGiasp(float giasp) {
        this.giasp = giasp;
    }

    public String getAnhsp() {
        return anhsp;
    }

    public void setAnhsp(String anhsp) {
        this.anhsp = anhsp;
    }

    public int getSumquanlity() {
        return sumquanlity;
    }

    public void setSumquanlity(int sumquanlity) {
        this.sumquanlity = sumquanlity;
    }

    public String getIdseller() {
        return idseller;
    }

    public void setIdseller(String idseller) {
        this.idseller = idseller;
    }

    public int getHire() {
        return hire;
    }

    public void setHire(int hire) {
        this.hire = hire;
    }
    
    

    
    
    
    
    
}
