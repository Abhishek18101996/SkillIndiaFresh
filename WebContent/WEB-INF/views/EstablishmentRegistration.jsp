<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
    <title>Establishment Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script> -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>

</head>

<body>
    <div class="jumbotron text-center">

        <h1>National Apprenticeship Training Scheme - 2019</h1>
        <br>
        <h3>Establishment Registration Form</h3>

    </div>


    <form:form method="post" action="EstablishmentLogin" modelAttribute="establishment">

        <div class="row">
            <div class="col-md-4 form-group">
                <form:label path="estName">Establishment Name:</form:label>
                <spring:message text="estName"></spring:message>
                <form:input type="text" required="" placeholder="Enter Name" path="estName" class="form-control input-sm modify"
                    id="estName"/>
            </div>
            <div class="col-md-4 form-group">
                <form:label path="estType">Establishment Type :</form:label>
                <spring:message text="estType"></spring:message>
                <select class="custom-select d-block w-100" path="estType" id="estType" required="">
                    <option value="">Choose...</option>
                    <option>Autonomous</option>
                    <option>Non-Autonomous</option>

                </select>
            </div>

            <div class="col-md-4 form-group">
                <form:label path="userIdEst">userIdEstablishment :</form:label>
                <spring:message text="userIdEst"></spring:message>
                <form:input type="username" path="userIdEst" required="" class="form-control modify" id="userIdEst"/>
            </div>
        </div>


        <div class="row">
            <div class="col-md-4 form-group">
                <form:label path="estPassword">Password :</form:label>
                <spring:message text="estPassword"></spring:message>
                <form:input type="password" required="" path="estPassword" class="form-control modify" id="estPassword"/>
            </div>
           <div class="col-md-4 form-group">
			Address :
		  
			<form:label path="estAddress.localAddress">
				<spring:message text="Local Adress"/>
			</form:label>
		 <form:input path="estAddress.localAddress"  />
			 	  <br/>

	<br/>
			<form:label path="estAddress.city">
				<spring:message text="City"/>
			</form:label>
		 <form:input path="estAddress.city"  />
		 	 	  <br/>
	<br/>

			<form:label path="estAddress.state">
				<spring:message text="State"/>
			</form:label>

		 <form:input path="estAddress.state"  />
 	  <br/>
			</div>
            <div class="col-md-4 form-group">
                <form:label path="regNo">regNo :</form:label>
                <spring:message text="regNo"></spring:message>

                <form:input type="regNo" required="" path="regNo" class="form-control modify" id="regNo"/>

            </div>
        </div>



        <div class="row">
            <div class="col-md-4 form-group">
                <form:label path="confirmPwd">Confirm Password :</form:label>
                <form:input type="password" path="confirmPwd" required="" class="form-control modify" id="confirmPwd"/>
            </div>

            


           
        </div>

        <div class="row">
            

            <div class="col-md-3 form-group">
                <form:label path="domain">Domain Name :</form:label>
                <spring:message text="Domain"></spring:message>
                <form:input type="text" required="" path="domain" class="form-control " id="domain"/>
            </div>


            <div class="col-md-3 form-group">
                <form:label path="estContact">Contact Number :</form:label>
                <spring:message text="estContact"></spring:message>
                <form:input type="number" required="" path="estContact" class="form-control " id="estContact"/>
            </div>


            <div class="col-md-3 form-group">
                <form:label path="workingDays">Working Days / Week :</form:label>
                <spring:message text="Days"></spring:message>
                <form:input type="number" required="" path="workingDays" class="form-control " id="workingDays"/>
            </div>




        </div>




        <br>

<div class="col-md-4 form-group">
			Address :
				<form:label path="estBankDetails.bankName">Address :
				<spring:message text ="bankName"></spring:message>
			</form:label>
			<form:input path="estBankDetails.bankName"/><br/>
			
			<form:label path="estBankDetails.bankBranch">Address :
				<spring:message text ="bankBranch"></spring:message>
			</form:label>
			<form:input path="estBankDetails.bankBranch"/><br/>
			
			<form:label path="estBankDetails.bankIFSC">Address :
				<spring:message text ="bankIFSC"></spring:message>
			</form:label>
			<form:input path="estBankDetails.bankIFSC"/><br/>
			
			<form:label path="estBankDetails.accountNumber">Address :
				<spring:message text ="accountNumber"></spring:message>
			</form:label>
			<form:input path="estBankDetails.accountNumber"/><br/>
			</div>



        <br>

        <div class="text-center">

            <button type="submit" class="btn btn-danger">Submit</button>

        </div>


        </form:form>
</body>

</html>