package com.itfdms.common.security.component;

/**
 * 　　* @description: TODO
 * 　　* @param
 * 　　* @return
 * 　　* @throws
 * 　　* @author lxr
 * 　　* @date 2019/5/14 17:44
 *
 */
import cn.hutool.http.HttpStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itfdms.common.core.constant.CommonConstants;
import com.itfdms.common.core.exception.ItfdmsDeniedException;
import com.itfdms.common.core.util.Result;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
　　* @description: 授权拒绝处理器，覆盖默认的OAuth2AccessDeniedHandler
 * 包装失败信息到itfdmsDeniedException
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 10:15
　　*/
@Slf4j
@Component
@AllArgsConstructor
public class ItfdmsAccessDeniedHandler extends OAuth2AccessDeniedHandler {

    private final ObjectMapper objectMapper;

    /**
     * 授权拒绝处理，使用Result包装
     *
     * @param request       request
     * @param response      response
     * @param authException authException
     */
    @Override
    @SneakyThrows
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException) {
        log.info("授权失败，禁止访问 {}", request.getRequestURI());
        response.setCharacterEncoding(CommonConstants.UTF8);
        response.setContentType(CommonConstants.CONTENT_TYPE);
        Result<String> result = new Result<>(new ItfdmsDeniedException("授权失败，禁止访问"));
        response.setStatus(HttpStatus.HTTP_FORBIDDEN);
        PrintWriter printWriter = response.getWriter();
        printWriter.append(objectMapper.writeValueAsString(result));
    }
}
