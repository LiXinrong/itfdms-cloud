package com.itfdms.upms.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfdms.upms.api.entity.SysMenu;
import com.itfdms.upms.api.vo.MenuVO;

import java.util.List;

/**
　　* @description: 菜单权限表 Mapper 接口
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:07
　　*/
public interface SysMenuMapper extends BaseMapper<SysMenu> {

	/**
	 * 通过角色编号查询菜单
	 *
	 * @param roleId 角色ID
	 * @return
	 */
	List<MenuVO> listMenusByRoleId(Integer roleId);

	/**
	 * 通过角色ID查询权限
	 *
	 * @param roleIds Ids
	 * @return
	 */
	List<String> listPermissionsByRoleIds(String roleIds);
}
