package sopo.cn.spring5.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopo.cn.spring5.service.UserService;

public class TestGenericityAnno {
	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService) ctx.getBean("userService");
		service.add();
		service.useDaoAdd();
		ctx.close();
	}
}
