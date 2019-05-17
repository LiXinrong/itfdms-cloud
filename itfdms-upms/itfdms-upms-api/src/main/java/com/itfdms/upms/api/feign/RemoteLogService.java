package com.itfdms.upms.api.feign;

import com.itfdms.common.core.constant.SecurityConstants;
import com.itfdms.common.core.constant.ServiceNameConstants;
import com.itfdms.common.core.util.Result;
import com.itfdms.upms.api.entity.SysLog;
import com.itfdms.upms.api.feign.factory.RemoteLogServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
　　* @description: TODO
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:38
　　*/
@FeignClient(value = ServiceNameConstants.UMPS_SERVICE, fallbackFactory = RemoteLogServiceFallbackFactory.class)
public interface RemoteLogService {
	/**
	 * 保存日志
	 *
	 * @param sysLog 日志实体
	 * @param from   内部调用标志
	 * @return succes、false
	 */
	@PostMapping("/log")
	Result<Boolean> saveLog(@RequestBody SysLog sysLog, @RequestHeader(SecurityConstants.FROM) String from);
}
