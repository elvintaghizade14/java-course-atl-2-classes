package az.atlacademy.module01.lesson19;

import java.io.Serializable;
import java.time.LocalDate;

public final class Person implements Serializable {

    public static final long serialVersionUID = 2;

    public final long id;
    public final String name;
    public final String surname;
    public transient LocalDate date;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s'}", id, name);
    }

}
