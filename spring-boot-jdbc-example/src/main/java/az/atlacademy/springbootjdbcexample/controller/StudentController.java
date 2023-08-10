package az.atlacademy.springbootjdbcexample.controller;

import az.atlacademy.springbootjdbcexample.model.Student;
import az.atlacademy.springbootjdbcexample.service.StudentService;
import javax.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{pin}")
    public ResponseEntity<Student> findStudentByPin(@NotBlank @PathVariable String pin) {
        return ResponseEntity.ok(studentService.findStudentByPin(pin));
    }

    @PostMapping
    public ResponseEntity<Void> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok().build();
    }

}
