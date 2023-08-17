package az.atlacademy.module03.lesson02;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class StudentPostgresDao implements StudentDao<Student> {

    private static final String findStudentByPin = "SELECT * FROM students WHERE pin = ?;";
    private static final String createStudentSql = "INSERT INTO students(name, pin) values (?, ?);";


    @Override
    public Optional<Student> findStudentByPin(String pin) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(findStudentByPin);
            query.setString(1, pin);
            ResultSet resultSet = query.executeQuery();
            if (resultSet != null) {
                resultSet.next();
            }
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String studentPin = resultSet.getString("pin");
            return Optional.of(new Student(id, name, studentPin));
        } catch (SQLException e) {
            return Optional.empty();
        }
    }

    @Override
    public void createStudent(Student student) {
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

}
