/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rahul Bhenjalia
 */
@WebServlet(urlPatterns = {"/abc"})
public class abc extends HttpServlet {

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
            out.println("<title>Servlet abc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet abc at " + request.getContextPath() + "</h1>");
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
            
    throws ServletException, IOException
    {
      PrintWriter out = response.getWriter();
     
        
        int i,a,choice;
        String r,h,c;
        
      Connection con;

        choice=Integer.parseInt(request.getParameter("ch"));
        i=Integer.parseInt(request.getParameter("id"));
        a=Integer.parseInt(request.getParameter("age"));
        h=request.getParameter("hname");
        r=request.getParameter("rname");
        c=request.getParameter("city");
        
         try 
          {
              Class.forName("org.apache.derby.jdbc.ClientDriver");
          }
          catch (ClassNotFoundException ex)
          {
              System.out.println("DRIVER NOT LOADED");
          }
         
        try 
          { 
            
                String query = "Select * from Avengers where id  = "+i+"";
                
             String str = "jdbc:derby://localhost:1527/StarkIndustries";
             String uname = "AnthonyStark";
             String passwd = "1776";
          
              con = DriverManager.getConnection(str, uname, passwd);
              Statement st = con.createStatement();
              
             ResultSet rs = st.executeQuery(query);

             rs.next();

             out.println(rs.getInt("Id")+" :: "+rs.getString("RealName")+" :: "+rs.getString("HeroName")+" :: "+rs.getInt("Age")+" years old , FROM : "+rs.getString("City"));
          
      
             
                        
              
              st.close();
              con.close();
            
            
             
          }
          catch (SQLException ex) 
          {
              out.println(ex.getMessage());
          }
        
        
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
