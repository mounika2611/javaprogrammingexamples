package com.bankproject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankproject.demo.entity.Account;
import com.bankproject.demo.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
    @Autowired
    private AccountService accountService;
    
    
    @RequestMapping("/create")
    public List<Account> create(@RequestBody Account account) {
        accountService.save(account);
        return accountService.findAll();
    }

    @RequestMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }
    
    
//
//    @RequestMapping("/sendmoney")
//    public Response sendMoney(
//            @RequestBody TransferBalanceRequest transferBalanceRequest
//            ) {
//
//        return Response.ok().setPayload(
//                accountService.sendMoney(
//                        transferBalanceRequest
//                )
//        );
//    }
//    @RequestMapping("/statement")
//    public Response getStatement(
//            @RequestBody AccountStatementRequest accountStatementRequest
//
//    ){
//        return Response.ok().setPayload(
//                accountService.getStatement(accountStatementRequest.getAccountNumber())
//        );
//
//    }

}
