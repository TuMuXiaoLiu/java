package com.chinasofti.ccl.aoptest;

import org.aspectj.lang.JoinPoint;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月21日上午10:22:16
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */
public class AopThrowable {

	public void throwable(JoinPoint joinPoint, Throwable e) {
		System.out.println("开始执行异常通知");
		System.out.println("异常信息为:" + e.getMessage());
		System.out.println("获取目标对象" + joinPoint.getTarget().getClass().getName());
		System.out.println("获取目标函数的java反射对象" + joinPoint.getSignature());
		System.out.println("异常通知执行结束");
	}

}
