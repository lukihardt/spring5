package sopo.cn.spring5.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopo.cn.spring5.model.Course;
import sopo.cn.spring5.model.TestCat;
import sopo.cn.spring5.model.Zoo;

public class TestAnnotation {
	
	@Test
	public void test() {
		Zoo zoo = new Zoo();
		System.out.println(zoo);
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Zoo zoo2 = (Zoo) ctx.getBean("zoo");
		System.out.println(zoo2);
		ctx.close();
	}
	@Test
	public void testCourse() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course = (Course) ctx.getBean("course"); 
		System.out.println(course);
		ctx.close();
	}
	@Test
	public void testCat() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestCat tcat = (TestCat) ctx.getBean("testCat");
		System.out.println(tcat.getCat().catName());
		ctx.close();
	}
}
