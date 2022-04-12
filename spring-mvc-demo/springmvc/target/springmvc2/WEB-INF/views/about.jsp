<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 20/03/22
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>About page</title>
</head>
<body>
<% String name = request.getAttribute("name").toString();
    String emailId = request.getAttribute("emailId").toString();
    List<String> skillSet = (List<String>) request.getAttribute("skillSet");

%>
<label>Name:</label><label><%=name%>
</label><br>
<label>EmailId:</label><label><%=emailId%>
</label><br>
<label>Skill set:</label><%
    for (String skill : skillSet) { %>
<label><%=skill%>
    <%}%>
</label><br>
</body>
</html>
