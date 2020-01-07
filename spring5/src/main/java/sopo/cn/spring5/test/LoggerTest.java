package sopo.cn.spring5.test;

import org.apache.log4j.Logger;

public class LoggerTest {
	private Logger logger = Logger.getLogger(this.getClass());
	
	public static void main(String[] args) {
		new LoggerTest().add( 3, 2);
		new LoggerTest().sub( 3, 2);
	}
	
	public int add( int i, int j) {
		logger.info("add方法执行之前，记录了日志!");
		int rs = i + j;
		logger.info("add方法执行之后，记录了日志!");
		return rs;
	}
	
	public int sub( int i, int j) {
		logger.info("sub方法执行之前，记录了日志!");
		int rs = i - j;
		logger.info("sub方法执行之前，记录了日志!");
		return rs;
	}
}
