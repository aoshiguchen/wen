package com.wen.framework.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassUtil {
	
	public static List<String> getFields(Class<?> clazz){
		if(null != clazz){
			Field[] fields = clazz.getDeclaredFields();
			List<String> list = new ArrayList<>();
			for(Field item : fields){
				list.add(item.getName());
			}
			
			return list;
		}
		
		return null;
	}
	
	public static Set<String> getFieldNameSet(Class<?> clazz){
		if(null != clazz){
			Field[] fields = clazz.getDeclaredFields();
			Set<String> set = new HashSet<>();
			for(Field item : fields){
				set.add(item.getName());
			}
			
			return set;
		}
		
		return null;
	}
	
	public static Object getFieldValue(Object obj,String fieldName){
		String getMethodName = StringUtil.getGetMethodName(fieldName);
		Object res = null;
		Class<?> clazz = obj.getClass();
		
		try {
			Method method = clazz.getDeclaredMethod(getMethodName);
			res = method.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
}
