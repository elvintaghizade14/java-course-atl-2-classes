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

    private static final String getAllStudentsSql = "SELECT * FROM students;";
    private static final String createStudentSql = "INSERT INTO students(name, pin) values (?, ?);";
    private static final String deleteStudentSql = "DELETE FROM students where pin = ?";

    public static void main(String[] args) {
        getAllStudents().forEach(System.out::println);
        deleteByPin("Ilqar42");
        createStudent(new Student("Ilqar", "Ilqar42"));
        getAllStudents().forEach(System.out::println);
    }

    private static void deleteByPin(String pin) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(deleteStudentSql);
            query.setString(1, pin);
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStudent(Student student) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(createStudentSql);
            query.setString(1, student.getName());
            query.setString(2, student.getPin());
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
