/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import controllers.BusyModeController;
import controllers.BusyModeController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonBusyMode;
import mappers.JsonBusyMode;
import model.BusyMode;
import model.BusyMode;

@WebServlet(name = "GetBusyModeById", urlPatterns = {"/GetBusyModeById"})
public class GetBusyModeById extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ids = request.getParameter("id");
        int id = 1;
        try (PrintWriter out = response.getWriter()) {
            BusyModeController busybodeController = new BusyModeController();
            BusyMode busybode=   busybodeController.getBusyModeById(id);
            String busybodeJson = JsonBusyMode.toJSON(busybode);
            out.println(busybodeJson);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
