package com.zx;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

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
	public static String list2XmlString(List<?> list, Class clazz)
	{
		if(list == null || clazz == null )return null;
		
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
		String xml = xstream.toXML(list);
		return xml;
	}
	
	/**
	 * map 集合转为 xml字符串
	 * @param map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static String map2XmlString(Map map)
	{
		if(map == null)return null;
		 
		XStream xstream = new XStream();
		String xml = xstream.toXML(map);
		
		return xml;
	}
	
	/**
	 * 定制bean 转为xml 字符串
	 * 
	 * @param xstream
	 * @param bean
	 * @return
	 */
	public static String custom2XmlString(XStream xstream, Object bean)
	{
		if(xstream == null || bean == null)return null;
		return xstream.toXML(bean);
	}
	
	/**
	 * xml字符串 转为 list集合
	 * 
	 * @param xmlString
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Object xmlString2List(String xmlString, Class clazz)
	{
		if(StringUtils.isEmpty(xmlString) || clazz == null)return null;
		
		XStream xstream = new XStream();
		xstream.processAnnotations(clazz);
		Object obj = xstream.fromXML(xmlString);
		return obj;
	}
	
}
