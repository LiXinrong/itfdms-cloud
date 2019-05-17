package com.itfdms.upms.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfdms.upms.api.entity.SysDeptRelation;

/**
　　* @description: Mapper 接口
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:06
　　*/
public interface SysDeptRelationMapper extends BaseMapper<SysDeptRelation> {
	/**
	 * 删除部门关系表数据
	 *
	 * @param id 部门ID
	 */
	void deleteDeptRelationsById(Integer id);

	/**
	 * 更改部分关系表数据
	 *
	 * @param deptRelation
	 */
	void updateDeptRelations(SysDeptRelation deptRelation);

}
