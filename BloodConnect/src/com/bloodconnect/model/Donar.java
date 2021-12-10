package com.bloodconnect.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Donar")

public class Donar implements Serializable{
	@Id @GeneratedValue
	 private Long id;
    private String DonarName;
    private Long  Age;
    private String Gender;
    private String Address;
    private Long  MobileNumber;
	private String Email;
    private String DonarUserId;
    private String DonarPassword;
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDonarName() {
		return DonarName;
	}
	public void setDonarName(String donarName) {
		DonarName = donarName;
	}
	public Long getAge() {
		return Age;
	}
	public void setAge(Long age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDonarUserId() {
		return DonarUserId;
	}
	public void setDonarUserId(String duserId) {
		DonarUserId = duserId;
	}
	public String getPassword() {
		return DonarPassword;
	}
	public void setPassword(String dpassword) {
		DonarPassword = dpassword;
	}
	
	
	public Donar() {
    	
    }
	
	
    public Donar(String DonarName, Long Age, String Gender,String Address,Long MobileNumber,String Email,String DonarUserId, String DonarPassword) {
    	this.DonarName=DonarName;
    	this.Age=Age;
    	this.Gender=Gender;
    	this.Address=Address;
    	this.MobileNumber=MobileNumber;
    	this.Email=Email;
    	this.DonarUserId=DonarUserId;
    	this.DonarPassword=DonarPassword;
    	
    	
    	
    }

}
