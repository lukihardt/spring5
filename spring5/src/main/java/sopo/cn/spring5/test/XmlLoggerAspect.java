package sopo.cn.spring5.test;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class XmlLoggerAspect {
	
	Logger logger = Logger.getLogger(this.getClass());

	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName(); // 拿到方法名
		List<Object> args = Arrays.asList(joinPoint.getArgs()); // 拿到方法参数
		logger.info(methodName + "方法执行之qian前，记录了日志！方法的参数：" + args);
	}

	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName(); // 拿到方法名
		List<Object> args = Arrays.asList(joinPoint.getArgs()); // 拿到方法参数
		logger.info(methodName + "方法执行之hou后，记录了日志！方法的参数：" + args);
	}
	
}
