<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 28/03/22
  Time: 7:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Registration Page</title>
</head>
<body>

<div class="container mt-5" style="width: 30%">
    <h1>Registration page</h1>
    <div>
        <form action="handleContact" method="post">
            <div class="form-group" >
                <b> <label for="userName">User Name:</label></b>
                <input name="userName" type="text" class="form-control" id="userName"
                       aria-describedby="text"
                       placeholder="Enter User Name">
            </div>
            <div class="form-group">
                <b> <label for="email">Email address:</label></b>
                <input name="email" type="email" class="form-control" id="email"
                       aria-describedby="emailHelp"
                       placeholder="Enter email">
            </div>

            <div class="form-group">
                <b> <label for="password">User Password:</label></b>
                <input name="password" type="password" class="form-control" id="password" aria-describedby="password"
                       placeholder="Enter User Password">
            </div>
            <div class="form-group">
                <b> <label for="dob">Date Of Birth:</label></b>
                <input name="dob" type="text" class="form-control" id="dob" aria-describedby="dob"
                       placeholder="Enter User DOB">
            </div>
            <div class="form-group">
                <b> <label>Gender:</label><br></b>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Male" name="gender" id="gender1">
                    <label class="form-check-label" for="gender1">
                        Male
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Female" name="gender" id="gender2" checked>
                    <label class="form-check-label" for="gender1">
                        Female
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="Other" name="gender" id="gender3" checked>
                    <label class="form-check-label" for="gender3">
                        Other
                    </label>
                </div>
            </div>
            <div class="form-group">
                <b> <label>Address:</label></b>
                <input name="address.city" type="text" class="form-control" id="city"
                       aria-describedby="emailHelp"
                       placeholder="Enter city">
                <input name="address.state" type="text" class="form-control" id="state"
                       aria-describedby="emailHelp"
                       placeholder="Enter state">
            </div>

            <div class="container text-center">
                <button type="submit" class="btn btn-success">Sign up</button>
            </div>
        </form>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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
