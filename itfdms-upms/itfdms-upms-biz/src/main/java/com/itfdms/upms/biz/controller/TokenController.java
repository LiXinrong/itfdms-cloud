package com.itfdms.upms.biz.controller;

import com.itfdms.common.core.constant.SecurityConstants;
import com.itfdms.common.core.util.Result;
import com.itfdms.upms.api.feign.RemoteTokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 　　* @description:  getTokenPage 管理
 * 　　* @param
 * 　　* @return
 * 　　* @throws
 * 　　* @author lxr
 * 　　* @date 2019/5/15 12:01
 *
 */
@RestController
@AllArgsConstructor
@RequestMapping("/token")
public class TokenController {
    private final RemoteTokenService remoteTokenService;

    /**
     * 分页token 信息
     *
     * @param params 参数集
     * @return token集合
     */
    @GetMapping("/page")
    public Result token(@RequestParam Map<String, Object> params) {
        return remoteTokenService.getTokenPage(params, SecurityConstants.FROM_IN);
    }

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    @PreAuthorize("@pms.hasPermission('sys_token_del')")
    public Result<Boolean> delete(@PathVariable String id) {
        return remoteTokenService.removeToken(id, SecurityConstants.FROM_IN);
    }
}
