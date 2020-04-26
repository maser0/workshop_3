package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.ExerciseDao;
import pl.coderslab.workshop.model.Exercise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "exercisesList", urlPatterns = "/exercisesList")
public class ExercisesListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExerciseDao exerciseDao = new ExerciseDao();
        List <Exercise> exercises = exerciseDao.findAll();
        request.setAttribute("exercises", exercises);
        request.getRequestDispatcher("/exerciseList.jsp")
                .forward(request, response);
    }
}
