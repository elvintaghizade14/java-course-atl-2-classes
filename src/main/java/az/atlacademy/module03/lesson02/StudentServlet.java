package az.atlacademy.module03.lesson02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import org.eclipse.jetty.http.HttpStatus;

public class StudentServlet extends HttpServlet {

    private final ObjectMapper objectMapper;
    private final StudentService studentService;

    public StudentServlet(ObjectMapper objectMapper, StudentService studentService) {
        this.objectMapper = objectMapper;
        this.studentService = studentService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String pin = req.getParameter("pin");
        if (pin == null || pin.isEmpty()) {
            resp.setStatus(HttpStatus.BAD_REQUEST_400);
            try (OutputStream os = resp.getOutputStream()) {
                String message = "pin: [" + pin + "] is invalid!";
                os.write(message.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Student student = null;
        try {
            student = studentService.findStudentByPin(pin);
        } catch (StudentNotFoundException se) {
            resp.setStatus(HttpStatus.NOT_FOUND_404);
            try (OutputStream os = resp.getOutputStream()) {
                os.write(se.getMessage().getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            se.printStackTrace();
        }
        try {
            byte[] bytes = objectMapper.writeValueAsBytes(student);
            try (OutputStream os = resp.getOutputStream()) {
                resp.setContentType(MediaType.APPLICATION_JSON);
                os.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JsonProcessingException e) {
            resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR_500);
            e.printStackTrace();
        }
    }

}
