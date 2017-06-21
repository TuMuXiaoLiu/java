package com.chinasofti.ccl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasofti.ccl.entity.People;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月20日上午9:32:52
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */
public class Test {

	@org.junit.Test()
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/chinasofti/ccl/test/application.xml");
		People people = (People) applicationContext.getBean("people");
		people.liugou();
	}

}
