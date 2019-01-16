<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="Candidate_Dashboard.css" />
    <script src="main.js"></script>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>
</head>

<body>


    <nav class="navbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <img class="img-circle logo" src="C:\Users\HriK\Desktop\FINAL HTML\logo.jpg" alt="LOGO">

                <a class="navbar-brand" style="color: black" href="#">Skill India Portal</a>
            </div>

            <ul class="nav navbar-nav">
                <li class="active"><a href="#" style="color: black">Home</a></li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" style="color: black" href="#">Registration
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="Student_Registration.jsp" style="color: black">Candidate
                                Registration</a></li>
                        <li><a href="Establishment_Registration.jsp" style="color: black">Establishment
                                Registration</a></li>
                        <li><a href="Establishment_Registration.jsp" style="color: black">Institute
                                Registration</a></li>

                    </ul>
                </li>


                <li><a href="Student_Login.jsp" style="color: black">Login </a></li>
                <li><a href="AboutUs.jsp" style="color: black">About Us </a></li>


                <li><a href="#" style="color: black">FAQ's </a></li>

                <li><a href="#" style="color: black">Complaints </a></li>

                <li><a href="Establishments.jsp" style="color: black">Establishments </a></li>

                <li><a href="Institutions.jsp" style="color: black">Institutions</a></li>



            </ul>



        </div>

    </nav>

    <br>
    <br>

    <div>

        <h3>Welcome, Candidate ! &nbsp; &nbsp;
        Candidate:
        <%=session.getAttribute("candidate") %>
        Username:
        <%=session.getAttribute("EmailId")%>
        
         Password:
        <%=session.getAttribute("NewPassword")%>   
         <button>Logout</button>
       
            &nbsp; &nbsp; <button href="#">Browse Course</button>


        </h3>
        <div class="photo">IMAGE
        </div>
    </div>


    <div class="container">

        <h3>Application Status</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Establishment Name</th>
                    <th>Domain Name</th>
                    <th>Course Name</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>-</td>
                    <td>-</td>
                    <td>-</td>
                    <td>-</td>
                </tr>

            </tbody>
        </table>
    </div>

</body>



</html>