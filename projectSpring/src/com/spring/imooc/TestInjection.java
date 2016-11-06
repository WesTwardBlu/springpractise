package com.spring.imooc;

import org.junit.Test;

import com.spring.imooc.injection.service.InjectionService;

public class TestInjection extends UnitTestBase{
	public TestInjection() {
		// TODO Auto-generated constructor stub
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testSetter(){
		InjectionService injectionService= super.getBean("injectionService");//已经强制转型过了，所以这里不再转型
		injectionService.save("name");
	} 
	
	@Test
	public void testConstru(){
		InjectionService injectionService= super.getBean("injectionService");
		injectionService.save("age");
	}
}
