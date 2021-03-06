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

@WebServlet(name = "edit-group", urlPatterns = "/editGroup")
public class EditGroupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        GroupDao groupDao = new GroupDao();
        Group group = groupDao.readGroup(id);
        request.setAttribute("group", group);
        request.getRequestDispatcher("/edit-solution.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        GroupDao groupDao = new GroupDao();
        Group group = groupDao.readGroup(id);

        String nameParameter = request.getParameter("name");
        group.setName(nameParameter);
        groupDao.update(group);
        response.sendRedirect("/group?id=" + idParameter);
    }
}
