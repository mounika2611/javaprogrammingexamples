package com.hcl.BankingProject.Entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class Account {
	     @Id
	     @Column(name="account_id")
	     @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long accountId;

	     @Column(name="account_number")
	   private String accountNumber;

	     @Column(name="current_balance") 
	   private BigDecimal currentBalance;
	     
	     

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public BigDecimal getCurrentBalance() {
			return currentBalance;
		}

		public void setCurrentBalance(BigDecimal currentBalance) {
			this.currentBalance = currentBalance;
		}

}

