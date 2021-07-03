import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
/**
 * Servlet for testing get request parameters.
 * is followed by URL "localhost:8080/javaEEdemo_war_exploded/"
 */
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //GET Request Parameters
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<h1> Hello, " + name + " " + surname + "! </h1>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
