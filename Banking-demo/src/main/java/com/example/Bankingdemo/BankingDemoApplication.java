package com.example.Bankingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankingDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BankingDemoApplication.class, args);
       Customer customer1 = context.getBean(Customer.class);
		Customer customer2 = context.getBean(Customer.class);
		context.getBean(Account.class);
		FundTransfer fundTransfer = context.getBean(FundTransfer.class);
		customer1.setCustomerID("100");
		customer1.setCustomerName("Chandrakanta");
		customer1.setAddress("Aadarsh  Nager");
		customer1.setMobile(12213433);
		customer1.setAccountNumber(12345);
		customer1.setAccountBalance(5000);

		customer1.showCutomerDetails();
		fundTransfer.transfer(100,customer1,"withdraw");
		customer2.setCustomerID("101");
		customer2.setCustomerName("Garima");
		customer2.setAddress("Mahakal");
		customer2.setMobile(12323122);
		customer2.setAccountNumber(4567);
		customer2.showCutomerDetails();
		fundTransfer.transfer(100,customer2,"deposit");
	}

}
