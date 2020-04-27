package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.UserDao;
import pl.coderslab.workshop.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addUser", urlPatterns = "/addUser")
public class AddUserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/addUser.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usernameParam = req.getParameter("username");
        String emailParam = req.getParameter("email");
        String passParam = req.getParameter("password");
        String groupIdParam = req.getParameter("groupId");
        int id = Integer.parseInt(groupIdParam);
        UserDao userDao = new UserDao();
        userDao.createUser(new User(usernameParam, emailParam,passParam, id));

    }
}