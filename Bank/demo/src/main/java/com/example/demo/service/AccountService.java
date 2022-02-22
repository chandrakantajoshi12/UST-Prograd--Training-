package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  AccountService {
    @Autowired
    private AccountRepository accountRepository;


    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
    public List<Account> accountList(){
        return  accountRepository.findAll();
    }
    public  Boolean  existAccount(String accountId){
        return  accountRepository.existsById(" accountId");
    }
     public Account getById(String  id){
        return  accountRepository.findById(id).get();
     }
}
