package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.dao.ExerciseDao;
import pl.coderslab.workshop.dao.GroupDao;
import pl.coderslab.workshop.model.Exercise;
import pl.coderslab.workshop.model.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "edit-exercisse", urlPatterns = "/editExercise")
public class EditExerciseController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        ExerciseDao exerciseDao = new ExerciseDao();
       Exercise exercise = exerciseDao.read(id);
        request.setAttribute("exercise", exercise);
        request.getRequestDispatcher("/edit-exercise.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParameter = request.getParameter("id");
        int id = Integer.parseInt(idParameter);
        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise = exerciseDao.read(id);

        String titleParameter = request.getParameter("title");
        String descriptionParameter = request.getParameter("description");

        exercise.setTitle(titleParameter);
        exercise.setDescription(descriptionParameter);

    }
}
