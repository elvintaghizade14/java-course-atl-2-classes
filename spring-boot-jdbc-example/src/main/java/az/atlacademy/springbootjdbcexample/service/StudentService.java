package az.atlacademy.springbootjdbcexample.service;

import az.atlacademy.springbootjdbcexample.dao.StudentJdbcTemplateDao;
import az.atlacademy.springbootjdbcexample.exception.StudentNotFoundException;
import az.atlacademy.springbootjdbcexample.model.Student;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentJdbcTemplateDao studentDao;

    public Student findStudentByPin(String pin) throws StudentNotFoundException {
        return studentDao.findStudentByPin(pin)
                .orElseThrow(() -> new StudentNotFoundException("Student with pin - " + pin + " not found!"));
    }

    public void createStudent(Student student) {
        final String pin = student.getPin();
        final Optional<Student> studentByPin = studentDao.findStudentByPin(pin);
        if (studentByPin.isPresent()) {
            throw new IllegalArgumentException("Student with pin - " + pin + " already exists!");
        }
        studentDao.createStudent(student);
    }

}
