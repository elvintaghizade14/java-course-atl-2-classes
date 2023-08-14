package az.atlacademy.springbootjdbcexample.exception;

import static org.springframework.http.HttpStatus.NOT_FOUND;

import az.atlacademy.springbootjdbcexample.model.ErrorDto;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(NOT_FOUND)
    @org.springframework.web.bind.annotation.ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorDto> handleStudentNotFoundException(StudentNotFoundException ex) {
        return ResponseEntity.of(Optional.of(new ErrorDto(4041, ex.getMessage(), LocalDateTime.now())));
    }

    @ResponseStatus(NOT_FOUND)
    @org.springframework.web.bind.annotation.ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<ErrorDto> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex) {
        return ResponseEntity.status(NOT_FOUND).body(new ErrorDto(4041, ex.getMessage(), LocalDateTime.now()));
    }

}
