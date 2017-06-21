package com.chinasofti.ccl.aoptest;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月21日上午10:47:16
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */
public class AopAround {

	public void around(ProceedingJoinPoint joinPoint) {
		System.out.println("环绕通知的前置通知");

		try {
			// 运行目标组件
			joinPoint.proceed();
			System.out.println("环绕通知中的后置通知");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("环绕通知中的异常通知");
		}
		System.out.println("环绕通知中的最终通知");
	}

}
