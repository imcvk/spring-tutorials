<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 25/03/22
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<form action="processForm" method="post">
    <label>User Name:</label><input type="text" name="userName"/><br>
    <label>Email ID :</label><input type="email" name="emailId"/><br>
    <label>Password :</label><input type="password" name="password"><br>
    <input type="submit">
</form>
</body>
</html>
