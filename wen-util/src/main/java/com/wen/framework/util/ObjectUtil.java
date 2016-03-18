package com.wen.framework.util;

import java.util.HashSet;
import java.util.Set;

public class ObjectUtil {
	
	public static <T> Set<T> arrayToSet(T[] array){
		
		Set<T> res= new HashSet<T>();
		
		for(T item : array){
			res.add(item);
		}
		
		return res;
	}
	
}
