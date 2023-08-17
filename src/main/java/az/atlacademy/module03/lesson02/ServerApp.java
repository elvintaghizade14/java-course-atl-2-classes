package az.atlacademy.module03.lesson02;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {

    public static void main(String[] args) throws Exception {
        final Server server = new Server(8081);

        final ObjectMapper objectMapper = new ObjectMapper();
        final StudentPostgresDao studentRepository = new StudentPostgresDao();
        final StudentService studentService = new StudentService(studentRepository);
        final StudentServlet studentServlet = new StudentServlet(objectMapper, studentService);

        final ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(studentServlet), "/api/v1/students");

        server.setHandler(handler);
        server.start();
        server.join();
    }

}
