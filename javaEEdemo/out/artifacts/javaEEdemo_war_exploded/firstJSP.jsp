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
    <%--    Java code without String output on screen--%>
    <%
        //    java.util.Date currentDate = new java.util.Date();
        //    String string = "Текущая дата " + currentDate;
        for (int i = 0; i < 10; i++)
            out.println("<p>Hello World " + i+"</p>");
    %>
    <%--    Java code with String output on screen--%>
    <%--    <%= string%>--%>
</p>

</body>
</html>
