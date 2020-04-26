package pl.coderslab.controller;



import pl.coderslab.workshop.dao.UserDao;
import pl.coderslab.workshop.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "userList", urlPatterns = "/userList")
public class UserListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        List<User> allUsers = userDao.findAll();
        req.setAttribute("users", allUsers);
        req.getRequestDispatcher("/userList.jsp").forward(req, resp);
    }
}