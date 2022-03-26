package com.hcl.BankingProject.Entity;

//import java.math.BigDecimal;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long customerId;

    private String customerfirstName;
    
    private String customerlastName;
    
    private int age;
    
    private String gender;
    
    private Long mobileNumber;

    private String emailId;
    
    private double currentBalance = 10000;

	public Long getAccountId() {
		return customerId;
	}

	public void setAccountId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerfirstName() {
		return customerfirstName;
	}

	public void setCustomerfirstName(String customerfirstName) {
		this.customerfirstName = customerfirstName;
	}

	public String getCustomerlastName() {
		return customerlastName;
	}

	public void setCustomerlastName(String customerlastName) {
		this.customerlastName = customerlastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
