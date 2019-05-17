package com.itfdms.upms.biz.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itfdms.common.core.util.Result;
import com.itfdms.common.security.annotation.Inner;
import com.itfdms.upms.api.entity.SysLog;
import com.itfdms.upms.biz.service.SysLogService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
　　* @description: 日志表 前端控制器
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:53
　　*/
@RestController
@AllArgsConstructor
@RequestMapping("/log")
public class LogController {
	private final SysLogService sysLogService;

	/**
	 * 简单分页查询
	 *
	 * @param page   分页对象
	 * @param sysLog 系统日志
	 * @return
	 */
	@GetMapping("/page")
	public Result getLogPage(Page page, SysLog sysLog) {
		return new Result<>(sysLogService.page(page, Wrappers.query(sysLog)));
	}

	/**
	 * 删除日志
	 *
	 * @param id ID
	 * @return success/false
	 */
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_log_del')")
	public Result removeById(@PathVariable Long id) {
		return new Result<>(sysLogService.removeById(id));
	}

	/**
	 * 插入日志
	 *
	 * @param sysLog 日志实体
	 * @return success/false
	 */
	@Inner
	@PostMapping
	public Result save(@Valid @RequestBody SysLog sysLog) {
		return new Result<>(sysLogService.save(sysLog));
	}

}
