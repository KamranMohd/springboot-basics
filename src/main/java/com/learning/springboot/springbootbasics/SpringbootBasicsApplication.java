package com.learning.springboot.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = 
				SpringApplication.run(SpringbootBasicsApplication.class, args);
		
		//	Below block of code prints all the 
		//	auto configuration beans
		/*for (String name : appContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

}
