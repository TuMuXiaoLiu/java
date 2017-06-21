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
		System.out.println(11);
		System.out.println(joinPoint.getTarget().getClass().getName());
	}

}
