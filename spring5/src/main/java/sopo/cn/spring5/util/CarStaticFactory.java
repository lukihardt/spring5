package sopo.cn.spring5.util;

import java.util.HashMap;
import java.util.Map;

import sopo.cn.spring5.model.Car;

public class CarStaticFactory {
	private static Map<Integer, Car> map = new HashMap<>();
	
	static {
		map.put( 1, new Car( 1, "honda", 300000));
		map.put( 2, new Car( 2, "audi", 500000));
		map.put( 3, new Car( 3, "bmw", 700000));
	}
	
	public static Car getCar( int id) {
		return map.get(id);
	}
}
