package az.atl.productmanagementapp.model.dto;

import java.time.LocalDateTime;
import lombok.Value;

@Value
public class ErrorDto {

    int errorCode;
    String errorMessage;
    LocalDateTime dateTime;

}
