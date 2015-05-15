package com.test.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.converter.MyConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

//@XStreamAlias 别名
@XStreamAlias("root")
public class XAnnoations {
	
	//给name 起个别名
	@XStreamAlias("name")
	private String name;
	
	//studentName 作为属性添加到root相当于<root age="">
    @XStreamAsAttribute
    private String age;
    
    //@XStreamImplicit 集合注解
    // 隐式集合，加上这个注解可以去掉book集合最外面的<list></list>这样的标记
    @XStreamImplicit
    private List<Student> notes = new ArrayList<Student>();
    
    //@XStreamOmitField 忽略字段
    @XStreamOmitField
    private int type;
    
    //转换器
    @XStreamConverter(MyConverter.class)
    private Calendar created = new GregorianCalendar();

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

	public List<Student> getNotes() {
		return notes;
	}

	public void setNotes(List<Student> notes) {
		this.notes = notes;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}
    
}
