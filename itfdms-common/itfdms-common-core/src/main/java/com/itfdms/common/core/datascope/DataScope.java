package com.itfdms.common.core.datascope;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;

/**
　　* @description: 数据权限查询参数
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:04
　　*/
@Data
@EqualsAndHashCode(callSuper = true)
public class DataScope extends HashMap {
	/**
	 * 限制范围的字段名称
	 */
	private String scopeName = "deptId";

	/**
	 * 具体的数据范围
	 */
	private List<Integer> deptIds;

	/**
	 * 是否只查询本部门
	 */
	private Boolean isOnly = false;
}
