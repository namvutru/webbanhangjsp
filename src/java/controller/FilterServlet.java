/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Item;
import model.Product;

/**
 *
 * @author luuti
 */
public class FilterServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FilterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
         String Claass= request.getParameter("typefilter");
        String pricefilter = request.getParameter("pricefilter");
        ProductDAO pdao = new ProductDAO();
        List <Product> list = pdao.getAll();
        List<Product> z = new ArrayList<>();
        
        for (Product o : list) {
            if(Claass.equals("")){
                if(pricefilter.equals("1")&&o.getGiasp()>0&&o.getGiasp()<=50) z.add(o);
                if(pricefilter.equals("2")&&o.getGiasp()>50&&o.getGiasp()<=200) z.add(o);
                if(pricefilter.equals("3")&&o.getGiasp()>200&&o.getGiasp()<=1000) z.add(o);
                if(pricefilter.equals("4")&&o.getGiasp()>1000) z.add( o);
                if(pricefilter.equals("")) z.add(o);
            }else{
                if(o.getLoaisp().equals(Claass)){
                if(pricefilter.equals("1")&&o.getGiasp()>0&&o.getGiasp()<=50) z.add(o);
                if(pricefilter.equals("2")&&o.getGiasp()>50&&o.getGiasp()<=200) z.add(o);
                if(pricefilter.equals("3")&&o.getGiasp()>200&&o.getGiasp()<=1000) z.add(o);
                if(pricefilter.equals("4")&&o.getGiasp()>1000) z.add( o);
                if(pricefilter.equals("")) z.add(o);
                }
            }
            
        }
         
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
        
        int n=listItem.size();
            request.setAttribute("size", n);
            request.setAttribute("data", z);
            request.getRequestDispatcher("home.jsp").forward(request, response);
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
