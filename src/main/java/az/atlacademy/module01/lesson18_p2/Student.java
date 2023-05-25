package az.atlacademy.module01.lesson18_p2;

import java.util.Objects;

public final class Student {

    private final int age;
    private final double grade;
    private final String name;

    public Student(int age, double grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Double.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, grade, name);
    }

    @Override
    public String toString() {
        return String.format("%d-%s-%s", age, grade, name);
    }

}