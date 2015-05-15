package com.test.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("student")
public class Student {
	
	public Student() {
	}

	public Student(String name, String age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@XStreamAlias("name")
	private String name;
	
	@XStreamAlias("age")
	private String age;
	
	@XStreamAlias("sex")
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
