package sopo.cn.spring5.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAopRunMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlAopTest xmlAopTest = (XmlAopTest) context.getBean("xmlAopTest");
		xmlAopTest.add(3, 2);
		xmlAopTest.sub(3, 2);
		// aopTest.errorDiv(3, 0);
		context.close();
	}
}
