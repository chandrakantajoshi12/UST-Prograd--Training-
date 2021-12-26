package com.example.Bankingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BankingDemoApplicationController {
   @Autowired
   Customer customer;

   @RequestMapping("/")
   public String login(){
      return "login";
   }

  @RequestMapping("/details")
   public  String details(Model model , HttpServletRequest request) {
     String username = request.getParameter("name");
     String password = request.getParameter("password");
     if (username.equals("Chandrakanta") && password.equals("@1234")) ;
     {
        customer.setCustomerName("Chandrakanta");
        customer.setCustomerID("1234");
        customer.setMobile(12365666);
        customer.setAddress("Aadarsh Nager");
        customer.setAccountNumber(1234123);
        customer.setAccountBalance(5000);
        System.out.println(customer);
        model.addAttribute("name",customer.getCustomerName());
        model.addAttribute("ID",customer.getCustomerID());
        model.addAttribute("mobile",customer.getMobile());
        model.addAttribute("address",customer.getAddress());
        model.addAttribute("balance",customer.getAccountBalance());
        model.addAttribute("number",customer.getAccountNumber());
     }
     return "details";
  }

   }
