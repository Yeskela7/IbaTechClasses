package lesson17_nov20;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.Servlet;


public class WebApp {
    public static void main(String[] args) throws Exception {

        Server server = new Server(8085);

        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new HelloServlet()),"/hello/*");
        handler.addServlet(new ServletHolder(new ByeServlet()),"/bye/*");
        handler.addServlet(FileServlet.class,"/file/*");
        handler.addServlet(new ServletHolder(new ByeServlet()),"/*");


        server.setHandler(handler);
        server.start();
        server.join();

    }

}
