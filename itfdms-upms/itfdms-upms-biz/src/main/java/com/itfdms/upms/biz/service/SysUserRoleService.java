package com.itfdms.upms.biz.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.itfdms.upms.api.entity.SysUserRole;

/**
　　* @description: 用户角色表 服务类
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:20
　　*/
public interface SysUserRoleService extends IService<SysUserRole> {

	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 * @author 寻欢·李
	 * @date 2017年12月7日 16:31:38
	 */
	Boolean removeRoleByUserId(Integer userId);
}
