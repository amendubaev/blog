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

@WebServlet(name = "DeleteVacancy", urlPatterns = {"/DeleteVacancy"})

public class DeleteVacancy extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String jsonObject = request.getParameter("json");
        
        try (PrintWriter out = response.getWriter()) 
        {
           Vacancy vacancy = JsonVacancy.fromJSON(jsonObject);
           VacancyController  vacancyController = new VacancyController();
           int res = vacancyController.deleteVacancy(vacancy);
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
