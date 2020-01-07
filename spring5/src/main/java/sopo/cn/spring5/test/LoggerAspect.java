package sopo.cn.spring5.test;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	Logger logger = Logger.getLogger(this.getClass());
	
	@Before("execution(public Integer sopo.cn.spring5.test.AopTestImpl.*(Integer, Integer))")
	
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName(); // 拿到方法名
		List<Object> args = Arrays.asList(joinPoint.getArgs()); // 拿到方法参数
		logger.info(methodName + "方法执行之前，记录了日志！方法的参数：" + args);
	}
	@After("execution(public Integer sopo.cn.spring5.test.AopTestImpl.*(Integer, Integer))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName(); // 拿到方法名
		List<Object> args = Arrays.asList(joinPoint.getArgs()); // 拿到方法参数
		logger.info(methodName + "方法执行之后，记录了日志！方法的参数：" + args);
	}
	@AfterReturning(value = "execution(public Integer sopo.cn.spring5.test.AopTestImpl.*(Integer, Integer))", returning="result")
	public void afterReturnMethod(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName(); // 拿到方法名
		List<Object> args = Arrays.asList(joinPoint.getArgs()); // 拿到方法参数
		logger.info(methodName + "方法返回之前，记录了日志！方法的参数：" + args + ", 返回值为：" + result);
	}
	
//  错误的@Around
//	@Around("execution(public Integer sopo.cn.spring5.test.AopTestImpl.*(Integer, Integer))")
//	public void aroundMethod(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().getName(); // 拿到方法名
//		List<Object> args = Arrays.asList(joinPoint.getArgs()); // 拿到方法参数
//		logger.info( " 围绕方法：" + methodName + " 记录了日志！方法的参数：" + args);
//	} ////////////////////////////////////该@Around不对，必须要带参数ProceedingJoinPoint类型的参数
	
	@AfterThrowing( value = "execution( * sopo.cn.spring5.test.AopTestImpl.*(..))", throwing="ex")
	public void throwMethod(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		logger.info( methodName + "方法执行发生了异常，记录日志：方法的参数: " + args + ", 发生异常：" + ex.getMessage());
	}
	
	/*
	@Around("execution( * sopo.cn.spring5.test.AopTestImpl.*(..))")
	public Object aroundMethod(ProceedingJoinPoint pjp) {
		Object rs = null;
		String methodName = pjp.getSignature().getName();
		try {
			logger.info( methodName + "方法执行之前qian执行");
			rs = pjp.proceed();
			logger.info( methodName + "方法执行之后hou执行");
		} catch (Throwable e) {
			// TODO: handle exception
			logger.info( "异常通知，异常：" + e.getMessage());
			throw new RuntimeException(e);
		}
		
		// 返回通知
		logger.info( methodName + "返回通知，返回的值rs = " + rs);
		return rs;
		
	}
	*/
	
}
