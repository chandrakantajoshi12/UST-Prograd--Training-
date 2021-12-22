package com.example.HelloUst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class  HelloUstController{

        @RequestMapping("/")
        public  String helloWorld(){
            return  "Hello From Spring Boot";
        }
        @RequestMapping("/about")
        public  String  Hello(){
            return  "Hello From Spring Boot about";
        }
    }

