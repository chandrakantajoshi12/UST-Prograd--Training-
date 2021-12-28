package com.example.jpademo.controller;


import com.example.jpademo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpademo.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class JpaController {

   // private StudentRepository repo;
   @Autowired
   private StudentService service;
  @RequestMapping("/")
  public  String home(){
      Student student1 = new Student("Garima","EE",70,19,2929294243l);
        return "Home ";
  }
    @RequestMapping("/create")
    public Student create(HttpServletRequest request) {
        String  name=request.getParameter("name");        //get name from url and phone number
         String phone= request.getParameter("phone");
        //long ph=Long.parseLong(phone);//phone;
        Student student1 = new Student(name,"CSE",80.0f,21,phone);
                 // repo.saveStudent()
        return   service.saveStudent(student1);
        //"Student save";
    }

    @RequestMapping("/list")
    public List<Student> list(){
     return  service.listAll();
     }
     }

