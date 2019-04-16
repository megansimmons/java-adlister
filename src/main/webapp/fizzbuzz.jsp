<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach var = "i" begin = "1" end = "30">
        <c:choose>
            <c:when test = "${i % 15 ==0}">
                Fizzbuzz<br>
            </c:when>
            <c:when test = "${i % 3 ==0}">
                Fizz<br>
            </c:when>
            <c:when test = "${i % 5 ==0}">
                buzz<br>
            </c:when>
            <c:otherwise>
                ${i}<br>
            </c:otherwise>
        </c:choose>
    </c:forEach>

</body>
</html>
