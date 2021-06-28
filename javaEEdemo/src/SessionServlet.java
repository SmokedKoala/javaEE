import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")

/**
 * Servlet for testing session abilities.
 * is followed by URL "localhost:8080/javaEEdemo_war_exploded/session"
 */
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        //Session
        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
        } else
            session.setAttribute("count", count + 1);

        printWriter.println("<html>");
        printWriter.println("<h1> It's " + session.getAttribute("count") + " time, u are at this page </h1>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
