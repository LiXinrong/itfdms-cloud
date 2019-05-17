package com.itfdms.upms.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfdms.upms.api.entity.SysRole;

import java.util.List;

/**
　　* @description:  Mapper 接口
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:07
　　*/
public interface SysRoleMapper extends BaseMapper<SysRole> {
	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> listRolesByUserId(Integer userId);
}
