package com.bankproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankproject.demo.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	
	Account findByAccountNumberEquals(String accountNumber);
	
	

}

/*@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
Account findByAccountNumberEquals(String accountNumber);

}*/