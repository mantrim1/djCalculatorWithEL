/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.AreaCalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mark
 */
@WebServlet(name = "AreaCalculatorController", urlPatterns = {"/AreaCalculatorController"})
public class AreaCalculatorController extends HttpServlet {
    private final String VIEW ="/AreaCalculator.jsp";
    private final String CIRCLE = "circle";
    private final String RECTANGLE = "rectangle";
    private final String TRIANGLE = "triangle";
    private String width;
    private String height;
    private String radius;
    private String type;

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
        type = request.getParameter("shape");
        height = request.getParameter("inputHeight");
        width = request.getParameter("inputWidth");
        radius = request.getParameter("inputRadius");
            
        AreaCalculatorService service = new AreaCalculatorService();
        switch(type){
            case RECTANGLE:
                request.setAttribute("rectangleMessage", service.calculateArea(radius, height, width, type));
                break;
            case TRIANGLE:
                request.setAttribute("triangleMessage", service.calculateArea(radius, height, width, type));
                break;
            case CIRCLE:
                request.setAttribute("circleMessage", service.calculateArea(radius, height, width, type));
                break;
        }
    

        RequestDispatcher view = 
                request.getRequestDispatcher(VIEW);
        view.forward(request, response);
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
