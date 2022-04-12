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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
          integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
</head>
<body>

<div class="container">
    <h2>Product List</h2>

    <table class="table table-striped table-hover ">
        <thead>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Description</th>
            <th>Product Costing</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${prodList}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.productName}</td>
                <td>${p.productDescription}</td>
                <td>&#8377;${p.productPrice}</td>
                <td>
                    <a href="deleteProductHandler/${p.id}"><i class="fa-solid fa-trash"></i></a>
                    <a href="updateProduct/${p.id}"><i class="fa-solid fa-pencil"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>

    </div>
</div>

</body>
</html>
