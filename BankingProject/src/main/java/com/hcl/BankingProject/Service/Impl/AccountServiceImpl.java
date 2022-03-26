package com.hcl.BankingProject.Service.Impl;



import java.math.BigDecimal;
import java.sql.Timestamp;
//import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.hcl.BankingProject.Controller.Request.TransferBalanceRequest;
import com.hcl.BankingProject.Entity.Account;
import com.hcl.BankingProject.Entity.Customer;
import com.hcl.BankingProject.Entity.Transaction;
import com.hcl.BankingProject.Repository.AccountRepository;
import com.hcl.BankingProject.Repository.TransactionRepository;
import com.hcl.BankingProject.Service.AccountService;
import com.hcl.BankingProject.dto.model.AccountStatement;

@Component
public class AccountServiceImpl implements AccountService{
	
	@Autowired
    private AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;

	@Override
	public Account save(Account account) {
	        accountRepository.save(account);
	        return accountRepository.findByAccountNumberEquals(account.getAccountNumber());
	    }

	@Override
	public List<Account> findAll() {
		
		return accountRepository.findAll();
	}

	@Override
	public Customer saveUser(Customer customer) {
		// TODO Auto-generated method stub
		return accountRepository.save(customer);
	}
	@Override
    public Transaction sendMoney(TransferBalanceRequest transferBalanceRequest)
     {
        String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
       
        String toAccountNumber = transferBalanceRequest.getToAccountNumber();
        BigDecimal amount = transferBalanceRequest.getAmount();
        Account fromAccount = accountRepository.findByAccountNumberEquals(fromAccountNumber);
        Account toAccount = accountRepository.findByAccountNumberEquals(toAccountNumber);
        if(fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1
                && fromAccount.getCurrentBalance().compareTo(amount) == 1)
        {
            fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
            accountRepository.save(fromAccount);
            toAccount.setCurrentBalance(toAccount.getCurrentBalance().add(amount));
            accountRepository.save(toAccount);
            
           // System.out.println("fromAccountNumber "+fromAccountNumber+"\namount"+amount+"\ntransactionDateTime"+transactionDateTime);
            
         
            Transaction transaction = transactionRepository.save(new Transaction(0L,fromAccountNumber,amount,new Timestamp(System.currentTimeMillis()) ));
            return transaction; 
          
//            Transaction transaction= transactionRepository.getTransactions(fromAccountNumber,amount, transactionDateTime);
////           // return transactionRepository.save(transferBalanceRequest); new Timestamp(System.currentTimeMillis())
//          return transaction;
           
        }
        return null;
    }

    @Override
    public AccountStatement getStatement(String accountNumber) {
    	Account account = accountRepository.findByAccountNumberEquals(accountNumber);
        return new AccountStatement(account.getCurrentBalance(),transactionRepository.findByAccountNumberEquals(accountNumber));
    }

}

