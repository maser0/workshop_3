package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.GroupDao;
import pl.coderslab.workshop.dao.SolutionDao;
import pl.coderslab.workshop.model.Group;
import pl.coderslab.workshop.model.Solution;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "group", urlPatterns = "/group")
public class GroupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  String idParameter = request.getParameter("id");
      //  int id = Integer.parseInt(idParameter);
        GroupDao groupDao = new GroupDao();
        List<Group> groups = groupDao.findAll();
        request.setAttribute("group", groups);
        request.getRequestDispatcher("/listGroup.jsp")
                .forward(request, response);
    }
}
