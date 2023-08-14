package az.atlacademy.springbootjdbcexample.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDto {

    private int errorCode;
    private String errorMessage;
    private LocalDateTime errorDateTime;

}
