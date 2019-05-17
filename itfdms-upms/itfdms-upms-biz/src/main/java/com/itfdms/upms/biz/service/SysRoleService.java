package com.itfdms.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itfdms.upms.api.entity.SysRole;

import java.util.List;

/**
　　* @description: 服务类
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:19
　　*/
public interface SysRoleService extends IService<SysRole> {

	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> listRolesByUserId(Integer userId);

	/**
	 * 通过角色ID，删除角色
	 *
	 * @param id
	 * @return
	 */
	Boolean removeRoleById(Integer id);
}
