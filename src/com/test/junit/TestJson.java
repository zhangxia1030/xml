package com.test.junit;

import org.junit.Test;

import com.test.bean.Student;
import com.zx.JsonUtil;


public class TestJson {
	
	@Test
	public void testBean2Json()
	{
		Student st = new Student("zs","100","女");
		System.out.println(JsonUtil.bean2Json(st, Student.class));
	}
	
	@Test
	public void testJson2Bean()
	{
		String json = "{\"student\":{\"name\":\"zs\",\"age\":100,\"sex\":\"女\"}}";
		Student s = JsonUtil.json2Bean(json, Student.class);
		System.out.println(s.toString());
	}
	
}
