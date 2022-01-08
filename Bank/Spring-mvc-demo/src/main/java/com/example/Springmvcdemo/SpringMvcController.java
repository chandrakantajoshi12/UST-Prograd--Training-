package com.example.Springmvcdemo;//import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;

    @Controller
   public class SpringMvcController {

        @RequestMapping("/reg")
        public String register() {
            System.out.println("Hello World");
            return "register";
        }


        @PostMapping("/details")
        @ResponseBody
        public String details(Model model, HttpServletRequest request) {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            model.addAttribute("name", name);
            model.addAttribute("password", password);
            model.addAttribute("email", email);
            return "details";
        }

    }
//    public String index() {
//        return "home";
//    }
//    @RequestMapping("/add")
//    public  String add(){
//        return "add";
//    }
//    @RequestMapping("/result")
//    public String result(Module model ,HttpServletRequest req){
//        String n1 = req.getParameter("n1", n1);
//        String n2 = req.getParameter("n2", n2);
//        int  = n1+n2;
//        model.addAttribute(result);
//        return  "Result";
//    }

    //    @RequestMapping("/result")
//    public  String res(Module module, HttpServletRequest req){
//        int n1 = Integer.parseInt(req.getParameter("res"));
//        int n2 = Integer.parseInt("res");
//        int res = n1+n2;
//        module.addAttribute(res);
//        return  "result";
//    }
//     @RequestMapping("/")
//     public String index(){
//         return "home";
//     }
// this is reciever it in post request


// Restful ApI
//    ---> Get- Read
 // http header , more
 // --->Post- CREATE
// --> PUT/PATCH- update
//--->DETAIL -delete
//}
