package sopo.cn.spring5.dao;

public class BaseDao<T> {
	public void add( T entity) {
		System.out.println("传过来的类是: " + entity);
	}
}
