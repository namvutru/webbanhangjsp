/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.script.ScriptEngine;
import model.User;

/**
 *
 * @author luuti
 */
public class UserDAO extends DBContext{
    public User checkuser(String username,String password){
        String sql = "select * from taikhoan";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                String u = rs.getString("username");
                String p = rs.getString("password");
                String id =rs.getString("id");
                float amout=rs.getFloat("amout");
                String name = rs.getString("name");
                int type = rs.getInt("loai");
                if(username.equals(u)&&password.equals(p)) return new User(id,name,amout,u,p,type);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return null;
    }
    public User getUserbyId(String id){
          String sql = "select * from taikhoan where id=?";;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                String u = rs.getString("username");
                String p = rs.getString("password");
                String i =rs.getString("id");
                float amout=rs.getFloat("amout");
                String name = rs.getString("name");
                int type = rs.getInt("loai");
                if(i.equals(id))
                    return new User(i,name,amout,u,p,type);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return null;
    }
    public int tinhtk(){
        int dem=0;
        String sql = "select * from taikhoan";
        try {
            PreparedStatement st =connection.prepareStatement(sql);
            ResultSet rs =st.executeQuery();
            while(rs.next()){
                dem+=1;
            }
        } catch (Exception e) {
        }
        return dem;
    }
    public void signup(String name,String username ,String password,int loai){
        String sql1= "insert into taikhoan values (?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql1);
            int sotk=tinhtk()+1;
            String id = "tk"+sotk;
            st.setString(1, id);
            st.setString(2, name);
            st.setFloat(3, 0);
            st.setString(4, username);
            st.setString(5, password);
            st.setInt(6, loai);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }         
    }
    public void updateAmoutByID(String id,float totalmoney){
        User n = getUserbyId(id);
          String sql1= "UPDATE taikhoan SET amout=? WHERE id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql1);
           
            st.setFloat(1, n.getAmout()-totalmoney);
            st.setString(2, n.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }   
    }
    
        
}
