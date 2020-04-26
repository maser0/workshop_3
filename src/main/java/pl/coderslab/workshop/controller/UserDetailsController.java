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


@WebServlet(name = "userdetails", urlPatterns = "/userDetails")
public class UserDetailsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        UserDao userDao = new UserDao();
        User user = userDao.read(id);
        SolutionDao solutionDao = new SolutionDao();
        Solution[] solution = solutionDao.findAllSolutionsByUserId(id);
        request.setAttribute("solution", solution);
        request.setAttribute("user", user);
        request.getRequestDispatcher("/user.jsp")
                .forward(request, response);
    }
}