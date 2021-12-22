package com.example.Calculator;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);

	     Calculator	calculator = context.getBean(Calculator.class);
		double add = calculator.addition();
		System.out.println(add);
	}

}
