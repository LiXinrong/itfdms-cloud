package com.itfdms.common.core.kit;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.cglib.beans.BeanMap;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

public class BeanKit {

	/**
	 * 根据class获取泛型类型
	 */
	public static Class<?> getT(Class<?> clazz, int index) {
		ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();
		return (Class<?>) pt.getActualTypeArguments()[index];
	}

	/**
	 * 根据class获取泛型类型
	 */
	public static Class<?> getT(Class<?> clazz) {
		ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();
		return (Class<?>) pt.getActualTypeArguments()[0];
	}

	/**
	 * bean转map
	 */
	public static <T> Map<String, Object> beanToMap(T bean) {
		Map<String, Object> map = Maps.newHashMap();
		if (bean != null) {
			BeanMap beanMap = BeanMap.create(bean);
			for (Object key : beanMap.keySet()) {
				map.put(key + "", beanMap.get(key));
			}
		}
		return map;
	}

	/**
	 * map转bean
	 */
	public static <T> T mapToBean(Map<String, Object> map, T bean) {
		BeanMap beanMap = BeanMap.create(bean);
		beanMap.putAll(map);
		return bean;
	}

	/**
	 * beans转 maps
	 */
	public static <T> List<Map<String, Object>> beansToMaps(List<T> objList) {
		List<Map<String, Object>> list = Lists.newArrayList();
		if (objList != null && objList.size() > 0) {
			Map<String, Object> map = null;
			T bean = null;
			for (int i = 0, size = objList.size(); i < size; i++) {
				bean = objList.get(i);
				map = beanToMap(bean);
				list.add(map);
			}
		}
		return list;
	}

	/**
	 * maps转 beans
	 */
	public static <T> List<T> mapsToBeans(List<Map<String, Object>> maps, Class<T> clazz)
			throws InstantiationException, IllegalAccessException {
		List<T> list = Lists.newArrayList();
		if (maps != null && maps.size() > 0) {
			Map<String, Object> map = null;
			T bean = null;
			for (int i = 0, size = maps.size(); i < size; i++) {
				map = maps.get(i);
				bean = clazz.newInstance();
				mapToBean(map, bean);
				list.add(bean);
			}
		}
		return list;
	}
}
