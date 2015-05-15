package com.test.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.test.bean.Student;
import com.zx.XmlUtil;

public class TestBean2Xml {
	
	@Test
	public void testBean2xml() {
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student("qq", "12", "男");
		Student s1 = new Student("ww", "31", "男");
		Student s2 = new Student("ee", "15", "女");
		Student s3 = new Student("rr", "57", "男");
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//System.out.println(XmlUtil.bean2XmlString(s, s.getClass()));
	}
	
	@Test
	public void testList2xml() {
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student("qq", "12", "男");
		Student s1 = new Student("ww", "31", "男");
		Student s2 = new Student("ee", "15", "女");
		Student s3 = new Student("rr", "57", "男");
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//System.out.println(XmlUtil.list2XmlString(list, Student.class, "students"));
	}
	
	
}
