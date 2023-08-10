package az.atlacademy.springbootjdbcexample.model;

import java.util.Objects;

public class Student {

    private int id;
    private String pin;
    private String name;

    public Student() {
    }

    public Student(int id, String pin, String name) {
        this.id = id;
        this.pin = pin;
        this.name = name;
    }

    public Student(String pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
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
        return id == student.id && Objects.equals(pin, student.pin) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pin, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", pin='" + pin + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
