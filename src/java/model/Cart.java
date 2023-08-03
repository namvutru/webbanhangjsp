/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luuti
 */
public class Cart {
    private List<Item> items;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    private Item getItemById(String id){
        for (Item item : items) {
            if(item.getProduct().getMasp().equals(id)){
                return item;
        }
    }
        return null;
    }
    public int getQuantityById(String id){
        return getItemById(id).getQuanlity();
    }
    public void addItem(Item t){
        if( getItemById(t.getProduct().getMasp())!=null){
            Item m =getItemById(t.getProduct().getMasp());
            m.setQuanlity(m.getQuanlity()+t.getQuanlity());
            
        }else{
            items.add(t);
        }
    }
    public void removeItem(String id){
        if(getItemById(id)!=null){
            items.remove(getItemById(id));
        }
    }
    public float getTotalmoney(){
        float total=0;
        for (Item item : items) {
            total+=(item.getSellprice()*item.getQuanlity());
        }
        return total;
    }
    private  Product getProductById(String id , List<Product> list){
        for (Product product : list) {
            if(product.getMasp().equals(id)) return product;
        }
        return null;
    }
    public Cart(String txt,List<Product> list){
        items = new ArrayList<>();
         try {
            if(txt!=null&&txt.length()!=0){
                String[] s=txt.split("/");
            for (String i : s) {
                String[] m =i.split(":");
                String id =m[0];
                int quantity =Integer.parseInt(m[1]);
                Product p =getProductById(id, list);
                Item t = new Item(p, quantity,p.getGiasp());
                addItem(t);
            } 
            }
        
            } catch (Exception e) {
        }
    }
}
