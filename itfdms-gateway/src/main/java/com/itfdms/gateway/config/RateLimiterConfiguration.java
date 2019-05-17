package com.itfdms.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
　　* @description: 路由限流配置
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 10:28
　　*/
@Configuration
public class RateLimiterConfiguration {
	@Bean(value = "remoteAddrKeyResolver")
	public KeyResolver remoteAddrKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
	}
}
