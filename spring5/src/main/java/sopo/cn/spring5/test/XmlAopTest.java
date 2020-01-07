package sopo.cn.spring5.test;

import org.springframework.stereotype.Component;

@Component
public class XmlAopTest {
	
	public Integer add(Integer i, Integer j) {
		// TODO Auto-generated method stub
		Integer rs = i + j;
		System.out.println("add result: " + rs);
		return rs;
	}

	public Integer sub(Integer i, Integer j) {
		// TODO Auto-generated method stub
		Integer rs = i - j;
		System.out.println("sub result: " + rs);
		return rs;
	}
	
}
