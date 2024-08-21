/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rahul Bhenjalia
 */
@WebServlet(urlPatterns = {"/Ques1"})
public class Ques1 extends HttpServlet {

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
            out.println("<title>Servlet Ques1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ques1 at " + request.getContextPath() + "</h1>");
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
                 
                 String[] vals = request.getParameterValues("Weapon");
                 Enumeration h = request.getParameterNames();
                 String a = request.getParameter("Name");
                 String X = request.getParameter("Sigil");                 

                 out.print("<html><body bgcolor='black'><font color='white'><h1>You are <u>Lord "+a+" </u> OF House <u>"+X+"</u><br>");
                 
                 out.print("<br><br> YOU ARE WIELDING :");
                 out.print("<ul>");
    
                 for(String s: vals )
                 {
                 
                     out.print("<li> "+s+" </li>");
                 }
                 
                 
                 out.print("</ul></h1>");

                 out.print("----------------------------------------------------------------------------------------------------");
                 
                 out.print("<h2> PARAMETERS NAMES :");
                 out.print("<ul>");
    
                 while(h.hasMoreElements())
                 {   
                     Object x=h.nextElement();
                     String fn = (String) x;
                     
                 
                     out.print("<li> "+fn+" </li>");
                 }
                 out.print("</h2></ul>");
                 out.print("</font></body></html>");
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
