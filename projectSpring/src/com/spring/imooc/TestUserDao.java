package com.spring.imooc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.spring.UserDao;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestUserDao extends UnitTestBase{
	
	public TestUserDao() {
		// TODO Auto-generated constructor stub
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testUserDao(){
		UserDao userDao= super.getBean("userDao");
		userDao.save();
	}
}
