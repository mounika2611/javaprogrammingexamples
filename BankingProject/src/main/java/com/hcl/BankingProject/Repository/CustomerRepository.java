package com.hcl.BankingProject.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hcl.BankingProject.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	@Transactional
	@Modifying
	@Query("update Transaction set accountBalance=?1 where accountNumber=?2")
	void updateTransaction(double from_amt, int accountNumber);

}
