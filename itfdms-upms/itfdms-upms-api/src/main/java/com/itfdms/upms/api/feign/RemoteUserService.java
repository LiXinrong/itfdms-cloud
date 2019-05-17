package com.itfdms.upms.api.feign;

import com.itfdms.common.core.constant.SecurityConstants;
import com.itfdms.common.core.constant.ServiceNameConstants;
import com.itfdms.common.core.util.Result;
import com.itfdms.upms.api.dto.UserInfo;
import com.itfdms.upms.api.feign.factory.RemoteUserServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
　　* @description: TODO
　　* @param 
　　* @return  
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:38 
　　*/
@FeignClient(value = ServiceNameConstants.UMPS_SERVICE, fallbackFactory = RemoteUserServiceFallbackFactory.class)
public interface RemoteUserService {
	/**
	 * 通过用户名查询用户、角色信息
	 *
	 * @param username 用户名
	 * @param from     调用标志
	 * @return Result
	 */
	@GetMapping("/user/info/{username}")
	Result<UserInfo> info(@PathVariable("username") String username
		, @RequestHeader(SecurityConstants.FROM) String from);

	/**
	 * 通过社交账号查询用户、角色信息
	 *
	 * @param inStr appid@code
	 * @return
	 */
	@GetMapping("/social/info/{inStr}")
	Result<UserInfo> social(@PathVariable("inStr") String inStr);
}
