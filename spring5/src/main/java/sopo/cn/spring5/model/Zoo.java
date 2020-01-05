package sopo.cn.spring5.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("zoo")
public class Zoo {
	@Resource(name="tiger")
	private Tiger tiger;
	@Resource(name="monkey")
	private Monkey monkey;
	@Override
	public String toString() {
		return "Zoo [tiger=" + tiger + ", monkey=" + monkey + "]";
	}
}
