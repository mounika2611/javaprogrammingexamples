package com.bankproject.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
    private Long accountId;

   private String accountNumber;

   private BigDecimal currentBalance;



public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

	

	

}

/*@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
    private Long accountId;

    String accountNumber;

    BigDecimal currentBalance;

}*/