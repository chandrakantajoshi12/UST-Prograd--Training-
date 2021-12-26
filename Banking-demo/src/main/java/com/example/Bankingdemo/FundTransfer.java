package com.example.Bankingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FundTransfer {
    @Autowired
    Account afterTransactionBalance;
    public  void transfer(double transerAmount,@Autowired Customer customerAmount,String withdrawalOrDeposite){
        switch (withdrawalOrDeposite){
            case "withdrawal":{double balance = afterTransactionBalance.withdrawAmount(transerAmount);
                customerAmount.setAccountBalance(balance);
                System.out.println("After Amount withdraw"+ balance);}
             break;
            case"deposit ": double balance= afterTransactionBalance.depositeAmount(transerAmount);
            customerAmount.setAccountBalance(balance);
                System.out.println("After Amount deposit"+balance);
        }
    }
}
//    To avail online services of the bank, the customers have to log in to the website by using their
//        username and password. After the customers successfully log into the website,
//        they can view their account details on the user account page