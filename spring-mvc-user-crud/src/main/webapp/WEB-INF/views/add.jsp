<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h2>Add User</h2>
<form:form method="post" modelAttribute="user">
    Name: <form:input path="name"/><br/>
    Email: <form:input path="email"/><br/>
    <input type="submit" value="Save"/>
</form:form>
