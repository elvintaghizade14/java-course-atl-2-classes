package az.atlacademy.module03.lesson02;

import java.util.Optional;

public class StudentService {

    private final StudentDao<Student> studentDao;

    public StudentService(StudentDao<Student> studentDao) {
        this.studentDao = studentDao;
    }

    public Student findStudentByPin(String pin) throws StudentNotFoundException {
        return studentDao.findStudentByPin(pin)
                .orElseThrow(() -> new StudentNotFoundException("Student with pin - " + pin + " not found!"));
    }

    public void createStudent(Student student) {
        final String pin = student.getPin();
        Optional<Student> studentByPin = studentDao.findStudentByPin(pin);
        if (studentByPin.isPresent()) {
            throw new IllegalArgumentException("Student with pin - " + pin + " already exists!");
        }
        studentDao.createStudent(student);
    }

}
