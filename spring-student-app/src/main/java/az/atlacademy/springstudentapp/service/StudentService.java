package az.atlacademy.springstudentapp.service;

import az.atlacademy.springstudentapp.exception.StudentNotFoundException;
import az.atlacademy.springstudentapp.model.Student;
import az.atlacademy.springstudentapp.repository.StudentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findStudentByPin(String pin) throws StudentNotFoundException {
        return studentRepository.findStudentByPin(pin)
                .orElseThrow(() -> new StudentNotFoundException("Student with pin - " + pin + " not found!"));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

}
