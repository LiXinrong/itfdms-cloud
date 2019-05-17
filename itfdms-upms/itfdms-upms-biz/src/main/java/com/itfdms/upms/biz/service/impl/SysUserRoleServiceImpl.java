package com.itfdms.upms.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itfdms.upms.api.entity.SysUserRole;
import com.itfdms.upms.biz.mapper.SysUserRoleMapper;
import com.itfdms.upms.biz.service.SysUserRoleService;

/**
　　* @description: 用户角色表 服务实现类
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:21
　　*/
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 * @author 寻欢·李
	 * @date 2017年12月7日 16:31:38
	 */
	@Override
	public Boolean removeRoleByUserId(Integer userId) {
		return baseMapper.deleteByUserId(userId);
	}
}
