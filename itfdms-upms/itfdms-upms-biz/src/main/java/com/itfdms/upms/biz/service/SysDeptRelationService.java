package com.itfdms.upms.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itfdms.upms.api.entity.SysDept;
import com.itfdms.upms.api.entity.SysDeptRelation;

/**
　　* @description: 服务类
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:17
　　*/
public interface SysDeptRelationService extends IService<SysDeptRelation> {

	/**
	 * 新建部门关系
	 *
	 * @param sysDept 部门
	 */
	void saveDeptRelation(SysDept sysDept);

	/**
	 * 通过ID删除部门关系
	 *
	 * @param id
	 */
	void removeDeptRelationById(Integer id);

	/**
	 * 更新部门关系
	 *
	 * @param relation
	 */
	void updateDeptRelation(SysDeptRelation relation);
}
