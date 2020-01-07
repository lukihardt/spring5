package sopo.cn.spring5.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopRunMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AopTest aopTest = (AopTest) context.getBean("aopTestImpl");
		aopTest.add(3, 2);
		aopTest.sub(3, 2);
		// aopTest.errorDiv(3, 0);
		context.close();
	}
}
