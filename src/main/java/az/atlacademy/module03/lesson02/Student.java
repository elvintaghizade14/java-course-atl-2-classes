package az.atlacademy.module03.lesson02;

import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private String pin;

    public Student() {
    }

    public Student(String name, String pin) {
        this.name = name;
        this.pin = pin;
    }

    public Student(int id, String name, String pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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
        return id == student.id && Objects.equals(name, student.name) &&
                Objects.equals(pin, student.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pin);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

}
