package com.itfdms.upms.api.feign.fallback;

import com.itfdms.common.core.util.Result;
import com.itfdms.upms.api.dto.UserInfo;
import com.itfdms.upms.api.feign.RemoteUserService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
　　* @description: TODO
　　* @param 
　　* @return  
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:36 
　　*/
@Slf4j
@Component
public class RemoteUserServiceFallbackImpl implements RemoteUserService {
	@Setter
	private Throwable cause;

	/**
	 * 通过用户名查询用户、角色信息
	 *
	 * @param username 用户名
	 * @param from     内外标志
	 * @return Result
	 */
	@Override
	public Result<UserInfo> info(String username, String from) {
		log.error("feign 查询用户信息失败:{}", username, cause);
		return null;
	}

	/**
	 * 通过社交账号查询用户、角色信息
	 *
	 * @param inStr appid@code
	 * @return
	 */
	@Override
	public Result<UserInfo> social(String inStr) {
		log.error("feign 查询用户信息失败:{}", inStr, cause);
		return null;
	}
}
