package com.spring.springinaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	public static void main(String[] args) {
		ApplicationContext	applicationContext= new ClassPathXmlApplicationContext("springinactionsbeans.xml");
		HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("helloworld");
		helloWorld.say();
	}
	
}
