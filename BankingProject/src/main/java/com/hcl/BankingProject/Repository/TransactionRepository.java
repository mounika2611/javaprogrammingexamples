package com.hcl.BankingProject.Repository;

import java.math.BigDecimal;
import java.security.Timestamp;
//import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.BankingProject.Controller.Request.TransferBalanceRequest;
import com.hcl.BankingProject.Entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	List<Transaction> findByAccountNumberEquals(String accountNumber);

	
	
//	@Transactional
//	@Query("from Transaction where accountNumber = :fromAccountNumber and transactionAmount = :amount and transactionDateTime = :transactionDateTime")
//	Transaction getTransactions(String fromAccountNumber, BigDecimal amount, Timestamp transactionDateTime);



	

}




//	@Query("from Transaction where accountNumber = :fromAccountNumber and transactionAmount = :amount and transactionDateTime = :transactionDateTime")
// public List<Transaction> getTransactionDetails(String fromAccountNumber,String toAccountNumber,BigDecimal amount,Timestamp transactionDateTime);


//@Query("from Transaction where (from_account=?1 AND (date <= ?2 AND date >= ?3)) OR (to_account=?1 AND (date <= ?2 AND date >= ?3))")