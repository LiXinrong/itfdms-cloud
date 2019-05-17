package com.itfdms.upms.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
　　* @description: 部门树
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:29
　　*/
@Data
@EqualsAndHashCode(callSuper = true)
public class DeptTree extends TreeNode {
	private String name;
}
