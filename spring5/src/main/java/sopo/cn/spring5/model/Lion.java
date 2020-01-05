package sopo.cn.spring5.model;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Cat {

	@Override
	public String catName() {
		// TODO Auto-generated method stub
		return "狮";
	}
	
}
