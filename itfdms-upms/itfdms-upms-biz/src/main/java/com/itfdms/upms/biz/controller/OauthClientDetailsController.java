package com.itfdms.upms.biz.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itfdms.common.core.util.Result;
import com.itfdms.common.log.annotation.SysLog;
import com.itfdms.upms.api.entity.SysOauthClientDetails;
import com.itfdms.upms.biz.service.SysOauthClientDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 　　* @description: 前端控制器
 * 　　* @param
 * 　　* @return
 * 　　* @throws
 * 　　* @author lxr
 * 　　* @date 2019/5/15 11:57
 *
 */
@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class OauthClientDetailsController {
    private final SysOauthClientDetailsService sysOauthClientDetailsService;

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysOauthClientDetails
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        return new Result(sysOauthClientDetailsService.getById(id));
    }


    /**
     * 简单分页查询
     *
     * @param page                  分页对象
     * @param sysOauthClientDetails 系统终端
     * @return
     */
    @GetMapping("/page")
    public Result getOauthClientDetailsPage(Page page, SysOauthClientDetails sysOauthClientDetails) {
        return new Result<>(sysOauthClientDetailsService.page(page, Wrappers.query(sysOauthClientDetails)));
    }

    /**
     * 添加
     *
     * @param sysOauthClientDetails 实体
     * @return success/false
     */
    @SysLog("添加终端")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('sys_client_add')")
    public Result add(@Valid @RequestBody SysOauthClientDetails sysOauthClientDetails) {
        return new Result<>(sysOauthClientDetailsService.save(sysOauthClientDetails));
    }

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @SysLog("删除终端")
    @DeleteMapping("/{id}")
    @PreAuthorize("@pms.hasPermission('sys_client_del')")
    public Result removeById(@PathVariable String id) {
        return new Result<>(sysOauthClientDetailsService.removeClientDetailsById(id));
    }

    /**
     * 编辑
     *
     * @param sysOauthClientDetails 实体
     * @return success/false
     */
    @SysLog("编辑终端")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('sys_client_edit')")
    public Result update(@Valid @RequestBody SysOauthClientDetails sysOauthClientDetails) {
        return new Result<>(sysOauthClientDetailsService.updateClientDetailsById(sysOauthClientDetails));
    }
}
