/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import dao.tipoConductorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.TipoConductor;

/**
 *
 * @author yeison.ariel
 */
public class tipoCondControlador extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tipoCondControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet tipoCondControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>"); 
            */
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
        //processRequest(request, response);
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
        // processRequest(request, response);
        
        // Recibir los datos del Form
        int IdTc = Integer.parseInt(request.getParameter("txtTc"));
        String NomTc = request.getParameter("txtNomTc");
        
        // Instanciar el modelo
        TipoConductor tipoCond = new TipoConductor();
        tipoCond.setIdTipoConductor(IdTc);
        tipoCond.setNomTipoConductor(NomTc);
        
        tipoConductorDAO.insertartc(tipoCond);
        
        if (tipoConductorDAO.insertartc(tipoCond))
        {
            request.setAttribute("mensaje","Tipo de conductor se registro correctamente");
        }
        else
        {
            request.setAttribute("mensaje","Tipo de conductor no se registro correctamente");
        }
        
        request.getRequestDispatcher("registrarConductor.jsp").forward(request, response);
        
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
