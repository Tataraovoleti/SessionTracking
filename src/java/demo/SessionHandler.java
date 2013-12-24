/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
public class SessionHandler extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("haiiiiiiii");
        String name=request.getParameter("uname");
        request.setAttribute("uname",name);
        HttpSession ses=request.getSession();
        ses.setAttribute("uname", name);
        ServletContext sc=getServletContext();
        sc.setAttribute("uname", name);
        
    /*    RequestDispatcher rd=request.getRequestDispatcher("/srv2");
        rd.forward(request, response);
       */ 
    }

}
