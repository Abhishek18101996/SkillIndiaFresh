package com.skillIndia.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Candidate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	private String candidateName;//Name of the Candidate
	private String FatherName;//Candidate father name
	//private String address;//XCandidate's Address
	private String Gender;//gender of the user
	private String EmailId;//Candidate's EmailId
	private String contact;//contact number of the user
	private String aadhaarNumber;//Aadhaar reference of the candidate
	private String EducationalDetails;//Qualification of the candidate
	private String newPassword;
	private String confirmPassword;
	private Date dob;//Candidate's DOB
	
	@OneToOne(cascade=CascadeType.ALL)
	private BankDetails bankDetails;
	
	@ManyToOne
	@JoinColumn(name="estId")
	private Establishment establishment;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Course course;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	
	public BankDetails getBankDetails() {
		return bankDetails;
	}


	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}


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
	
	
	
	
	
	

	

	

	public String getFatherName() {
		return FatherName;
	}


	@Override
	public String toString() {
		return "Candidate [UserId=" + UserId + ", candidateName=" + candidateName + ", FatherName=" + FatherName
				+ ", Gender=" + Gender + ", EmailId=" + EmailId + ", contact=" + contact + ", aadhaarNumber="
				+ aadhaarNumber + ", EducationalDetails=" + EducationalDetails + ", newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + ", dob=" + dob + ", address=" + address + ", bankDetails="
				+ bankDetails + "]";
	}


	public Candidate(int userId, String candidateName, String fatherName, String gender, String emailId, String contact,
			String aadhaarNumber, String educationalDetails, String newPassword, String confirmPassword, Date dob,
			Address address, BankDetails bankDetails) {
		super();
		UserId = userId;
		this.candidateName = candidateName;
		FatherName = fatherName;
		Gender = gender;
		EmailId = emailId;
		this.contact = contact;
		this.aadhaarNumber = aadhaarNumber;
		EducationalDetails = educationalDetails;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
		this.address = address;
		this.bankDetails = bankDetails;
	}


	public void setFatherName(String fatherName) {
		FatherName = fatherName;
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
