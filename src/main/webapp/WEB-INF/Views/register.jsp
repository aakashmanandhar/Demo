<%@include file="../../WEB-INF/Views/Shared/header.jsp" %>
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
    <%@include file="../../WEB-INF/Views/Shared/footer.jsp" %>

