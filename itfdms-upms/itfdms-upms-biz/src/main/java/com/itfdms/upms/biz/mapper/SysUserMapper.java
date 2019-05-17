package com.itfdms.upms.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itfdms.upms.api.dto.UserDTO;
import com.itfdms.upms.api.entity.SysUser;
import com.itfdms.upms.api.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
　　* @description: 用户表 Mapper 接口
　　* @param
　　* @return
 　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:08
　　*/
public interface SysUserMapper extends BaseMapper<SysUser> {
	/**
	 * 通过用户名查询用户信息（含有角色信息）
	 *
	 * @param username 用户名
	 * @return userVo
	 */
	UserVO getUserVoByUsername(String username);

	/**
	 * 分页查询用户信息（含角色）
	 *
	 * @param page    分页
	 * @param userDTO 查询参数
	 * @return list
	 */
	IPage<List<UserVO>> getUserVosPage(Page page, @Param("query") UserDTO userDTO);

	/**
	 * 通过ID查询用户信息
	 *
	 * @param id 用户ID
	 * @return userVo
	 */
	UserVO getUserVoById(Integer id);
}
