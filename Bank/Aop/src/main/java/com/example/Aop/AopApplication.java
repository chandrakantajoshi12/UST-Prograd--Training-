package com.example.Aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
public class AopApplication {

	public static void main(String[] args) {

	ApplicationContext context=  SpringApplication.run(AopApplication.class, args);
	Calculator calculator =context.getBean(Calculator.class);
	calculator.show();
	}

}
