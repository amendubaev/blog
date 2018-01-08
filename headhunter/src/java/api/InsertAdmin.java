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

@WebServlet(name = "InsertAdmin", urlPatterns = {"/InsertAdmin"})

public class InsertAdmin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String jsonObject = request.getParameter("json");

        try (PrintWriter out = response.getWriter()) {
            Admin admin = JsonAdmin.fromJSON(jsonObject);
            AdminController adminController = new AdminController();
            int res = adminController.insertAdmin(admin);
            out.print(res);
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
