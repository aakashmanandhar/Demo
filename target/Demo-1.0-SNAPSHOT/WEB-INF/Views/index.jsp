<%-- 
    Document   : index
    Created on : Apr 22, 2017, 5:10:37 PM
    Author     : aakashm
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="${SITE_URL}/register">Register</a>
        <c:if test="${param.error!=null}">
            <div style="color: red">
                Invalid Username/Password
            </div>
        </c:if>
        <c:if test="${param.error2!=null}">
            <div style="color: red">
                Account not Activated Yet.
            </div>
        </c:if>
        <form action="" method="post">
            <label>Username</label>
            <input type="text" name="username">
            <label>Password</label>
            <input type="password" name="password">
            <button type="submit">Login</button>
        </form>
    </body>
</html>
