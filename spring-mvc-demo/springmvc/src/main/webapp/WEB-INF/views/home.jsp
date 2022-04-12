<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.Writer" %><%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 20/03/22
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Name is:${name}
</h1>
<h1>ID is:${id}
</h1>
<h1>Friends:</h1>
<c:forEach var="item" items="${friends}">
    <h1>${item}</h1>
</c:forEach>
</body>
</html>
