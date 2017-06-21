package com.chinasofti.ccl.aoptest;

import org.aspectj.lang.JoinPoint;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月21日上午9:40:34
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */
public class AopAfter {

	public void after(JoinPoint joinPoint) {
		System.out.println("后置通知");
		System.out.println("" + joinPoint.getTarget().getClass().getName());
	}

}
