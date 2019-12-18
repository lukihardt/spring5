package sopo.cn.spring5.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopo.cn.spring5.model.Account;

public class Test20191218 {

	@Test
	public void test1() {
		try( ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			Account account = ctx.getBean(Account.class);
			System.out.println(account.toString());
		}
	}
	
	@Test
	public void test2() {
		try( ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			PropertiesDemo demo = ctx.getBean(PropertiesDemo.class);
			System.out.println(demo.toString());
		}
	}
}
