package com.skillIndia.model;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	private String candidateName;//Name of the Candidate
	private String FatherName;//Candidate father name
	private String address;//XCandidate's Address
	private String Gender;//gender of the user
	private String EmailId;//Candidate's EmailId
	private String contact;//contact number of the user
	private String aadhaarNumber;//Aadhaar reference of the candidate
	private String EducationalDetails;//Qualification of the candidate
	private String newPassword;
	private String confirmPassword;
	private Date dob;//Candidate's DOB
	
	public int getUserId() {
		return UserId;
	}


	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	//SuperClass Constructor
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor
	
	
	
	
	
	
	
	
	
	
	
	

	
	//To String
	
	
	
	
	
	

	

	public Candidate(int userId, String candidateName, String fatherName, String address, String gender, String emailId,
			String contact, String aadhaarNumber, String educationalDetails, String newPassword, String confirmPassword,
			Date dob) {
		super();
		UserId = userId;
		this.candidateName = candidateName;
		FatherName = fatherName;
		this.address = address;
		Gender = gender;
		EmailId = emailId;
		this.contact = contact;
		this.aadhaarNumber = aadhaarNumber;
		EducationalDetails = educationalDetails;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
	}


	public String getFatherName() {
		return FatherName;
	}


	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmailId() {
		return EmailId;
	}


	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public void setUserId(int userId) {
		UserId = userId;
	}


	@Override
	public String toString() {
		return "Candidate [UserId=" + UserId + ", candidateName=" + candidateName + ", FatherName=" + FatherName
				+ ", address=" + address + ", Gender=" + Gender + ", EmailId=" + EmailId + ", contact=" + contact
				+ ", aadhaarNumber=" + aadhaarNumber + ", EducationalDetails=" + EducationalDetails + ", newPassword="
				+ newPassword + ", confirmPassword=" + confirmPassword + ", dob=" + dob + "]";
	}


	//Getters and Setters
	public String getCandidateName() {
		return candidateName;
	}
	

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getEducationalDetails() {
		return EducationalDetails;
	}
	public void setEducationalDetails(String educationalDetails) {
		EducationalDetails = educationalDetails;
	}
	
}
