package az.atlacademy.springstudentapp.repository;

import az.atlacademy.springstudentapp.model.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByPin(String pin);

}
