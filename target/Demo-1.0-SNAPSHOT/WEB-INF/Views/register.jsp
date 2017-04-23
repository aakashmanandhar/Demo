<%-- 
    Document   : register
    Created on : Apr 22, 2017, 5:10:49 PM
    Author     : aakashm
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register Here</h1>
        <c:if test="${param.success!=null}">
            <div style="color:green">
                Sign Up Successful!
            </div>
        </c:if>
        <form method="post" action="">
            <div>
                <label>First Name</label>
                <input type="text" name="firstname">
            </div>

            <div>
                <label>Last Name</label>
                <input type="text" name="lastname">
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email">
            </div>
            <div>
                <label> Username</label>
                <input type="text" name="username">
            </div>
            <div>
                <label>Password</label>
                <input type="password" name="password">
            </div>
            <button type="submit">Register</button>

        </form>
    </body>
</html>
