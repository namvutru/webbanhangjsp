/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author luuti
 */
public class ProductDAO extends DBContext{

    
    public List<Product> getAll(){
        List<Product> list = new ArrayList<>();
        
        String sql = "select * from sanpham";
       try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                String id= rs.getString("masp");
                String tensp=rs.getString("tensp");
                String loaisp = rs.getString("loaisp");
                float giasp = rs.getFloat("giasp");
                String anhsp = rs.getString("anhsp");
                int sumquanlity=rs.getInt("sumquanlity");
                String sellerid = rs.getString("idnguoiban");
                int hire = rs.getInt("an");
                list.add(new Product(id,tensp,loaisp,giasp,anhsp,sumquanlity,sellerid,hire));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        
        return list;
    }
    public Product getProductbyID(String id){
        String sql = "select * from sanpham where masp=?";
        Product product = new Product();
        try {
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, id);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {                
            product.setMasp(rs.getString("masp"));
            product.setTensp(rs.getString("tensp"));
            product.setGiasp(rs.getFloat("giasp"));
            product.setLoaisp(rs.getString("loaisp"));
            product.setIdseller(rs.getString("idnguoiban"));
            product.setSumquanlity(rs.getInt("sumquanlity"));
            product.setAnhsp(rs.getString("anhsp"));
            product.setHire(rs.getInt("an"));
            break;
            }
        //masp, tensp, loaisp, giasp, anhsp, sumquanlity, idnguoiban, an
        
        } catch (Exception e) {
        }
       
       return product;
        
    }
    public List <Product> searchProductsforname(String name){
        List<Product> list = new ArrayList<>();
        
        String sql = "SELECT * FROM sanpham WHERE tensp LIKE ?";
       try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,"%"+name+"%");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                String id= rs.getString("masp");
                String tensp=rs.getString("tensp");
                String loaisp = rs.getString("loaisp");
                float giasp = rs.getFloat("giasp");
                String anhsp = rs.getString("anhsp");
                int sumquanlity=rs.getInt("sumquanlity");
                String idseller =rs.getString("idnguoiban");
                 int hire = rs.getInt("an");
                list.add(new Product(id,tensp,loaisp,giasp,anhsp,sumquanlity,idseller,hire));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        
        return list;
    }
    public List<Product> getProductBySellerId(String sellerid){
        
          List<Product> list = new ArrayList<>();
        
        String sql = "SELECT * FROM sanpham WHERE idnguoiban=?";
       try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,sellerid);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                String id= rs.getString("masp");
                String tensp=rs.getString("tensp");
                String loaisp = rs.getString("loaisp");
                float giasp = rs.getFloat("giasp");
                String anhsp = rs.getString("anhsp");
                int sumquanlity=rs.getInt("sumquanlity");
                String idseller =rs.getString("idnguoiban");
                 int hire = rs.getInt("an");
                list.add(new Product(id,tensp,loaisp,giasp,anhsp,sumquanlity,idseller,hire));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        
        return list;
    }
    public int tinhsoloaisp(){
         String sql = "SELECT * FROM sanpham";
         int dem=0;
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
              dem+=1;
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return dem;
    } 
    public String idProductLate(){
        String sql = "SELECT * FROM sanpham";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            rs.last();
            // masp = sp+ int;
            String idproductlate =rs.getString("masp").substring(2); 
            return idproductlate;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public void addProduct(Product a){
        //String masp, String tensp, String loaisp, float giasp, String anhsp, int sumquanlity, String idseller, int hire
        String sql = "insert into sanpham values (?,?,?,?,?,?,?,?)";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            
            st.setString(1, a.getMasp());
            st.setString(2, a.getTensp());
            st.setString(3, a.getLoaisp());
            st.setFloat(4, a.getGiasp());
            st.setString(5, a.getAnhsp());
            st.setInt(6, a.getSumquanlity());
            st.setString(7, a.getIdseller());
            st.setInt(8, a.getHire());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }         
    }
    
    public void deleteAllProductbySellerID(String idseller){
         String sql = "DELETE  FROM sanpham where idnguoiban=?";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,idseller);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } 
    }
     public void deleteProductbyID(String id){
         String sql = "DELETE  FROM sanpham where masp=?";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } 
     }
     public void sethireProductbyId(String id){
         String sql = " UPDATE sanpham SET an=1 WHERE masp=?";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }    
     }
     public void setdonthireProductbyId(String id){
         String sql = " UPDATE sanpham SET an=0 WHERE masp=?";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } 
         
     }
     
     public void updateQuantityProduct(Item item){
         String sql = "update sanpham set sumquanlity=? where masp=? ";
         try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1,item.getProduct().getSumquanlity()-item.getQuanlity());
            st.setString(2,item.getProduct().getMasp());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } 
     }
     //masp, tensp, loaisp, giasp, anhsp, sumquanlity, idnguoiban, an
     public void updateProduct(String masp,String tensp ,String loaisp, float giasp,String anhsp, int soluong){
          String sql = "update sanpham set tensp=?,loaisp=?,giasp=?,anhsp=?,sumquanlity=? where masp=? ";
          try {
            PreparedStatement st = connection.prepareStatement(sql);  
            st.setString(1,tensp);
            st.setString(2, loaisp);
            st.setFloat(3,giasp);
            st.setString(4, anhsp);
            st.setInt(5, soluong);
            st.setString(6,masp);
            st.executeUpdate();
         } catch (Exception e) {
         }

        
          
     }
     public String getdetailbyId(String id){
         String sql= "select * from ttsp where masp=?";
         String detail ="";
         try {
             PreparedStatement st =connection.prepareStatement(sql);
             st.setString(1, id);
             ResultSet rs = st.executeQuery();
             while (rs.next()) {  
                 detail+= rs.getString("mieutasp");
                 
             }
         } catch (Exception e) {
         }
         return detail;
     }
        public void writeDescription(String id,String detail ){
            String sql = "insert into ttsp values (?,?)";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, id);
                st.setString(2, detail);
                st.executeUpdate();
            } catch (Exception e) {
            }
        } 
                
        public void removeDescription(String id) {
            if(id.equals("all")){
                String sql = "delete from ttsp";
                try {
                PreparedStatement st = connection.prepareStatement(sql);
                
                st.executeUpdate();
            } catch (Exception e) {
            }
        } else{
            
        String sql = "delete from ttsp where masp=?";
        try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, id);
                st.executeUpdate();
            } catch (Exception e) {
            }
        } 
        }
        public int getQuantityproductSellbyid(String id){
            String sql = "select * from ctmuahang where masp=?";
            int dem =0;
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, id);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {                    
                    if(rs.getString("masp").equals(id)) dem+=1;
                }
            } catch (Exception e) {
            }
            return dem;
        }
        
        public List<String> getIDproductsell(){
            List<String> list = new ArrayList<>();
            String sql = "select * from ctmuahang";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    int kt = 0;
                    if(list.size()>0){
                    for (String o : list) {
                       if(o.equals(rs.getString("masp"))){
                           kt++;
                           break;
                       }
                    }
                    }
                    if(kt==0)list.add(rs.getString("masp"));
                }
            } catch (Exception e) {
            }
            return list;
        }
        
         
          
        public Product getProductTopsell(){
            ProductDAO pdao = new ProductDAO();
            List<String> listid =pdao.getIDproductsell();
            String maxid ="";
            int maxsl = 0;
            List<Product> list3 = new ArrayList<>();
            for (String id : listid) {
                int sl= pdao.getQuantityproductSellbyid(id);
                if(sl>maxsl){
                    maxsl=sl;
                    maxid=id;
                }
            }
            
            return pdao.getProductbyID(maxid);
        }
        public Product getproductmostnew(){
            String sql  ="select * from sanpham";
            Product product = new Product();
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs =st.executeQuery();
                while (rs.next()) { 
                    
                product.setMasp(rs.getString("masp"));
                product.setTensp(rs.getString("tensp"));
                product.setGiasp(rs.getFloat("giasp"));
                product.setLoaisp(rs.getString("loaisp"));
                product.setIdseller(rs.getString("idnguoiban"));
                product.setSumquanlity(rs.getInt("sumquanlity"));
                product.setAnhsp(rs.getString("anhsp"));
                product.setHire(rs.getInt("an"));     
                }
            } catch (Exception e) {
            }
              return product;

        }
        
    }
        
        
        
        
    

