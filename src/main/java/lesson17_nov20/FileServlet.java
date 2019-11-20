package lesson17_nov20;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.datatransfer.FlavorListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        File text = new File("C:\\Users\\User\\IdeaProjects\\Yeskela7\\IbaTechClasses\\src\\main\\java\\lesson17_nov20\\TestFile.html");

        String name = "Alex";
        String day = "Wednesday";

        BufferedReader fr = new BufferedReader(new FileReader(text));

        PrintWriter writer = resp.getWriter();

//        String line;
//        while ((line = fr.readLine()) != null) {
//            line = line.replace("%name", name);
//            line = line.replace("%day", day);
//            writer.printf(line,name);
//        }

        writer.println(fr.lines().collect(Collectors.joining())
                .replace("%name", name).replace("%day", day));

    }
}
