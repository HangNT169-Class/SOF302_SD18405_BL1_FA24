<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>Ma</th>
        <th>Ten</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach items="${listCategory}" var="ct">
        <tr>
            <td></td>
            <td>${ct.listCategory}</td>
            <td>${ct.categoryName}</td>
        </tr>

    </c:forEach>


    </tbody>

</table>
</body>
</html>