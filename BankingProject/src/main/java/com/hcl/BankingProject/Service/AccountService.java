package com.hcl.BankingProject.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.BankingProject.Controller.Request.TransferBalanceRequest;
import com.hcl.BankingProject.Entity.Account;
import com.hcl.BankingProject.Entity.Customer;
import com.hcl.BankingProject.Entity.Transaction;
import com.hcl.BankingProject.dto.model.AccountStatement;


@Service
public interface AccountService {

	public Customer saveUser(Customer customer);
	
    Account save(Account account);

	List<Account> findAll();
//String doTransaction(Transaction transaction);
	Transaction sendMoney(TransferBalanceRequest transferBalanceRequest);

	AccountStatement getStatement(String accountNumber);
}
