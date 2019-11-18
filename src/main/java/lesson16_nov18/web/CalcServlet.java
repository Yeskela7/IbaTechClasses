package lesson16_nov18.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String oper = req.getParameter("operator");




        PrintWriter writer = resp.getWriter();

        writer.printf("result = %s",Calculator.calculator(x,y,oper));


        writer.close();
    }
}
