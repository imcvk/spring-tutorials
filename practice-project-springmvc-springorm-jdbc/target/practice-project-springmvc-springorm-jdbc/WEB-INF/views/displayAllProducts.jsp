<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Product List</h2>

    <table class="table table-dark">
        <thead>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Description</th>
            <th>Product Costing</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${prodList}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.productDescription}</td>
                <td>${p.productName}</td>
                <td>${p.productPrice}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div >
        <a href="${pageContext.request.contextPath }/" class="btn">Home</a>
    </div>
</div>
<%--<a href="/home">Home</a>--%>
</body>
</html>
