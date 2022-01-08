package com.example.Aop;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    int num1 = 15;
    int num2= 0;

    public  int add(){
        return  num1+num2;
    }
    public  int  sub(){
        return num1-num2;
    }
    public  void  div() throws  ArithmeticException{

            int div = num1/num2;
            System.out.println("Div" + div);
        }
    public  int multi(){
        return  num1*num2;
    }
    public  void  show(){
        System.out.println("Addition"+add());
        System.out.println("Sub"+sub());
        div();
        System.out.println("Addition"+multi());
    }
}
