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
		InjectionService injectionService= super.getBean("injectionService");//�Ѿ�ǿ��ת�͹��ˣ��������ﲻ��ת��
		injectionService.save("name");
	} 
	
	@Test
	public void testConstru(){
		InjectionService injectionService= super.getBean("injectionService");
		injectionService.save("age");
	}
}
