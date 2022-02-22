package com.example.demo.Controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;
import com.example.demo.service.AccountService;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "Login";
    }

    @RequestMapping("/register")
    public String register() {
        return "registration";
    }

     /*@RequestMapping("/details")
     public  String details(){
        return  "details";
     }*/
    @RequestMapping("/customerList")
    @ResponseBody
    public List<Customer> customerList() {
        return customerService.customerList();
    }
    @PostMapping("/register")
    public String register(Model model, HttpServletRequest request) {
        String customerId = request.getParameter("ID");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String phone = request.getParameter("phone");
        String aadharNumber = request.getParameter("aadharNumber");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Account account = accountService.saveAccount(new Account("Ujjain",0.0));
         Customer customer = new Customer(Long.parseLong(customerId), name, address, city, Long.parseLong(phone),Long.parseLong(aadharNumber), email, password);
          customer.setAccount(account);
         customerService.saveCustomer(customer);
        model.addAttribute("message","Registration Successfully");
        System.out.println(customer.getAccount().getId());
        return "registration";

    }


 @PostMapping("/details")
    public  String details(HttpServletRequest request ,Model model){
     String id  = request.getParameter("ID");
     String  password = request.getParameter("password");
     System.out.println(request.getParameter("ID"));
     Customer customer ;
      Account account;
     Long ID = Long.parseLong(id);
     if(customerService.existsById(ID)){
         customer = customerService.findById(ID);
         if(password.equals(customer.getPassword())){
             model.addAttribute("message","Login Successfully");
            model.addAttribute("name",customer.getName());

            model.addAttribute("address", customer.getAddress());
            model.addAttribute("customerId",customer.getId());
            model.addAttribute("city",customer.getCity());
             model.addAttribute("phone",customer.getPhone());
             model.addAttribute("aadharNumber",customer.getAadharNumber());
             model.addAttribute("id",customer.getAccount().getId());
            model.addAttribute("balance",customer.getAccount().getBalance());
             model.addAttribute("branch",customer.getAccount().getBranch());
             model.addAttribute("email",customer.getEmail());

         }
         else {
             model.addAttribute("message","Invalid Password");
           return  "Login";
         }
         return  "details";
     }

    return  "details";
 }

  @RequestMapping("/updateProfile/{id}")
  public String updateCustomerForm(@PathVariable Long id, Model model) {
      model.addAttribute("customer", customerService.findById(id));

        return  "updateProfile";

  }
    @GetMapping("/deposit/{accountId}")
    public String depositForm(@PathVariable String accountId, Model model) {
        model.addAttribute("accountId", accountId);
        return "deposite";
    }

    @PostMapping("/deposit/{accountId}")
    public String deposit(@PathVariable String accountId, HttpServletRequest request, Model model) {
        Account account = accountService.getById(accountId);
        Double amount = Double.parseDouble(request.getParameter("amount"));
        account.depositeAmount(amount);
        accountService.saveAccount(account);
        model.addAttribute("message", "Deposited successfully");
        return "deposite";
    }

    // withdraw
    @GetMapping("/withdraw/{accountId}")
    public String withdrawForm(@PathVariable String accountId, Model model) {
        model.addAttribute("accountNumber", accountId);
        return "withdraw";
    }

    @PostMapping("/withdraw/{accountId}")
    public String withdraw(@PathVariable String accountId, HttpServletRequest request, Model model) {
        Double amount = Double.parseDouble(request.getParameter("amount"));
        Account account = accountService.getById(accountId);
        if (account.getBalance() <= amount) {
            model.addAttribute("message", "insufficient Amount");
        } else {
            account.withdrawAmount(amount);
            accountService.saveAccount(account);
            model.addAttribute("message", "Withdraw successfully");
        }
        return "withdraw";
    }

   @GetMapping("/fundTransfer/{accountId}")
    public  String fundTransferForm(@PathVariable String accountId , Model model){
        model.addAttribute("accountId",accountId);
        return  "fundTransfer";
   }

   @PostMapping("/fundTransfer/{accountId}")
    public  String fundTransfer(@PathVariable String accountId ,HttpServletRequest request, Model model){
        String toAccount= request.getParameter("toAccount");
        Double amount = Double.parseDouble(request.getParameter("amount"));
        if(accountService.existAccount(toAccount)){
            Account account = accountService.getById(accountId);
            Account account2 = accountService.getById(toAccount);
            if(account.getBalance()<= amount){
                model.addAttribute("message","Insufficient Amount ");
            }
            else {
                account.withdrawAmount(amount);
                account2.depositeAmount(amount);
                accountService.saveAccount(account);
                accountService.saveAccount(account2);
                model.addAttribute("message", "Transaction Successfully");
            }
        }
        else  {
            model.addAttribute("message", "Invalid Account ");
        }
        return  "fundTransfer";
   }
    //Deposit

    }

//    //Fund Transfer
//    @GetMapping("/fundTransfer/{accountNumber}")
//    public String fundTransferForm(@PathVariable String accountid, Model model) {
//        model.addAttribute("accountNumber", accountid);
//        return "fundTransfer";
//    }




