
package com.itfdms.common.core.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
　　* @description: 放行参数配置
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 16:54
　　*/
@Data
@Configuration
@RefreshScope
@ConditionalOnExpression("!'${ignore}'.isEmpty()")
@ConfigurationProperties(prefix = "ignore")
public class FilterIgnorePropertiesConfig {
	/**
	 * 放行终端配置，网关不校验此处的终端
	 */
	@Getter
	@Setter
	private List<String> clients = new ArrayList<>();
	/**
	 * 放行url,放行的url不再被安全框架拦截
	 */
	@Getter
	@Setter
	private List<String> urls = new ArrayList<>();
	/**
	 * 不聚合swagger
	 */
	@Getter
	@Setter
	private List<String> swaggerProviders = new ArrayList<>();
}
