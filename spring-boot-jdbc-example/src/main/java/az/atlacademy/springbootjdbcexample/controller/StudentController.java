package az.atlacademy.springbootjdbcexample.controller;

import az.atlacademy.springbootjdbcexample.model.Student;
import az.atlacademy.springbootjdbcexample.service.StudentService;
import javax.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{pin}")
    public Student findStudentByPin(@NotBlank @PathVariable String pin) {
        return studentService.findStudentByPin(pin);
    }

    public void createStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Invalid student data!");
        }
        studentService.createStudent(student);
    }

}
