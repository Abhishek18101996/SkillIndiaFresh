<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Candidate Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script> -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>


<link rel="stylesheet" href="CSS/Student_Registration.css" />

</head>
<body>
<div class="jumbotron text-center">

		<h1>SKILL INDIA ONLINE PORTAL</h1>
		<br>
		<div class="page-header"></div>

		<p>Skill India Online portal provides a platform for various
			stakeholders like Students, Establishments and Institutions to
			leverage the Apprenticeship training programme.Content provided by
			Boards of Apprenticeship Training / Board of Practical Training</p>
		<h3>Candidate Registration Form</h3>

	</div>


<form method="post" action="Login" modelAttribute="candidate">

		<div class="row">
			<div class="col-md-4 form-group">
				<label for="name">Full Name:</label> <input type="text" required
					placeholder="First Name - Last Name" name="candidateName"
					class="form-control input-sm modify" id="name">
			</div>
			<div class="col-md-4 form-group">
				<label for="fname">Father's Name :</label> <input type="text"
					name="FatherName" required class="form-control modify" id="fname">
			</div>

			<div class="col-md-4 form-group">
				<label for="gender">Gender :</label> <input type="gender"
					name="Gender" required class="form-control modify" id="Gender">
			</div>
		</div>


		<div class="row">
			<div class="col-md-4 form-group">
				<label for="pwd">Password :</label> <input type="password" required
					name="newPassword" class="form-control modify" id="newPassword">
			</div>
			<div class="col-md-4 form-group">
				<label for="address">Address :</label>
				<textarea class="form-control" rows="2" id="address" name="address"></textarea>

			</div>
			<div class="col-md-4 form-group">
				<label for="email">Email Id :</label> <input type="email" required
					name="EmailId" class="form-control modify" id="EmailId">

			</div>
		</div>



		<div class="row">
			<div class="col-md-4 form-group">
				<label for="cpwd">Confirm Password :</label> <input type="password"
					name="confirmPassword" required class="form-control modify"
					id="confirmPassword">
			</div>

			<div class="col-md-4 form-group">
				<label for="date">Date of Birth :</label> <input type="date"
					class="form-control " id="dob">
			</div>
			<div class="col-md-4 form-group">
				<label for="aadhar">Aadhar No :</label> <input type="number"
					required class="form-control modify" name="aadhar" id="aadharno">
			</div>

		</div>

		<div class="row">
			<div class="col-md-4 form-group">
				<label for="degree">Education Details :</label> <select
					class="custom-select d-block w-100" name="EducationalDetails" id="EducationalDetails"
					required>
					<option value="">Choose...</option>
					<option>BE/B.Tech</option>
					<option>BCA</option>
					<option>MCA</option>
					<option>B.Com</option>
				</select>
			</div>

			<div class="col-md-4 form-group">
				<label for="pic">Upload Profile Picture :</label> <input
					type="button" required class="form-control btn btn-success modify"
					value="Upload" id="pic">
			</div>

		</div>

		<br>

		<div class="text-center">

			<button type="submit" class="btn btn-danger">Submit</button>

		</div>


	</form>
	</body>
</html>