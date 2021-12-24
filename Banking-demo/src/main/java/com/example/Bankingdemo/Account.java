package com.example.Bankingdemo;

import org.springframework.stereotype.Component;

@Component
public class Account {
    int accountNumber;
    String branch;
    double balance;
    Account(){

    }
    public  double getBalance(){
        return  balance;
    }
    public  int getAccountNumber(){
        return  accountNumber;
    }
    public  double withdrawAmount(double withdrawAmount){
        if(balance>=withdrawAmount){
            balance= balance-withdrawAmount;
        }else
            System.out.println("Insufficient Balance");
        return balance;
    }
    public  double depositeAmount(double depositeAmount){
        balance = balance+depositeAmount;
        return balance;
    }

}
