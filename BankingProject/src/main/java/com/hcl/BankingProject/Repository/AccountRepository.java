package com.hcl.BankingProject.Repository;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.BankingProject.Entity.Account;
import com.hcl.BankingProject.Entity.Customer;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	Account findByAccountNumberEquals(String accountNumber);

	Customer save(Customer customer);

	@Transactional
	@Modifying
	@Query("update Account set currentBalance=?1 where accountNumber=?2")
	void update(BigDecimal amount, String accountNumber);
}
