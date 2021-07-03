import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ForwardServlet", value = "/ForwardServlet")
/**
 * Servlet for testing forward.
 * is followed by URL "localhost:8080/javaEEdemo_war_exploded/forward-test"
 */
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    Forward initialisation
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/getRequestParametersJSP.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
