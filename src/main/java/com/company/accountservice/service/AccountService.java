package com.company.accountservice.service;

import com.company.accountservice.entity.Account;
import com.company.accountservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    //TEST

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account get(String id) {
        return new Account("test-id");
    }

    public Account save(Account account) {
        return new Account("test-id");
    }

    public Account update(Account account) {
        return new Account("test-id");
    }

    public void delete(String id) {

    }


}
