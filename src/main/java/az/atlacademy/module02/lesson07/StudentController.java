package az.atlacademy.module02.lesson07;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student findStudentByPin(String pin) {
        if (pin == null || pin.isEmpty()) {
            throw new IllegalArgumentException("Invalid pin: " + pin);
        }
        return studentService.findStudentByPin(pin);
    }

    public void createStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Invalid student data!");
        }
        studentService.createStudent(student);
    }

}
