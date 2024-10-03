<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<form action="/sinh-vien/add" method="post">--%>
<%--    MSSV: <input type="text" name="mssv"/>--%>
<%--    <br/>--%>
<%--    Tên: <input type="text" name="ten"/>--%>
<%--    <br/>--%>
<%--    Tuổi: <input type="text" name="tuoi"/>--%>
<%--    <br/>--%>
<%--    Địa chỉ: <input type="text" name="diaChi"/>--%>
<%--    <br/>--%>
<%--    Giới tính:--%>
<%--    <input type="radio" name="gioiTinh" checked value="true"/>Nam--%>
<%--    <input type="radio" name="gioiTinh" value="false"/>Nữ--%>
<%--    <br/>--%>
<%--    <button type="submit">Add</button>--%>
<%--</form>--%>
<form:form action="/sinh-vien/add" method="post" modelAttribute="sv1">
    MSSV: <form:input path="mssv"/>
    <form:errors path="mssv"/>
    <br/>
    Ten: <form:input path="ten"/>
    <form:errors path="ten"/>
    <br/>
    Tuoi: <form:input path="tuoi"/>
    <form:errors path="tuoi"/>
    <br/>
    Dia chi: <form:input path="diaChi"/>
    <form:errors path="diaChi"/>
    <br/>
    Gioi tinh:
        <form:radiobutton path="gioiTinh"  value="true" checked = "true"/> Nam
        <form:radiobutton path="gioiTinh"  value="false"/> Nữ
    <br/>
    <form:button type="submit">Add</form:button>
</form:form>
</body>
</html>
