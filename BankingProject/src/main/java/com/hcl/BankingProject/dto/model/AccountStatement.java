package com.hcl.BankingProject.dto.model;

import java.math.BigDecimal;
import java.util.List;

import com.hcl.BankingProject.Entity.Transaction;

public class AccountStatement {
	
	public AccountStatement(BigDecimal currentBalance2, List<Transaction> findByAccountNumberEquals) {
//		// TODO Auto-generated constructor stub
	}
	BigDecimal currentBalance;
    List<Transaction> transactionHistory;

}
/*@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountStatement {
    BigDecimal currentBalance;
    List<Transaction> transactionHistory;
}*/