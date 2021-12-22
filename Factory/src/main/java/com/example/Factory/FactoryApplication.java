package com.example.Factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FactoryApplication{


	public static void main(String[] args) {
    ConfigurableApplicationContext context =SpringApplication.run(FactoryApplication.class, args);

		int count= context.getBeanDefinitionCount();

		String[] name = context.getBeanDefinitionNames();
		System.out.println(count);
		for(String names : name){
			System.out.println(names);
		}
	}





}
