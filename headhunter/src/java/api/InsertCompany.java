package api;

import controllers.CompanyController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonCompany;
import model.Company;

@WebServlet(name = "InsertCompany", urlPatterns = {"/InsertCompany"})

public class InsertCompany extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String jsonObject = request.getParameter("json");
        
        try (PrintWriter out = response.getWriter()) 
        {
           Company company = JsonCompany.fromJSON(jsonObject);
           CompanyController  companyController = new CompanyController();
           int res=companyController.insertCompany(company);
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

