package sopo.cn.spring5.dao;

import org.springframework.stereotype.Repository;

import sopo.cn.spring5.model.User;

@Repository
public class UserDao1 extends BaseDao<User>{

	@Override
	public void add(User entity) {
		// TODO Auto-generated method stub
		super.add(entity);
	}
}
