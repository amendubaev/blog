package api;

import controllers.VacancyController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonVacancy;
import model.Vacancy;

@WebServlet(name = "GetVacancyById", urlPatterns = {"/GetVacancyById"})
public class GetVacancyById extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ids = request.getParameter("id");
        int id = Integer.parseInt(ids);
        try (PrintWriter out = response.getWriter()) {
            VacancyController vacancyController = new VacancyController();
            Vacancy vacancy=   vacancyController.getVacancyById(id);
            String vacancyJson = JsonVacancy.toJSON(vacancy);
            out.println(vacancyJson);
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
