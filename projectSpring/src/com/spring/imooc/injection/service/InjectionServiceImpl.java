package com.spring.imooc.injection.service;

import com.spring.imooc.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {
	
	private InjectionDao injectionDao;
	
	public InjectionServiceImpl() {
		System.out.println("Ĭ�ϵĹ�����");
		// TODO Auto-generated constructor stub
	}
	
	//������ע��
	public InjectionServiceImpl(InjectionDao injectionDao) {
		// TODO Auto-generated constructor stub
		System.out.println("----������ע��----");
		this.injectionDao= injectionDao;
	}
	
	public InjectionDao getInjectionDao() {
		return injectionDao;
	}

	//setע��
	public void setInjectionDao(InjectionDao injectionDao) {
		System.out.println("----setע��----");
		this.injectionDao = injectionDao;
	}

	@Override
	public void save(String args) {
		// TODO Auto-generated method stub
		System.out.println("��ҳ����յ��Ĳ�����"+ args);
		args+= args.hashCode();
		System.out.println("��������ҵ�����"+ args);
		injectionDao.save(args);
	}

}
