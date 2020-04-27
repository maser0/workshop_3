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

@WebServlet(name = "edit-user", urlPatterns = "/editUser")
public class EditUserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        UserDao userDao = new UserDao();
        User user = userDao.read(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("/edit-user.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usernameParam = request.getParameter("username");
        String emailParam = request.getParameter("email");
        String passParam = request.getParameter("password");
        String groupIdParam = request.getParameter("groupId");
        int groupId = Integer.parseInt(groupIdParam);
        UserDao userDao = new UserDao();
        userDao.update(new User(usernameParam, emailParam, passParam, groupId));
    }
}
