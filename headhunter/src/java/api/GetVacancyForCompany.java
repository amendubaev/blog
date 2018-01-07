/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import controllers.CategoryController;
import controllers.VacancyController;
import controllers.CompanyController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonCompany;
import mappers.JsonVacancy;
import model.Category;
import model.Company;
import model.Vacancy;

@WebServlet(name = "GetVacancyForCompany", urlPatterns = {"/GetVacancyForCompany"})
public class GetVacancyForCompany extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ids = request.getParameter("id");
        int id = Integer.parseInt(ids);
        try (PrintWriter out = response.getWriter()) {
            CompanyController companyController = new CompanyController();
            List<Vacancy> vacancy = companyController.selectVacancyForCompany(id);
            String companyJson = JsonVacancy.toJSON(vacancy);
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
