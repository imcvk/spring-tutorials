<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 28/03/22
  Time: 7:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<%--    <!-- Bootstrap CSS -->--%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Registration Page</title>
</head>
<body>
<div class="container mt-5" style="width: 50%">
    <h1>Registration page</h1>
    <div>
        <form action="deleteProductForm" method="post">
            <div class="form-group">
                <b> <label for="productId">Enter Product Name:</label></b>
                <input name="productId" type="Number" class="form-control" id="productId"
                       aria-describedby="text"
                       placeholder="Enter Product ID">
            </div>
            <div class="container text-center">
                <button type="submit" class="btn btn-success">Delete Product</button>
            </div>
            <div >
                <a href="${pageContext.request.contextPath }/" class="btn">Home</a>
            </div>
        </form>
    </div>
</div>
<%--<a href="/home">Home</a>--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
