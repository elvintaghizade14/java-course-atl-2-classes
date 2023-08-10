package az.atlacademy.springbootjdbcexample.dao;

import az.atlacademy.springbootjdbcexample.model.Student;
import java.util.Optional;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcTemplateDao implements StudentDao<Student> {

    private static final String findStudentByPin = "SELECT * FROM students WHERE pin = ?;";
    private static final String createStudentSql = "INSERT INTO students(name, pin) values (?, ?);";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentJdbcTemplateDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Optional<Student> findStudentByPin(String pin) {
        return Optional.of(jdbcTemplate.queryForObject(findStudentByPin, new Object[] {pin},
                BeanPropertyRowMapper.newInstance(Student.class)));
    }

    @Override
    public void createStudent(Student student) {
        jdbcTemplate.update(createStudentSql, student.getName(), student.getPin());
    }

}
