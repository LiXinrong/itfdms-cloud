package com.itfdms.common.security.annotation;

import java.lang.annotation.*;

/**
　　* @description: 服务调用不鉴权注解
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:39
　　*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Inner {

	/**
	 * 是否AOP统一处理
	 *
	 * @return false, true
	 */
	boolean value() default true;

	/**
	 * 需要特殊判空的字段(预留)
	 *
	 * @return {}
	 */
	String[] field() default {};
}
