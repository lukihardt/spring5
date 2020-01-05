package sopo.cn.spring5.test;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestQuartzJob {
	@Test
	public void run() {
		System.out.println("Hello Quartz! now -> " + new Date());
	}
}
