<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>User List</h2>
<table border="1">
  <tr><th>ID</th><th>Name</th><th>Email</th></tr>
  <c:forEach var="u" items="${users}">
    <tr>
      <td>${u.id}</td>
      <td>${u.name}</td>
      <td>${u.email}</td>
    </tr>
  </c:forEach>
</table>
<a href="/">Back</a>
