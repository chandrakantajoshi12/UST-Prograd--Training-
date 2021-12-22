//Create a simple spring boot application using spring intializr
// and display the count of beans defined in
//		the factory and to display the name of all the beans in the factory

package com.example.HelloUst;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Annotation;

@SpringBootApplication
  public class HelloUstApplication implements ApplicationRunner {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloUstApplication.class, args);
     	//System.out.println(context);
		//SpringApplication.Mapping("/");
//		ApplicationContext context = SpringApplication.run(HelloUstApplication.class, args);
//	context.getBeans(Annotation. class,args);
		//System.out.println("Hello Ust ");
	}

//	void run(ApplicationArguments) throws Exception;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(args);
	}
}
//	@Override
//	public  void  run(){
//		System.out.println("Command Line Runner");
//	}

//


//


//	Annotations in spring
//		Beans
//	Create a simple spring boot application using spring intializr and display the count of beans defined in the
//	factory and to display the name of all the beans in the factory