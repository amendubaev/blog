package api;

import controllers.BusyModeController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mappers.JsonBusyMode;
import model.BusyMode;

@WebServlet(name = "GetAllBusyMode", urlPatterns = {"/GetAllBusyMode"})
public class GetAllBusyMode extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            BusyModeController busymodeController = new BusyModeController();
            List<BusyMode> busymode = busymodeController.getAllBusyMode();
            String listJson = JsonBusyMode.toJSON(busymode);
            out.println(listJson);
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
