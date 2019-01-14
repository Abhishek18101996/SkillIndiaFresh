package com.skillIndia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//Every user who is registering with the organisation will have a Address
@Entity
public class Address implements Serializable{

	
	//Declarations
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="house_no")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int AddressId;//in order to map the database table with other entities a primary key
	
	private String house_no;
	private String street,city,district,state,country;//Various address fields
	private int pincode;
	
	

	public int getAddressId() {
		return AddressId;
	}

	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	//parameterized constructor
	

	public String getHouse_no() {
		return house_no;
	}

	public Address(String house_no, String street, String city, String district, String state, String country,
		int pincode) {
	super();
	this.house_no = house_no;
	this.street = street;
	this.city = city;
	this.district = district;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
}

	@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", street=" + street + ", city=" + city + ", district=" + district
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
