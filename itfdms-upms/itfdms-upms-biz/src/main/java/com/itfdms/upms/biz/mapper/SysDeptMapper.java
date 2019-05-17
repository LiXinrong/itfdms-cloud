package com.itfdms.upms.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itfdms.upms.api.entity.SysDept;

import java.util.List;

/**
　　* @description: 部门管理 Mapper 接口
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:06
　　*/
public interface SysDeptMapper extends BaseMapper<SysDept> {

	/**
	 * 关联dept——relation
	 *
	 * @return 数据列表
	 */
	List<SysDept> listDepts();
}
