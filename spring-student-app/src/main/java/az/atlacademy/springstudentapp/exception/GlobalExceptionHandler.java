package az.atlacademy.springstudentapp.exception;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import java.time.LocalDateTime;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorDto> handleStudentNotFoundException(StudentNotFoundException ex) {
        return ResponseEntity.status(NOT_FOUND).body(new ErrorDto(4041, ex.getMessage(), LocalDateTime.now()));
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<ErrorDto> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex) {
        return ResponseEntity.status(NOT_FOUND).body(new ErrorDto(4041, ex.getMessage(), LocalDateTime.now()));
    }

}
