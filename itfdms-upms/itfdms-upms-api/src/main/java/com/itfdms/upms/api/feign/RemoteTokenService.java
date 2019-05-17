package com.itfdms.upms.api.feign;

import com.itfdms.common.core.constant.SecurityConstants;
import com.itfdms.common.core.constant.ServiceNameConstants;
import com.itfdms.common.core.util.Result;
import com.itfdms.upms.api.feign.factory.RemoteTokenServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
　　* @description: TODO
　　* @param 
　　* @return  
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:37 
　　*/
@FeignClient(value = ServiceNameConstants.AUTH_SERVICE, fallbackFactory = RemoteTokenServiceFallbackFactory.class)
public interface RemoteTokenService {
	/**
	 * 分页查询token 信息
	 *
	 * @param params 分页参数
	 * @param from   内部调用标志
	 * @return page
	 */
	@PostMapping("/token/page")
	Result getTokenPage(@RequestBody Map<String, Object> params, @RequestHeader(SecurityConstants.FROM) String from);

	/**
	 * 删除token
	 *
	 * @param token token
	 * @param from  调用标志
	 * @return
	 */
	@DeleteMapping("/token/{token}")
	Result<Boolean> removeToken(@PathVariable("token") String token, @RequestHeader(SecurityConstants.FROM) String from);
}
