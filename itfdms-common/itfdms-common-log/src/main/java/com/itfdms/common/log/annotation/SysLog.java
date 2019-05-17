package com.itfdms.common.log.annotation;

import java.lang.annotation.*;

/**
　　* @description: 操作日志注解
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:12
　　*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	/**
	 * 描述
	 *
	 * @return {String}
	 */
	String value();
}
