<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 12-04-2022
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <title>Add Product</title>
</head>
<body>

<div class="container mt-5" style="width: 50%">
    <h1>Add New Product</h1>
    <div>
        <form action="addProductHandler" method="post">
            <div class="form-group">
                <b> <label for="productName">Enter Product Name:</label></b>
                <input name="productName" type="text" class="form-control" id="productName"
                       aria-describedby="text"
                       placeholder="Enter Product Name">
            </div>
            <div class="form-group">
                <b> <label for="productDescription">Enter Product Description:</label></b>

                <textarea class="form-control" id="productDescription" name="productDescription" rows="3"
                          placeholder="Enter Product Description"></textarea>
            </div>
            <div class="form-group">
                <b> <label for="productPrice">Enter Product Description:</label></b>
                <input name="productPrice" type="number" class="form-control" id="productPrice"
                       aria-describedby="text"
                       placeholder="Enter Product Price">
            </div>

            <div class="form-group">
                <a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Home</a>
                <button type="submit" class="btn btn-success">Add Product</button>
            </div>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
        crossorigin="anonymous"></script>

</body>
</html>
