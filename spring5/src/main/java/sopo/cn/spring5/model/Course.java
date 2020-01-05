package sopo.cn.spring5.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Autowired
	private Java java;
	@Autowired
	private Math math;
	public Java getJava() {
		return java;
	}
	public void setJava(Java java) {
		this.java = java;
	}
	public Math getMath() {
		return math;
	}
	public void setMath(Math math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "Course [java=" + java + ", math=" + math + "]";
	}
}
