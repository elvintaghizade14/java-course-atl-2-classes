package az.atlacademy.module02.lesson07;

import java.util.Optional;

public interface StudentDao<E> {

    Optional<E> findStudentByPin(String pin);

    void createStudent(E e);

}
