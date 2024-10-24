package com.expenseapplication.expenseapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expenseapplication.expenseapp.Dto.AccountDTO;
import com.expenseapplication.expenseapp.Entity.Account;
import com.expenseapplication.expenseapp.Service.AccountService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @PostMapping("/create/{userId}")
    public ResponseEntity<Account> createAccount(@PathVariable Long userId,@RequestBody AccountDTO accountDTO) {
        Account newAccount = accountService.createAccount(userId,accountDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAccount); // 201 Created
    }
    
    
}
