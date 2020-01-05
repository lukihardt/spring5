package sopo.cn.spring5.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestCat {
	@Autowired
	@Qualifier("panthera")
	private Cat cat;

	@Override
	public String toString() {
		return "TestCat [cat=" + cat + "]";
	}

	public Cat getCat() {
		return cat;
	}
	
}
