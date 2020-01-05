package sopo.cn.spring5.model;

public class LifeBean {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void initTest() {
		System.out.println("This is init of lifeBean.");
	}
	
	public void destroy() {
		System.out.println("This is destory of lifeBean." + this);
	}
	@Override
	public String toString() {
		return "LifeBean [name=" + name + "]";
	}
}
