<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select>
    <c:forEach>
        <option value="id">name</option>
    </c:forEach>
</select>
<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>Ma</th>
        <th>Ten</th>
    </tr>
    </thead>
    <tbody>
    <%--ProductID, Product Name, Price, Description, Category Code, Category Name --%>
    <%-- => 1 bang   --%>
    <c:forEach items="${listCategory}" var="ct" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${ct.listCategory}</td>
            <td>${ct.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>