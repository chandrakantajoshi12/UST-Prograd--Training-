package com.example.jpademo.entity;

import javax.persistence.*;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@AutoGenerate
    private Long id;
    @Column(nullable = false)
    private String name;//not null
    private String batch;
    private Float marks;
    @Column(nullable = false)
    private Integer age;
    @Column(name = "phoneNumber", nullable = false, unique = true, updatable = false)
    private String phoneNumber;

     public  Student(){}

     public  Student(String name, String batch, float marks,Integer age,String phoneNumber){
    this.name = name;
     this. marks = marks;
     this.age=age;
     this.phoneNumber=phoneNumber;
      }
      public  Long getId(){
     return id;
    }
    public  String getName(){
         return  name;
    }
    public  String getBatch(){
         return  batch;
    }
    public float getMarks(){
         return  marks;
    }
    public  Integer getAge(){
         return  age;
    }
    public  String getPhoneNumber(){
         return  phoneNumber;
    }

}
    //@Column(nullable = false,unique = true,name = "phoneNumber")

