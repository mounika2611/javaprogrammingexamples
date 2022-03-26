package com.hcl.BankingProject.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
//import java.security.Timestamp;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "transaction")
public class Transaction {
	     @Id
	     @Column(name="transaction_id")
	     @GeneratedValue(strategy=GenerationType.IDENTITY)
	     private Long transactionId;

	     @Column(name="account_number")
	     private String accountNumber;

	     @Column(name="transaction_amount")
	     private BigDecimal transactionAmount;

	     @Column(name="transaction_dateTime")
	     private Timestamp transactionDateTime;

//		public Transaction(long l, String fromAccountNumber, BigDecimal amount, Timestamp localDateTime) {
//			// TODO Auto-generated constructor stub
//		}

		public Transaction(long l, String fromAccountNumber, BigDecimal amount, Timestamp timestamp) {
			// TODO Auto-generated constructor stub
		}

		public Timestamp getTransactionDateTime() {
			return transactionDateTime;
		}

		public void setTransactionDateTime(Timestamp transactionDateTime) {
			this.transactionDateTime = transactionDateTime;
		}

		

		public Long getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(Long transactionId) {
			this.transactionId = transactionId;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public BigDecimal getTransactionAmount() {
			return transactionAmount;
		}

		public void setTransactionAmount(BigDecimal transactionAmount) {
			this.transactionAmount = transactionAmount;
		}

		

		



}


/*@Data
@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue
    private Long transactionId;

    private String accountNumber;

    private BigDecimal transactionAmount;

    private Timestamp transactionDateTime;

}*/