package org.softcits.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	private static final ObjectMapper MAPPER = new ObjectMapper();

	/**
	 * 
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：将对象转换成JSON格式的String</B><BR>
	 * @param obj
	 * @return
	 */
	public static String objectToJson(Object obj){
		String jsonStr;
		try {
			jsonStr = MAPPER.writeValueAsString(obj);
			return jsonStr;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
