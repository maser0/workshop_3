package pl.coderslab.workshop.dao;


import pl.coderslab.workshop.model.Exercise;
import pl.coderslab.workshop.db.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseDao {

    private static final String CREATE_EXERCISE_QUERY =
            "INSERT INTO exercises(title, description) VALUES (?, ?)";
    private static final String READ_EXERCISE_QUERY =
            "SELECT * FROM exercises where id = ?";
    private static final String UPDATE_EXERCISE_QUERY =
            "UPDATE exercises SET title = ?, description = ? where id = ?";
    private static final String DELETE_EXERCISE_QUERY =
            "DELETE FROM exercises WHERE id = ?";
    private static final String FIND_ALL_EXERCISE_QUERY =
            "SELECT * FROM exercises";

    public Exercise createExercise(Exercise exercises) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_EXERCISE_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, exercises.getTitle());
            statement.setString(2, exercises.getDescription());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                exercises.setId(resultSet.getInt(1));
            }
            return exercises;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Exercise read(int exerciseId) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(READ_EXERCISE_QUERY);
            statement.setInt(1, exerciseId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Exercise exercise = new Exercise();
                exercise.setId(resultSet.getInt("id"));
                exercise.setTitle(resultSet.getString("title"));
                exercise.setDescription(resultSet.getString("description"));
                return exercise;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }

    public void update(Exercise exercises) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(UPDATE_EXERCISE_QUERY);
            statement.setString(1, exercises.getTitle());
            statement.setString(2, exercises.getDescription());
            statement.setInt(3, exercises.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int exercisesId) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(DELETE_EXERCISE_QUERY);
            statement.setInt(1, exercisesId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Exercise> findAll() {
        try (Connection conn = DbUtil.getConnection()) {
            List<Exercise> exercises = new ArrayList<>();
            PreparedStatement statement = conn.prepareStatement(FIND_ALL_EXERCISE_QUERY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Exercise exercise = new Exercise();
                exercise.setId(resultSet.getInt("id"));
                exercise.setTitle(resultSet.getString("title"));
                exercise.setDescription(resultSet.getString("desciption"));

                exercises.add(exercise);
            }
            return exercises;
        } catch (SQLException e) {
            e.printStackTrace(); return null;
        }}

    private Exercise[] addToArray(Exercise u, Exercise[] exercise) {
        Exercise[] tmpExercise = Arrays.copyOf(exercise, exercise.length + 1);
        tmpExercise[exercise.length] = u;
        return tmpExercise;
    }


}
