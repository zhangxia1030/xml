package com.test.junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.test.bean.Student;
import com.thoughtworks.xstream.XStream;
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
		
		//System.out.println(XmlUtil.list2XmlString(list, Student.class));
		
		String xml = XmlUtil.list2XmlString(list, Student.class);
		
		XStream xs = new XStream();
		xs.processAnnotations(Student.class);
		Object obj = xs.fromXML(xml);
		System.out.println(obj);
	}
	
	@Test
	public void testMap2Xml()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student("qq", "12", "男");
		Student s1 = new Student("ww", "31", "男");
		Student s2 = new Student("ee", "15", "女");
		Student s3 = new Student("rr", "57", "男");
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		map.put("class", "2年级");
		map.put("school", "2中");
		map.put("student", list);
		
		System.out.println(XmlUtil.map2XmlString(map));
	}
	
	
}
