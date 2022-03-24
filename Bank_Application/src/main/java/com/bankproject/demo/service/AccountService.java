package com.bankproject.demo.service;

import java.util.List;

import com.bankproject.demo.entity.Account;

public interface AccountService {

	Account save(Account account);

	List<Account> findAll();

}

/*public interface AccountService {
List<Account> findAll();
Account save(Account account);
Transaction sendMoney(
        TransferBalanceRequest transferBalanceRequest
);
AccountStatement getStatement(String accountNumber);
}
*/