package az.atlacademy.module03.lesson01;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServerApp {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new MaleServlet()), "/male");

        server.setHandler(handler);
        server.start();
        server.join();
    }

}
