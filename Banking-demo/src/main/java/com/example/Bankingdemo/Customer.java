package com.example.Bankingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer {
    String customerName;
  String customerID;
  String address;
    long mobile;
 @Autowired
 Account account;
// public Customer(String name, String ID, int phoneNo, double accountNo ){
//   this.name=name;
//   this.ID=ID;
//   this.phoneNo=phoneNo;
//   this.accountNo=accountNo;
//   }
   public  void setCustomerName(String customerName){
     this.customerName = customerName;

   }
    public  void setCustomerID(String customerID){
        this.customerID = customerID;

    }
    public  void setAddress(String address){
       this.address=address;
    }
    public  void setMobile(long mobile){
       this. mobile = mobile;
    }
//    public  int getAccountNumber(int accountNumber){
//       return  accountNumber;
//    }
    public  void setAccountNumber(int accountNumber){
       this.account.accountNumber=accountNumber;
    }
    public  int getAccountNumber(){
       return account.accountNumber;
     }
    public  void setAccountBalance(double accountBalance){
       this.account.balance= accountBalance;
    }
    public  double getAccountBalance(){
       return  account.balance;
    }
    public  void showCutomerDetails(){
        System.out.println("Customer name:"+customerName);
        System.out.println("Customer ID"+customerID);
        System.out.println("Customer Mobile Number"+mobile);
        System.out.println("Customer Address"+ address);
        System.out.println("Customer Account Number"+ account.getAccountNumber());
        System.out.println("Customer Balance "+account.getBalance());
    }
}
//    Create a Spring Boot application for ABC Bank. using this application, the customers of
//    the bank should be able to access their account details and transfer funds to the other accounts of the same bank. This application should consist of the following entities:
//        Customer: To store information about the customers of the bank
//        Account:To store information about the existing accounts of the bank
//        FundTransfer: To store information about the funds that are transferred from one account to the other.
//        Create the application and inject dependencies in the entities.