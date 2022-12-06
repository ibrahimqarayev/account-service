package com.company.accountservice.service;

import com.company.accountservice.entity.Account;
import com.company.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
@RequiredArgsConstructor
@Service
public class AccountService {

    //TEMPLATE SERVICE

    private final AccountRepository accountRepository;

    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(() -> new IllegalStateException());

    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public Account update(String id, Account account) {
        Assert.isNull(id, "id cannot be null");
        return accountRepository.save(account);
    }

    public void delete(String id) {
        accountRepository.deleteById(id);
    }


}
