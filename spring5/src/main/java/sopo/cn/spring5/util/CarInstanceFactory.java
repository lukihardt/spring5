package sopo.cn.spring5.util;

import java.util.HashMap;
import java.util.Map;

import sopo.cn.spring5.model.Car;

public class CarInstanceFactory {
	private Map<Integer, Car> map = new HashMap<>();

	public Map<Integer, Car> getMap() {
		return map;
	}
	
	public Car getCar( Integer id) {
		return map.get(id);
	}

	public void setMap(Map<Integer, Car> map) {
		this.map = map;
	}

	public CarInstanceFactory() {
		super();
	}
}
