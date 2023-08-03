/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Item;
import model.Product;
import model.User;

/**
 *
 * @author luuti
 */
public class HomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          ProductDAO pdao = new ProductDAO();
          UserDAO udao = new UserDAO();
       List <Product> list = pdao.getAll();
       String txt = "";
       Cookie[] arr= request.getCookies();
        if(arr!=null){
            for (Cookie o : arr) {
                if(o.getName().equals("cartck")){
                    txt+=o.getValue();
                    break;
                }
            }
        }
        Cart cart = new Cart(txt, list);
        List<Item> listItem =cart.getItems();
        Product z=pdao.getProductTopsell();
        Product m =pdao.getproductmostnew();
        int n=listItem.size();
        
            
            request.setAttribute("size", n);
            request.setAttribute("data", list);
            request.setAttribute("betselling",z);
            request.setAttribute("detailz", pdao.getdetailbyId(z.getMasp()));
            request.setAttribute("newest", m);
            request.setAttribute("detailm", pdao.getdetailbyId(m.getMasp()));
            request.getRequestDispatcher("home.jsp").forward(request, response);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
