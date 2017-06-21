package com.chinasofti.ccl.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月21日上午9:40:34
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */

// @Component
// @Aspect
public class AopAfter {

	// @After("execution(* com.chinasofti.ccl.entity.People.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("开始执行后置通知");
		// System.out.println("获取目标函数参数方式" + joinPoint.getArgs()[0]);
		System.out.println("获取目标对象" + joinPoint.getTarget().getClass().getName());
		System.out.println("获取目标函数的java反射对象" + joinPoint.getSignature());
		System.out.println("后置通知执行结束");
	}

}
