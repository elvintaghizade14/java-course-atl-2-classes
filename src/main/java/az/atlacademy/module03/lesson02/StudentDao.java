package az.atlacademy.module03.lesson02;

import java.util.Optional;

public interface StudentDao<E> {

    Optional<E> findStudentByPin(String pin);

    void createStudent(E e);

}
