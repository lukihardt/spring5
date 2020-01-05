package sopo.cn.spring5.util;

import org.springframework.beans.factory.FactoryBean;

import sopo.cn.spring5.model.Car;

public class CarFactoryBean implements FactoryBean<Car>{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car( 1, "volvo", 300000);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
