package com.chinasofti.ccl.aoptest;

import org.aspectj.lang.JoinPoint;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月20日 下午7:10:30
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */
public class AopBefore {

	public void before(JoinPoint joinPoint) {
		System.out.println("开始执行前置通知");
		// System.out.println("获取目标函数参数方式" + joinPoint.getArgs()[0]);
		System.out.println("获取目标对象" + joinPoint.getTarget().getClass().getName());
		System.out.println("获取目标函数的java反射对象" + joinPoint.getSignature());
		System.out.println("前置通知执行结束");
	}

}
