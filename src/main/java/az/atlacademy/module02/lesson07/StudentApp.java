package az.atlacademy.module02.lesson07;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String pin = sc.next();

        final StudentDao<Student> studentDao = new StudentPostgresDao();
        final StudentService studentService = new StudentService(studentDao);
        final StudentController studentController = new StudentController(studentService);

        Student studentByPin = studentController.findStudentByPin(pin);
        System.out.println(studentByPin);

        studentController.createStudent(null);
        studentController.createStudent(new Student("Abbas", "AA00001"));
    }

}
