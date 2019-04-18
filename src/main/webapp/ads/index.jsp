<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>Title ${ad.title}</h2>
        <p>Description ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
