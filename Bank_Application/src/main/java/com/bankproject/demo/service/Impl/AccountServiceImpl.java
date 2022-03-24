package com.bankproject.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankproject.demo.entity.Account;
import com.bankproject.demo.repository.AccountRepository;
import com.bankproject.demo.repository.TransactionRepository;
import com.bankproject.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	

@Autowired
private AccountRepository accountRepository;

@Autowired
TransactionRepository transactionRepository;

	@Override
	public Account save(Account account){
		return    accountRepository.save(account);
	  
	}
	public List<Account> findAll(){
	    return accountRepository.findAll();
	}
	
	public Account findByAccountNumber(String accountNumber){
	    Account account = accountRepository.findByAccountNumberEquals(accountNumber);
	    return account;
	}

}
/*@Service
public class AccountServiceImpl implements AccountService {

@Autowired
private AccountRepository accountRepository;

@Autowired
TransactionRepository transactionRepository;

public Account save(Account account){
    accountRepository.save(account);
    return accountRepository.findByAccountNumberEquals(account.getAccountNumber());
}

public List<Account> findAll(){
    return accountRepository.findAll();
}

public Account findByAccountNumber(String accountNumber){
    Account account = accountRepository.findByAccountNumberEquals(accountNumber);
    return account;
    
    
    
     return accountRepository.findByAccountNumberEquals(account.getAccountNumber());
}*/