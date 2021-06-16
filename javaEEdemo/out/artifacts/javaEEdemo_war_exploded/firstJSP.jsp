<%--
  Created by IntelliJ IDEA.
  User: SmokedKoala
  Date: 16.06.2021
  Time: 13:45
  To change this template use File | Settings | File Templates.


  JSP is used to create html code with java logic
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
    <%--    directive for importing java libraries and so on--%>
    <%@ page import="java.util.Date, logic.TestClass" %>
    <%--    Java code without String output on screen--%>
    <%
        for (int i = 0; i < 10; i++)
            out.println("<p>Hello World " + i + "</p>");
        TestClass testClass = new TestClass();
        String currentDate = new Date().toString();
    %>
    <%--    Java code with String output on screen--%>
    <%= testClass.getInfo()%>
</p>

</body>
</html>
