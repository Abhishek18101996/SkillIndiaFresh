package com.skillIndia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Establishment implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estId;
	
	@Column(unique=true)
	private String userIdEst;
	
	private String estPassword;
	
	private String confirmPwd;
	
	private String estName;
	
	private int estContact;
	
	private String estType;
	
	private String regNo;
	
	private int workingDays;
	
	private String domain;
	
	@Transient
	private List<Candidate> candidateList;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address estAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	private BankDetails estBankDetails;
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
                })
	@JoinTable(name = "establishment_course",
    joinColumns = { @JoinColumn(name = "estName") },
    inverseJoinColumns = { @JoinColumn(name = "courseName") })
	private List< Course> courseList = new ArrayList<>();

	//SuperClass Constructor
	public Establishment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	//getters and setters
	public int getEstId() {
		return estId;
	}

	@Override
	public String toString() {
		return "Establishment [establishmentId=" + estId + ", userIdEst=" + userIdEst
				+ ", establishmentPassword=" + estPassword + ", establishmentName=" + estName
				+ ", estContact=" + estContact + ", estType=" + estType
				+ ", regNo=" + regNo + ", workingDays=" + workingDays + ", domain=" + domain + ", establishmentAddress="
				+ estAddress + ", estBankDetails=" + estBankDetails + ", courseList="
				+ courseList + "]";
	}

	//Parameterized Constructor
	public Establishment(int estId, String userIdEst, String estPassword,
			String estName, int estContact, String estType, String regNo, int workingDays,
			String domain, Address estAddress, BankDetails estBankDetails,
			List<Course> courseList) {
		super();
		this.estId = estId;
		this.userIdEst= userIdEst;
		this.estPassword = estPassword;
		this.estName = estName;
		this.estContact = estContact;
		this.estType = estType;
		this.regNo = regNo;
		this.workingDays = workingDays;
		this.domain = domain;
		this.estAddress = estAddress;
		this.estBankDetails = estBankDetails;
		this.courseList = courseList;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getEstPassword() {
		return estPassword;
	}

	public void setEstPassword(String estPassword) {
		this.estPassword = estPassword;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}

	public String getUserIdEst() {
		return userIdEst;
	}

	public void setUserIdEst(String userIdEst) {
		this.userIdEst= userIdEst;
	}

	public String getEstName() {
		return estName;
	}

	public void setEstName(String estName) {
		this.estName = estName;
	}

	public int getEstContact() {
		return estContact;
	}

	public void setEstContact(int estContact) {
		this.estContact = estContact;
	}

	public String getEstType() {
		return estType;
	}

	public void setEstType(String estType) {
		this.estType = estType;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Address getEstAddress() {
		return estAddress;
	}

	public void setEstAddress(Address estAddress) {
		this.estAddress = estAddress;
	}

	public BankDetails getEstBankDetails() {
		return estBankDetails;
	}

	public void setEstBankDetails(BankDetails estBankDetails) {
		this.estBankDetails = estBankDetails;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
}
