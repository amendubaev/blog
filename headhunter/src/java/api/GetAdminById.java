package api;

import controllers.AdminController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonAdmin;
import model.Admin;

@WebServlet(name = "GetAdminById", urlPatterns = {"/GetAdminById"})
public class GetAdminById extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ids = request.getParameter("id");
        int id = Integer.parseInt(ids);
        try (PrintWriter out = response.getWriter()) {
            AdminController adminController = new AdminController();
            Admin admin=   adminController.getAdminById(id);
            String adminJson = JsonAdmin.toJSON(admin);
            out.println(adminJson);
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
