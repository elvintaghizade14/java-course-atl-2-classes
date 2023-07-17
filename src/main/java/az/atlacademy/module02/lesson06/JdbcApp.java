package az.atlacademy.module02.lesson06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcApp {

    public static final String getAllStudentsSql = "SELECT * FROM students;";

    public static void main(String[] args) {
        getAllStudents().forEach(System.out::println);
    }

    private static List<Student> getAllStudents() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(getAllStudentsSql);
            ResultSet resultSet = query.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String pin = resultSet.getString("pin");
                students.add(new Student(id, name, pin));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
