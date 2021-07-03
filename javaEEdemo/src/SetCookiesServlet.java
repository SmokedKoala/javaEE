import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("some_id","123");
        Cookie cookie2 = new Cookie("some_letters","abc");

        cookie1.setMaxAge(60*60*24);
        cookie2.setMaxAge(60*60*24);
//        cookie2.setMaxAge(-1); cookie будет существовать, пока клиент не закроет браузер

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
