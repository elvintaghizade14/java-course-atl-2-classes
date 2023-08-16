package az.atlacademy.module03.lesson01;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MaleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        try (PrintWriter pw = resp.getWriter()) {
//            System.out.println("GET method called ->" + LocalDateTime.now());
//            pw.write("Hello, Java EE!");
//            pw.write("Oglan evi, min mebleg $100");
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        try (OutputStream os = resp.getOutputStream()) {
            os.write("Hello, World! - Oglan evi :D".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
