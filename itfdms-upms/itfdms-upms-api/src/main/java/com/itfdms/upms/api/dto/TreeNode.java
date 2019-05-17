package com.itfdms.upms.api.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
　　* @description: TODO
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:30
　　*/
@Data
public class TreeNode {
	protected int id;
	protected int parentId;
	protected List<TreeNode> children = new ArrayList<TreeNode>();

	public void add(TreeNode node) {
		children.add(node);
	}
}
