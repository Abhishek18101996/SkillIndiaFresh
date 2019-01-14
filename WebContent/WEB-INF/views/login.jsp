<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="CSS/LoginForm.css">


</head>
<body style="background-color: rgb(255, 255, 255)" class="text-center">

	<div id="header">
		<h1 id="headingname">SKILL INDIA ONLINE PORTAL</h1>
		<br>

		<p>Skill India Online portal provides a platform for various
			stakeholders like Students, Establishments and Institutions to
			leverage the Apprenticeship training programme.Content provided by
			Boards of Apprenticeship Training / Board of Practical Training</p>

		<br> 
	</div>


	<div class="container">

		<form class="form" action="/action_page.php">
			<h2 class="text-danger">Log-In Form</h2>
			<br> <img src="HTML/student.png" width="120" height="120"
				alt="Log In">


			<div id="username" class="form-group">
				<h4 style="color: black">Username:</h4>
				<input type="username" class="form-control " id="username"
					placeholder="Enter Username" name="username">
			</div>


			<div class="form-group">
				<h4 style="color: black">Password:</h4>
				<input type="password" class="form-control" id="password"
					placeholder="Enter Password" name="password">
			</div>



			<div class="text-left">

				<p>
					Not a Member ? &nbsp; <a href="Student_Registration.jsp">
						Register Here</a>
				</p>


			</div>

			<input type="submit" class="btn btn-success">
			</button>


		</form>

	</div>

	<!-- Footer -->
	<footer class="page-footer font-small black"> <!-- Copyright -->
	<div class="footer-copyright text-center py-3">
		&copy; 2018 Copyright: <a href="http://mhrdnats.gov.in/">
			NATS-2019</a>
	</div>
	<!-- Copyright --> </footer>
	<!-- Footer -->
</body>
</html>