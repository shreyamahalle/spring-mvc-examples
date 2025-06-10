<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Add User</title>
</head>
<body>
    <h2>Add User</h2>
    <form:form method="post" modelAttribute="user">
        Name: <form:input path="name"/><br/>
        Email: <form:input path="email"/><br/>
        <input type="submit" value="Save"/>
    </form:form>
    <br/>
    <a href="/">Back to Home</a>
</body>
</html>
