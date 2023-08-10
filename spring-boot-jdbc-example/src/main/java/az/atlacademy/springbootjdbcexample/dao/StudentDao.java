package az.atlacademy.springbootjdbcexample.dao;

import java.util.Optional;

public interface StudentDao<E> {

    Optional<E> findStudentByPin(String pin);

    void createStudent(E e);

}
