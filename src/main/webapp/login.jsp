
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--walkthrough notes

<%
    if(request.getMethod().toLowerCase().equals("post")){

        String username = request.getParameter("username");
        String password = request.getParameter("pass");
        if(username.toLowerCase().equals("admin") && password.equals("password")) {
            response.sendRedirect("profile.jsp");
        }
    }

%>
--%>


<% if(request.getParameter("username") != null && request.getParameter("password") != null) {
    if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
        response.sendRedirect("profile.jsp");
    }
}; %>

<html>
<head>
    <title>Title</title>
    <%@ include file ="partials/head.jsp"%>
</head>
<body>
    <%@ include file="partials/navbar.jsp" %>
        <form method="POST" action="login.jsp">

            <label for="username">Username</label>
            <input id="username" name="username" type="text">

            <br>

            <label for="password">Password</label>
            <input id="password" name="password" type="password">
            <br>

            <input type="submit">
        </form>

</body>
</html>
