package sopo.cn.spring5.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopo.cn.spring5.dao.UserDaoImpl;
import sopo.cn.spring5.model.User;

public class UserServiceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			User user = ctx.getBean(User.class);
			System.out.println(user);
			
			UserDaoImpl daoImpl = ctx.getBean(UserDaoImpl.class); 
			daoImpl.add();
		}
	}

}
