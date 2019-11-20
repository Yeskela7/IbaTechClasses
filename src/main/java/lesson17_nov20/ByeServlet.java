package lesson17_nov20;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ByeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getPathInfo();
        name = name.replace("/", "");

        PrintWriter writer = resp.getWriter();


        writer.printf("Bye %s ", name);
    }

}
