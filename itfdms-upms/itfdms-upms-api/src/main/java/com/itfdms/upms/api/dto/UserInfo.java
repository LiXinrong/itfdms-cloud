package com.itfdms.upms.api.dto;

import com.itfdms.upms.api.entity.SysUser;
import lombok.Data;

import java.io.Serializable;

/**
　　* @description: TODO
 * commit('SET_ROLES', data)
 * commit('SET_NAME', data)
 * commit('SET_AVATAR', data)
 * commit('SET_INTRODUCTION', data)
 * commit('SET_PERMISSIONS', data)
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:31
　　*/
@Data
public class UserInfo implements Serializable {
	/**
	 * 用户基本信息
	 */
	private SysUser sysUser;
	/**
	 * 权限标识集合
	 */
	private String[] permissions;

	/**
	 * 角色集合
	 */
	private Integer[] roles;
}
