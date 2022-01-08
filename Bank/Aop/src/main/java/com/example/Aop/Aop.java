package com.example.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
    @Pointcut("execution(public void show())")
    public  void  math(){}

//    @Before("math()")
//    public  void beforePerson(){
//        System.out.println("Name");
//    }
//    @After("math()")
//    public  void afterPerson(){
//        System.out.println("En Operation");
//    }
//
//    @Around("math()")
//    public  void aroundPerson(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        System.out.println("Start");
//        proceedingJoinPoint.proceed();
//        System.out.println("Calculation");
//    }
    @AfterThrowing("execution(public void display())")
    public  void exceptionDiv(){

        System.out.println("divide by zero  Exception");
    }





}
