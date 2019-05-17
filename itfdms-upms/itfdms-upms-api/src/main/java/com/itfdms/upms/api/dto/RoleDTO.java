package com.itfdms.upms.api.dto;

import com.itfdms.upms.api.entity.SysRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
　　* @description: 角色Dto
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:30
　　*/
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDTO extends SysRole {
	/**
	 * 角色部门Id
	 */
	private Integer roleDeptId;

	/**
	 * 部门名称
	 */
	private String deptName;
}
