package com.studentRegistraion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentRegistraion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String name;
	public String FatherName;
	public String PostalAddress;
	public String PersonalAddress;
	public String Sex;
	public String City;
	public String Course;
	public String District;
	public String state;
	public String PinCode;
	public String EmailId;
	public String DOB;
	public String MobileNo;
	
	public StudentRegistraion() {}
	
	
	public StudentRegistraion(long id, String textnames, String fatherName, String postalAddress, String personalAddress,
			String sex, String city, String course, String district, String state, String pinCode, String emailId,
			String dOB, String mobileNo) {
		super();
		this.id = id;
		textnames = textnames;
		FatherName = fatherName;
		PostalAddress = postalAddress;
		PersonalAddress = personalAddress;
		Sex = sex;
		City = city;
		Course = course;
		District = district;
		this.state = state;
		PinCode = pinCode;
		EmailId = emailId;
		DOB = dOB;
		MobileNo = mobileNo;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		name = name;
	}


	public String getFatherName() {
		return FatherName;
	}


	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}


	public String getPostalAddress() {
		return PostalAddress;
	}


	public void setPostalAddress(String postalAddress) {
		PostalAddress = postalAddress;
	}


	public String getPersonalAddress() {
		return PersonalAddress;
	}


	public void setPersonalAddress(String personalAddress) {
		PersonalAddress = personalAddress;
	}


	public String getSex() {
		return Sex;
	}


	public void setSex(String sex) {
		Sex = sex;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getCourse() {
		return Course;
	}


	public void setCourse(String course) {
		Course = course;
	}


	public String getDistrict() {
		return District;
	}


	public void setDistrict(String district) {
		District = district;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPinCode() {
		return PinCode;
	}


	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}


	public String getEmailId() {
		return EmailId;
	}


	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getMobileNo() {
		return MobileNo;
	}


	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "StudentRegistraion [id=" + id + ", Name=" + name + ", FatherName=" + FatherName + ", PostalAddress="
				+ PostalAddress + ", PersonalAddress=" + PersonalAddress + ", Sex=" + Sex + ", City=" + City
				+ ", Course=" + Course + ", District=" + District + ", state=" + state + ", PinCode=" + PinCode
				+ ", EmailId=" + EmailId + ", DOB=" + DOB + ", MobileNo=" + MobileNo + "]";
	}
	
	
	
	
	
}
