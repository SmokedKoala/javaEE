import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RedirectServlet", value = "/RedirectServlet")
/**
 * Servlet for testing redirect.
 * is followed by URL "localhost:8080/javaEEdemo_war_exploded/redirect-test"
 */
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Redirect initialisation
        response.sendRedirect("/javaEEdemo_war_exploded/firstJSP.jsp");
//        response.sendRedirect("https://vk.com/smokedkoala");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
