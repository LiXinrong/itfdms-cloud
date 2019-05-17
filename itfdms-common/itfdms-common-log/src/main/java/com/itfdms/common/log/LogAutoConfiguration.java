package com.itfdms.common.log;

import com.itfdms.common.log.aspect.SysLogAspect;
import com.itfdms.common.log.event.SysLogListener;
import com.itfdms.upms.api.feign.RemoteLogService;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
　　* @description: 日志自动配置
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:11
　　*/
@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
@EnableFeignClients({"com.itfdms.upms.api.feign"})
public class LogAutoConfiguration {
	private final RemoteLogService remoteLogService;

	@Bean
	public SysLogListener sysLogListener() {
		return new SysLogListener(remoteLogService);
	}

	@Bean
	public SysLogAspect sysLogAspect() {
		return new SysLogAspect();
	}
}
