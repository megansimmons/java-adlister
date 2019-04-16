<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
import java.util.ArrayList;

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int counter = 0; %>
<% counter += 1; %>
<% String name = "Zion"; %>
<% String dog = "Woof"; %>
<% String cat= "Hiss"; %>
<% int[] numbers = {7,13,713, 317, 31, 7}; %>


<html>
<head>
    <title>Title</title>
   <%@ include file ="partials/bootstrap.jsp"%>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>
<h1>The current count is <%= counter %>.</h1>
<h2 class = "text-danger">Hello <%=name %>!!</h2>
<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<li><%=dog %></li>
<li><%=cat %></li>
<li><%=numbers%></li>
<% response.setStatus(404); %>
<% boolean first = true; %>
<% boolean second = false; %>

<c:choose>
    <c:when test="${boolean_expression_1}">
        <p>boolean_expression_1 was true</p>
    </c:when>
    <c:when test="${boolean_expression_2}">
        <p>boolean_expression_1 was false, and boolean_expression_2 was true</p>
    </c:when>
    <c:otherwise>
        <p>none of the above tests were true</p>
    </c:otherwise>
</c:choose>

<% List<String> list = new ArrayList<String>();
list.add("Hello");
list.add("Hola");
list.add("Bonjour");
list.add("Aloha");
%>

<% for (String hello : list) {%>
    Hello in some language: <%= hello %><br>
<%}%>




<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
