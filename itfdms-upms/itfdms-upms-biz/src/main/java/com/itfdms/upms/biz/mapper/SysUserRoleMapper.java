package com.itfdms.upms.biz.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfdms.upms.api.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;

/**
　　* @description: 用户角色表 Mapper 接口
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:08
　　*/
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 * @author 寻欢·李
	 * @date 2017年12月7日 16:31:38
	 */
	Boolean deleteByUserId(@Param("userId") Integer userId);
}
