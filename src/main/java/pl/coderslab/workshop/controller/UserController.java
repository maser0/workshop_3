package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.SolutionDao;
import pl.coderslab.workshop.dao.UserDao;
import pl.coderslab.workshop.model.Solution;
import pl.coderslab.workshop.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "user", urlPatterns = "/user")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        UserDao userDao = new UserDao();
        List<User> users = userDao.findAllByGroupId(id);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/usersInGroup.jsp")
                .forward(request, response);
    }
}
