package com.chinasofti.ccl.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ChulinCao E-mail: caochunlin@chinasofti.com
 * @date 2017年6月20日上午11:41:08
 * @version 1.8
 * @since
 * @parameter
 * @PS
 */
@Component
public class People {
	@Value(value = "晓明")
	private String name;
	@Autowired
	private Dog dog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void liugou() {
		System.out.println(name + "牵着" + dog.getName() + "在遛弯儿~");
	}

}
