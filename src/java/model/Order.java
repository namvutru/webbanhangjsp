/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author luuti
 */
public class Order {
    private String id;
    private String date;
    private String iduser;
    private float toltalmoney;

    public Order() {
    }

    public Order(String id, String date, String iduser, float toltalmoney) {
        this.id = id;
        this.date = date;
        this.iduser=iduser;
        this.toltalmoney = toltalmoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }
    public float getToltalmoney() {
        return toltalmoney;
    }

    public void setToltalmoney(float toltalmoney) {
        this.toltalmoney = toltalmoney;
    }
    
}
