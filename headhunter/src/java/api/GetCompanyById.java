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

@WebServlet(name = "GetCompanyById", urlPatterns = {"/GetCompanyById"})
public class GetCompanyById extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ids = request.getParameter("id");
        int id = Integer.parseInt(ids);
        try (PrintWriter out = response.getWriter()) {
            CompanyController companyController = new CompanyController();
            Company company=   companyController.getCompanyById(id);
            String companyJson = JsonCompany.toJSON(company);
            out.println(companyJson);
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
