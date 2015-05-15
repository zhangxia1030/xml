package com.zx;

import org.apache.commons.lang3.StringUtils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class JsonUtil {
	
	/**
	 * bean 转为 json
	 * 
	 * @param bean
	 * @param clazz
	 * @return
	 */
	public static String bean2Json(Object bean, Class clazz)
	{
		if(bean == null || clazz == null)return null;
		
		XStream xstream = new XStream(new JettisonMappedXmlDriver());
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.processAnnotations(clazz);
		String json = xstream.toXML(bean);
		return json;
	}
	
	/**
	 * json 转为 bean
	 * @param <T>
	 * @param jsonStr
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T json2Bean(String jsonStr, Class<T> clazz)
	{
		if(StringUtils.isEmpty(jsonStr) || clazz == null)return null;
		
		XStream xstream = new XStream(new JettisonMappedXmlDriver());
		xstream.processAnnotations(clazz);
		T obj=(T)xstream.fromXML(jsonStr);
		
		return obj;
	}
	
}
