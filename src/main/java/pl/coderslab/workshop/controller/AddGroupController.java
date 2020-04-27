package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.GroupDao;
import pl.coderslab.workshop.model.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addGroup", urlPatterns = "/addGroup")
public class AddGroupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/addGroup.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groupNameParam = req.getParameter("name");
        GroupDao groupDao = new GroupDao();
        groupDao.createGroup(new Group(groupNameParam));
    }
}