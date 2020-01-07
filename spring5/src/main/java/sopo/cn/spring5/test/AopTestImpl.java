package sopo.cn.spring5.test;

import org.springframework.stereotype.Component;

@Component
public class AopTestImpl implements AopTest {

	@Override
	public Integer add(Integer i, Integer j) {
		// TODO Auto-generated method stub
		Integer rs = i + j;
		System.out.println("add result: " + rs);
		return rs;
	}

	@Override
	public Integer sub(Integer i, Integer j) {
		// TODO Auto-generated method stub
		Integer rs = i - j;
		System.out.println("sub result: " + rs);
		return rs;
	}
	@Override
	public Integer errorDiv( Integer i, Integer j) {
		Integer rs = i / j;
		return rs;
	}
}
