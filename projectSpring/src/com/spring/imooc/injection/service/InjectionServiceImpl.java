package com.spring.imooc.injection.service;

import com.spring.imooc.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {
	
	private InjectionDao injectionDao;
	
	public InjectionServiceImpl() {
		System.out.println("默认的构造器");
		// TODO Auto-generated constructor stub
	}
	
	//构造器注入
	public InjectionServiceImpl(InjectionDao injectionDao) {
		// TODO Auto-generated constructor stub
		System.out.println("----构造器注入----");
		this.injectionDao= injectionDao;
	}
	
	public InjectionDao getInjectionDao() {
		return injectionDao;
	}

	//set注入
	public void setInjectionDao(InjectionDao injectionDao) {
		System.out.println("----set注入----");
		this.injectionDao = injectionDao;
	}

	@Override
	public void save(String args) {
		// TODO Auto-generated method stub
		System.out.println("从页面接收到的参数："+ args);
		args+= args.hashCode();
		System.out.println("参数经过业务处理后："+ args);
		injectionDao.save(args);
	}

}
