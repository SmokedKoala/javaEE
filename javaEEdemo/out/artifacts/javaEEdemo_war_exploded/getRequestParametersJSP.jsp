<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23.06.2021
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Request Parameters</title>
</head>
<body>
    <h1>Testing get request parameters</h1>
    <p>
        <%
            String key = request.getParameter("name");
        %>
        <%= "Hello, user "+key%>
    </p>

</body>
</html>
