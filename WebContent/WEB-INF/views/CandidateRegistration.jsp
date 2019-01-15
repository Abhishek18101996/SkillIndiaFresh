`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 

prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" 

prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" 

prefix="form" %>
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


<!--<link rel="stylesheet" href="CSS/Student_Registration.css" />
-->
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


<form:form method="post" action="Login" modelAttribute="candidate">

		<div class="row">
			<div class="col-md-4 form-group">
				<form:label path="candidateName">Full Name:</form:label> <form:input type="text" required=""
					placeholder="First Name - Last Name" path="candidateName"
					class="form-control input-sm modify" id="candidateName"/>
			</div>
			<div class="col-md-4 form-group">
				<form:label path="FatherName">Father's Name :</form:label> <form:input type="text"
					path="FatherName" required="" class="form-control modify" id="FatherName"/>
			</div>

			<div class="col-md-4 form-group">
				<form:label path="Gender">Gender :</form:label> <form:input type="Gender"
					path="Gender" required="" class="form-control modify" id="Gender"/>
			</div>
		</div>


		<div class="row">
			<div class="col-md-4 form-group">
				<form:label path="newPassword">Password :</form:label> <form:input type="password" required=""
					path="newPassword" class="form-control modify" id="newPassword"/>
			</div>
			
			<div class="col-md-4 form-group">
			Address :
		  
			<form:label path="address.localAddress">
				<spring:message text="Local Adress"/>
			</form:label>
		 <form:input path="address.localAddress"  />
			 	  <br/>

	<br/>
			<form:label path="address.city">
				<spring:message text="City"/>
			</form:label>
		 <form:input path="address.city"  />
		 	 	  <br/>
	<br/>

			<form:label path="address.state">
				<spring:message text="State"/>
			</form:label>

		 <form:input path="address.state"  />
 	  <br/>
			</div>
			<div class="col-md-4 form-group">
				<form:label path="EmailId">Email Id :</form:label> <form:input type="email" required=""
					path="EmailId" class="form-control modify" id="EmailId"/>

			</div>
		</div>



		<div class="row">
			<div class="col-md-4 form-group">
				<form:label path="confirmPassword">Confirm Password :</form:label> <form:input type="password"
					path="confirmPassword" required="" class="form-control modify"
					id="confirmPassword"/>
			</div>

			<div class="col-md-4 form-group">
				<form:label path="dob">Date of Birth :</form:label> <form:input type="date" path="dob"
					class="form-control " id="dob"/>
			</div>
			<div class="col-md-4 form-group">
				<form:label path="aadhaarNumber">Aadhar No :</form:label> <form:input type="number"
					required="" class="form-control modify" path="aadhaarNumber" id="aadhaarNumber"/>
			</div>

		</div>

		<div class="row">
			<div class="col-md-4 form-group">
				<form:label path="EducationalDetails">Education Details :</form:label> <select
					class="custom-select d-block w-100" path="EducationalDetails" id="EducationalDetails"
					required="">
					<option value="">Choose...</option>
					<option>BE/B.Tech</option>
					<option>BCA</option>
					<option>MCA</option>
					<option>B.Com</option>
				</select>
			</div>

			<div class="col-md-4 form-group">
			Address :
				<form:label path="bankDetails.bankName">Address :
				<spring:message text ="bankName"></spring:message>
			</form:label>
			<form:input path="bankDetails.bankName"/><br/>
			
			<form:label path="bankDetails.bankBranch">Address :
				<spring:message text ="bankBranch"></spring:message>
			</form:label>
			<form:input path="bankDetails.bankBranch"/><br/>
			
			<form:label path="bankDetails.bankIFSC">Address :
				<spring:message text ="bankIFSC"></spring:message>
			</form:label>
			<form:input path="bankDetails.bankIFSC"/><br/>
			
			<form:label path="bankDetails.accountNumber">Address :
				<spring:message text ="accountNumber"></spring:message>
			</form:label>
			<form:input path="bankDetails.accountNumber"/><br/>
			</div>

			<div class="col-md-4 form-group">
				<form:label path="">Upload Profile Picture :</form:label> <form:input
					type="button" path="" required="" class="form-control btn btn-success modify"
					value="Upload" id="pic"/>
			</div>

		</div>

		<br>

		<div class="text-center">

			<button type="submit" class="btn btn-danger">Submit</button>

		</div>


	</form:form>
	</body>
</html>