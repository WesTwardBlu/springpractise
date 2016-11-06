package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEnvTest {
	@Test
	public void testEnv(){
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-ioc.xml");
		UserDaoImpl userDaoImpl = (UserDaoImpl) context.getBean("userDao");
		UserDaoImpl userDaoImpl2 = (UserDaoImpl) context.getBean("userDao");
		System.out.println("userDaoImpl\t"+ userDaoImpl);
		System.out.println("userDaoImpl2\t"+ userDaoImpl2);
		userDaoImpl.save();
		userDaoImpl2.save();
		
	}
}
