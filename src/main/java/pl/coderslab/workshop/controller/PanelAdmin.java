package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.GroupDao;
import pl.coderslab.workshop.model.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "panelAdmin", urlPatterns = "/panelAdmin")
public class PanelAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  String idParameter = request.getParameter("id");
        //  int id = Integer.parseInt(idParameter);
         request.getRequestDispatcher("/panelAdmin.jsp")
                .forward(request, response);
    }
}