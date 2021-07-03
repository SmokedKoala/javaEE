import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        try {
//            driver for working with postgreSQL
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            printWriter.println("ClassNotFoundException");
        }
        printWriter.println("<h1>Books Table from DataBase</h1>");
        try {
//            Set connection to database
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_ee_db","postgres","root");
            Statement statement =  connection.createStatement();
//            Get request result
            ResultSet resultSet = statement.executeQuery("SELECT * from books");

            while (resultSet.next()){
                printWriter.println("<h3> Title:"+resultSet.getString("title")+" ,Author:"+resultSet.getString("author")+"</h3>");
            }
            statement.close();
        } catch (SQLException throwables) {
            printWriter.println("No suitable driver found");
            throwables.printStackTrace();
        }
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
