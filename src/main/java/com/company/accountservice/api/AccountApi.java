package com.company.accountservice.api;

import com.company.accountservice.entity.Account;
import com.company.accountservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountApi {

    private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<Account> save(Account account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<Account> update(Account account) {
        return ResponseEntity.ok(accountService.update(account));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }


}
