package com.itfdms.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itfdms.upms.api.dto.DeptTree;
import com.itfdms.upms.api.entity.SysDept;

import java.util.List;

/**
　　* @description: 部门管理 服务类
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:17
　　*/
public interface SysDeptService extends IService<SysDept> {

	/**
	 * 查询部门树菜单
	 *
	 * @return 树
	 */
	List<DeptTree> listDeptTrees();

	/**
	 * 查询用户部门树
	 *
	 * @return
	 */
	List<DeptTree> listCurrentUserDeptTrees();

	/**
	 * 添加信息部门
	 *
	 * @param sysDept
	 * @return
	 */
	Boolean saveDept(SysDept sysDept);

	/**
	 * 删除部门
	 *
	 * @param id 部门 ID
	 * @return 成功、失败
	 */
	Boolean removeDeptById(Integer id);

	/**
	 * 更新部门
	 *
	 * @param sysDept 部门信息
	 * @return 成功、失败
	 */
	Boolean updateDeptById(SysDept sysDept);

}
