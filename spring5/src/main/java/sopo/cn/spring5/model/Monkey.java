package sopo.cn.spring5.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey {
	@Value("mk1")
	private String monkeyName;

	@Override
	public String toString() {
		return "Monkey [monkeyName=" + monkeyName + "]";
	}
	
}
