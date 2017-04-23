<%@include file="../../WEB-INF/Views/Shared/header.jsp" %>

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
<%@include file="../../WEB-INF/Views/Shared/footer.jsp" %>
