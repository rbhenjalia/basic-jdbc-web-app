/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/StudentDB"})
public class StudentDB extends HttpServlet {

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
            out.println("<title>Servlet StudentDB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentDB at " + request.getContextPath() + "</h1>");
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
   
      PreparedStatement pst;
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
            if(choice==1)  
            {             String query = "Insert into Avengers values(?,?,?,?,?)";
                
             String str = "jdbc:derby://localhost:1527/StarkIndustries";
             String uname = "AnthonyStark";
             String passwd = "1776";
          
              con = DriverManager.getConnection(str, uname, passwd);
              pst = con.prepareStatement(query);
          
      
              pst.setInt(1,i);
              pst.setString(2,r);
              pst.setString(3,h);
              pst.setInt(4,a);
              pst.setString(5,c);
              
                        
              pst.executeUpdate();
              pst.close();
              con.close();
            }
            
            else
            {
                String query = "Select * from Avengers where id  = "+i+"";
                
             String str = "jdbc:derby://localhost:1527/StarkIndustries";
             String uname = "AnthonyStark";
             String passwd = "1776";
          
              con = DriverManager.getConnection(str, uname, passwd);
              pst = con.prepareStatement(query);
          
      
              pst.setInt(1,i);
              pst.setString(2,r);
              pst.setString(3,h);
              pst.setInt(4,a);
              pst.setString(5,c);
              
                        
              pst.executeUpdate();
              pst.close();
              con.close();
            
            }
             
          }
          catch (SQLException ex) 
          {
              out.println(ex.getMessage());
          }
        
        out.println("RECORD INSERTED");
        
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
