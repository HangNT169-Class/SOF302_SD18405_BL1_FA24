<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
        <th>Product ID</th>
        <th>Product code</th>
        <th>Product name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Category Name</th>
        <th>Category Code</th>
        </thead>
        <tbody>
        <%--Them, Sua, Xoa - product , Detail--%>
        <c:forEach items="${list}" var="pd">
            <tr>
                <td>${pd.productId}</td>
                <td>${pd.productCode}</td>
                <td>${pd.productName}</td>
                <td>${pd.price}</td>
                <td>${pd.description}</td>
                <td>${pd.cate.listCategory}</td>
                <td>${pd.cate.categoryName}</td>
                <td>
                    <a href="/product/delete/${pd.productId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>