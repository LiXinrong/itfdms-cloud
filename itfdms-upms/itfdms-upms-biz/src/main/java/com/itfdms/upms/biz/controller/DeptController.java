package com.itfdms.upms.biz.controller;

import com.itfdms.common.core.util.Result;
import com.itfdms.common.log.annotation.SysLog;
import com.itfdms.upms.api.entity.SysDept;
import com.itfdms.upms.biz.service.SysDeptService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.time.LocalDateTime;

/**
　　* @description: 部门管理 前端控制器
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:50
　　*/
@RestController
@AllArgsConstructor
@RequestMapping("/dept")
public class DeptController {
	private final SysDeptService sysDeptService;

	/**
	 * 通过ID查询
	 *
	 * @param id ID
	 * @return SysDept
	 */
	@GetMapping("/{id}")
	public Result getById(@PathVariable Integer id) {
		return new Result<>(sysDeptService.getById(id));
	}


	/**
	 * 返回树形菜单集合
	 *
	 * @return 树形菜单
	 */
	@GetMapping(value = "/tree")
	public Result listDeptTrees() {
		return new Result<>(sysDeptService.listDeptTrees());
	}

	/**
	 * 返回当前用户树形菜单集合
	 *
	 * @return 树形菜单
	 */
	@GetMapping(value = "/user-tree")
	public Result listCurrentUserDeptTrees() {
		return new Result<>(sysDeptService.listCurrentUserDeptTrees());
	}

	/**
	 * 添加
	 *
	 * @param sysDept 实体
	 * @return success/false
	 */
	@SysLog("添加部门")
	@PostMapping
	@PreAuthorize("@pms.hasPermission('sys_dept_add')")
	public Result save(@Valid @RequestBody SysDept sysDept) {
		return new Result<>(sysDeptService.saveDept(sysDept));
	}

	/**
	 * 删除
	 *
	 * @param id ID
	 * @return success/false
	 */
	@SysLog("删除部门")
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_dept_del')")
	public Result removeById(@PathVariable Integer id) {
		return new Result(sysDeptService.removeDeptById(id));
	}

	/**
	 * 编辑
	 *
	 * @param sysDept 实体
	 * @return success/false
	 */
	@SysLog("编辑部门")
	@PutMapping
	@PreAuthorize("@pms.hasPermission('sys_dept_edit')")
	public Result update(@Valid @RequestBody SysDept sysDept) {
		sysDept.setUpdateTime(LocalDateTime.now());
		return new Result<>(sysDeptService.updateDeptById(sysDept));
	}
}
