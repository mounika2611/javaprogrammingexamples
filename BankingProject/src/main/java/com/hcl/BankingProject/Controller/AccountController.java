package com.hcl.BankingProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.BankingProject.Controller.Request.AccountStatementRequest;
import com.hcl.BankingProject.Controller.Request.TransferBalanceRequest;

import com.hcl.BankingProject.Entity.Account;
import com.hcl.BankingProject.Entity.Customer;
import com.hcl.BankingProject.Entity.Transaction;
import com.hcl.BankingProject.Service.AccountService;

import com.hcl.BankingProject.dto.model.AccountStatement;
//import com.hcl.BankingProject.dto.response.Response;


@Component
@RestController
@RequestMapping("/api/account")
public class AccountController {
	
    @Autowired
    private AccountService accountService;
    
    @PostMapping("/customer_registration")
	public Customer saveUser(@RequestBody Customer customer) {
    	return	accountService.saveUser(customer);
			
    }
    
    @PostMapping("/account_creation")
    public List<Account> create(@RequestBody Account account) {
        accountService.save(account);
        return accountService.findAll();
    }
   
    
    @GetMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }
    /*@PostMapping("/transaction")
	public String getBalance(@RequestBody Transaction transaction) {
		return customerService.doTransaction(transaction);
	}*/
    
    @PostMapping("/sendmoney")
    public Transaction sendMoney(@RequestBody TransferBalanceRequest transferBalanceRequest) {

        return accountService.sendMoney( transferBalanceRequest);
                
    }
    @PostMapping("/statement")
  public AccountStatement getStatement(@RequestBody AccountStatementRequest accountStatementRequest){
    	return accountService.getStatement(accountStatementRequest.getAccountNumber());
    }
     
}