package com.spring.imooc;

import java.beans.Beans;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UnitTestBase {
	private ClassPathXmlApplicationContext context;
	private String springXmlPath;
	public UnitTestBase(){}
	public UnitTestBase(String springXmlPath){
		this.springXmlPath= springXmlPath;
	}
	
	@Before
	public void before(){
		if (StringUtils.isEmpty(springXmlPath)) {
			springXmlPath= "classpath*:spring-*.xml";
		}
		try {
			context= new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	@After
	public void after(){
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId){
		try{
			return (T) context.getBean(beanId);
		}catch (BeansException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	protected <T extends Object> T getBean(Class<T> clazz){
		try {
			return context.getBean(clazz);
		} catch (BeansException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
}
