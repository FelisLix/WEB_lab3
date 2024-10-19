package web.web_lab3;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import web.web_lab3.logic.Function;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double a = Double.parseDouble(request.getParameter("a"));
        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        Function function = new Function(a, start, end, step);
        try {
            function.calculate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("function", function);
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }

    public void destroy() {
    }
}