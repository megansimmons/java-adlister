<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dogs</title>
</head>
<body>
    <h1>Here's a list of canine friends.</h1>
<c:forEach var = "dog" items = "${dogs}">
    <div class = "dog">
        <h2>Name: ${dog.name}</h2>
        <p>Color: ${dog.color}</p>
        <p>Age: ${dog.age}</p>
        <p>Weight: ${dog.weightInLbs}</p>
        <p>Height: ${dog.heightInInches}</p>
    </div>
</c:forEach>
</body>
</html>
