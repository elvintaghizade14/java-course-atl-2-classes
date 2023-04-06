package az.atlacademy.module01.lesson08;

public class Student {

    private int age;
    private double grade;

    public Student(int age, double grade) {
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student{age=%d, grade=%s}", age, grade);
    }
}
