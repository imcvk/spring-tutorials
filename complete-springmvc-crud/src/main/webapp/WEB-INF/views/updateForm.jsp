<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 12-04-2022
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <title>Update</title>
</head>
<body>
<div class="container mt-5" style="width: 50%">
    <form action="${pageContext.request.contextPath}/updateProductHandler" method="post">
        <div class="form-group">
            <b> <label for="id">Enter Product ID:</label></b>
            <input name="id" type="text" class="form-control" id="id"
                   aria-describedby="text" value="${product.id}"
                   placeholder="Enter Product id">
        </div>
        <div class="form-group">
            <b> <label for="productName">Enter Product Name:</label></b>
            <input name="productName" type="text" class="form-control" id="productName"
                   aria-describedby="text" value="${product.productName}"
                   placeholder="Enter Product Name">
        </div>
        <div class="form-group">
            <b> <label for="productDescription">Enter Product Description:</label></b>

            <textarea class="form-control" id="productDescription" name="productDescription" rows="3"
                      placeholder="Enter Product Description">${product.productDescription}</textarea>
        </div>
        <div class="form-group">
            <b> <label for="productPrice">Enter Product Description:</label></b>
            <input name="productPrice" type="number" class="form-control" id="productPrice"
                   aria-describedby="text"
                   placeholder="Enter Product Price" value="${product.productPrice}">
        </div>

        <div class="form-group">
            <a href="${pageContext.request.contextPath }/listAllProduct" class="btn btn-outline-danger">Home</a>
            <button type="submit" class="btn btn-success">Update Product</button>
        </div>
    </form>
</div>
</body>
</html>
