package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.ExerciseDao;
import pl.coderslab.workshop.model.Exercise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addExercise", urlPatterns = "/addExercise")
public class AddExerciseController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/addExercise.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titleParam = req.getParameter("title");
        String descParam = req.getParameter("description");
        ExerciseDao exerciseDao = new ExerciseDao();
        exerciseDao.createExercise(new Exercise(titleParam, descParam));
    }
}
