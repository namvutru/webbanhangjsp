/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Cart;
import model.Item;
import model.OderDetail;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author luuti
 */
public class OrderDAO extends DBContext{
    public int solanmuahang(){
        String sql = "select * from lsmuahang";
        int dem=0;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                dem+=1;
            }
        } catch (Exception e) {
        }
        return dem;
    }
    public void addnewOrder(User n , Cart cart){
        String sql = "insert into lsmuahang values (?,?,?,?)";
        String sql1 = "insert into ctmuahang values (?,?,?,?)";
        
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            String malandat = "ld"+solanmuahang();
            Date date = new Date();
            DateFormat datime = new SimpleDateFormat("hh:mm:ss dd:MM:yyyy");
            String dateString =datime.format(date);
            String manguoidat = n.getId();
            float tongtien= cart.getTotalmoney();
            st.setString(1,malandat);
            st.setString(2,manguoidat);
            st.setFloat(3, tongtien);
            st.setString(4, dateString);
            st.executeUpdate();
            
            PreparedStatement st1 = connection.prepareStatement(sql1);
            //malandat varchar(50),masp varchar(50),soluongdat int, gia float
            for (Item o : cart.getItems()) {
                st1.setString(1,malandat);
                st1.setString(2,o.getProduct().getMasp());
                st1.setInt(3,o.getQuanlity());
                st1.setFloat(4,o.getSellprice());
                st1.executeUpdate();   
            }
        } catch (Exception e) {
        }
        
    }
    public List<Order> getOrderByIdBuyer(String idBuyer){
        List<Order> list = new ArrayList<>();
        String sql = "select * from lsmuahang where manguoidat=?";
        
        
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,idBuyer);
            ResultSet  rs = st.executeQuery();
            while (rs.next()) {                
                Order n = new Order();
                //String id, String date, String iduser, float toltalmoney
                n.setId(rs.getString("malandat"));
                n.setIduser(rs.getString("manguoidat"));
                n.setToltalmoney(rs.getFloat("tongtien"));
  
                n.setDate(rs.getString("ngaydat"));
                list.add(n);
            }
                    
        } catch (Exception e) {
        }
        return list;
    }
    public List<OderDetail> getOrderDetailByID(String id){
        List<OderDetail> list = new ArrayList<>();
        String sql = "select * from ctmuahang where malandat=?";
        
        
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,id);
            ResultSet  rs = st.executeQuery();
            while (rs.next()) {                
                OderDetail n = new OderDetail();
                ProductDAO pdao = new ProductDAO();
                //String id, String date, String iduser, float toltalmoney
                n.setOrid(rs.getString("malandat"));
                Product z =pdao.getProductbyID(rs.getString("masp"));
                n.setPr(z);
                n.setSellprice(rs.getFloat("gia"));
                n.setQuanlity(rs.getInt("soluongdat"));
                list.add(n);
            }
                    
        } catch (Exception e) {
        }
        return list;
    }
   
   
    
}
