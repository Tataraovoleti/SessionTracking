/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TATARAO
 */
public class ResultSrv extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name1=(String)request.getAttribute("uname");
        HttpSession ses=request.getSession();
        String name2=(String)ses.getAttribute("uname");
        
        ServletContext sc=getServletContext();
       String name3=(String) sc.getAttribute("uname");
       
       out.println(name1+"  "+name2+" "+name3);
    }
}
