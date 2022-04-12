<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>

<div class="container mt-5">
    <h1>Registration page</h1>
    <div>
        <form action="handleContact" method="post">
            <div class="form-group col-xs-2">
                <b> <label for="exampleInputEmail1">Email address</label></b>
                <input name="email" type="email" class="form-control" id="exampleInputEmail1"
                       aria-describedby="emailHelp"
                       placeholder="Enter email">
            </div>
            <div class="form-group">
                <b> <label for="exampleInputUsername">User Name</label></b>
                <input name="userName" type="text" class="form-control" id="exampleInputUsername"
                       aria-describedby="text"
                       placeholder="Enter User Name">
            </div>
            <div class="form-group">
                <b> <label for="password">User Password</label></b>
                <input name="password" type="password" class="form-control" id="password" aria-describedby="password"
                       placeholder="Enter User Password">
            </div>
            <div class="form-group">
                <b> <label for="dob">User Date Of Birth</label></b>
                    <input name="dob" type="text" class="form-control" id="dob" aria-describedby="dob"
                           placeholder="Enter User DOB">
            </div>
            <div class="form-group">
                <b> <label>Gender</label><br></b>
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
                <b> <label for="codingLanguages">Select your favorite programing language</label></b>
                <div class="select-group">
                    <select class="form-select" multiple aria-label="multiple select example" id="codingLanguages"
                            name="codingLanguages">
                        <option value="Java">Java</option>
                        <option value="Java">Python</option>
                        <option value="ASP">ASP</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <b> <label for="database">Select your favorite Database</label></b>
                <div class="select-group">
                    <select class="form-select" aria-label="Default select example" name="database"
                            id="database">
                        <option value="Oracle SQL">Oracle SQL</option>
                        <option value="MySQL">MySQL</option>
                        <option value="Neo4J">Neo4J</option>
                    </select>
                </div>
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
