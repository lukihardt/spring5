package sopo.cn.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;

import sopo.cn.spring5.dao.BaseDao;

public class BaseService<T> {
	T t;
	@Autowired
	protected BaseDao<T> baseDao;
	
	public void add() {
		System.out.println( "BaseService里的add方法： " + baseDao);
		
	}
}
