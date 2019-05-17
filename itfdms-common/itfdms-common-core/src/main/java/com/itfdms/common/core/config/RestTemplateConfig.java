
package com.itfdms.common.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
　　* @description: RestTemplate
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 16:57
　　*/
@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
