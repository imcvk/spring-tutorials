<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page import="java.time.LocalDateTime" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 21/03/22
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>

<%--<html>--%>
<%--<head></head>--%>
<%--<body>--%>
<%--<% String name = request.getAttribute("name").toString();--%>
<%--    int id = (int) request.getAttribute("rollno");--%>
<%--    LocalDateTime localDateTime = (LocalDateTime) request.getAttribute("date");--%>
<%--%>--%>
<%--<h1>Name:</h1><label><%=name%>--%>
<%--</label>--%>
<%--<h1>Roll no:</h1><label><%=id%>--%>
<%--</label>--%>
<%--<h1>Date:</h1><label><%=localDateTime%>--%>
<%--</body>--%>
<%--</html>--%>
<html>
<body>
<h1>Name:</h1><label>${name}
</label>
<h1>Roll no:</h1><label>${rollno }
</label>
<h1>Date:</h1><label>${date }</label>
</body>
</html>