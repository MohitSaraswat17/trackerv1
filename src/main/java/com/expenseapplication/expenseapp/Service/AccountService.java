package com.expenseapplication.expenseapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseapplication.expenseapp.Dto.AccountDTO;
import com.expenseapplication.expenseapp.Entity.Account;
import com.expenseapplication.expenseapp.Entity.User;
import com.expenseapplication.expenseapp.Repository.AccountRepository;
import com.expenseapplication.expenseapp.Repository.UserRepository;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserRepository userRepository;

    public Account createAccount(Long userId,AccountDTO accountDTO){
        Account account = new Account();
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        account.setUser(user);
        account.setAccountName(accountDTO.getAccountName());
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setIfscCode(accountDTO.getIfscCode());
        account.setAccountType(accountDTO.getAccountType());

        return accountRepository.save(account);


    }
}
