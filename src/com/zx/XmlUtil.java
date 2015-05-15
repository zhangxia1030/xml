package com.zx;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.test.bean.Student;
import com.thoughtworks.xstream.XStream;

public class XmlUtil {
	
	/**
	 * xml字符串转换为bean
	 * @param <T>
	 * @param xmlStr xml字符串
	 * @param cls bean类型
	 * @return bean
	 */
	@SuppressWarnings("unchecked")
	public static <T> T xmlString2Bean(String xmlStr, Class<T> clazz)
	{
		if(StringUtils.isEmpty(xmlStr) || clazz == null)
		{
			return null;
		}
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
        T obj=(T)xstream.fromXML(xmlStr);
        return obj;
	}
	
	/**
	 * bean 转为 xml字符串
	 * @param bean
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static String bean2XmlString(Object bean, Class clazz)
	{
		if(bean == null)return null;
		
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
		String xml = xstream.toXML(bean);
		return xml;
	}
	
	/**
	 * list集合转为xml字符串
	 * 
	 * @param list
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static String list2XmlString(List<?> list, Class clazz, String root)
	{
		if(list == null || clazz == null || StringUtils.isEmpty(root))return null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("<"+root+">").append("\n");
		for(Object bean : list)
		{
			sb.append(bean2XmlString(bean, clazz));
		}
		sb.append("\n").append("</"+root+">");
		
		return sb.toString();
	}
	
}
