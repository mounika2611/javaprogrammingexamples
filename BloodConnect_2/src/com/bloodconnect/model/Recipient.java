
package com.bloodconnect.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recipient")
public class Recipient implements Serializable {
    
    @Id @GeneratedValue
    private int Id;
    private String RecipientName;
    private String  Age;
    private String Gender;
    private String Address;
    private String  MobileNumber;
    private String Bloodgroup;
    private String Prev_dnt;
	private String Email;
    private String RecipientUserId;
    private String RecipientPassword;
    

    public int getId() {
		return Id;
	}


	public void setId(int id) {
		this.Id = id;
	}


	public String getRecipientName() {
		return RecipientName;
	}


	public void setRecipientName(String recipientName) {
		RecipientName = recipientName;
	}


	public String getAge() {
		return Age;
	}


	public void setAge(String age) {
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


	public String getMobileNumber() {
		return MobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}


	public String getPrev_dnt() {
		return Prev_dnt;
	}


	public void setPrev_dnt(String prev_dnt) {
		Prev_dnt = prev_dnt;
	}


	public String getBloodgroup() {
		return Bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		Bloodgroup = bloodgroup;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getRecipientUserId() {
		return RecipientUserId;
	}


	public void setRecipientUserId(String recipientUserId) {
		RecipientUserId = recipientUserId;
	}


	public String getRecipientPassword() {
		return RecipientPassword;
	}


	public void setRecipientPassword(String recipientPassword) {
		RecipientPassword = recipientPassword;
	}


	public Recipient() {
    }

    
    public Recipient(String RecipientName,String  Age,String Gender, String Address,String  MobileNumber,String Prev_dnt,String Bloodgroup,
    		String Email,String RecipientUserId,String RecipientPassword) {
    	this.RecipientName=RecipientName;
    	this.Age=Age;
    	this.Gender=Gender;
    	this.Address=Address;
    	this.MobileNumber=MobileNumber;
    	this.Prev_dnt=Prev_dnt;
    	this.Bloodgroup=Bloodgroup;
    	this.Email=Email;
    	this.RecipientUserId=RecipientUserId;
    	this.RecipientPassword=RecipientPassword;
        
    }


}