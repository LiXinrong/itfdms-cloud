package com.itfdms.upms.api.feign.factory;

import com.itfdms.upms.api.feign.RemoteTokenService;
import com.itfdms.upms.api.feign.fallback.RemoteTokenServiceFallbackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
　　* @description: TODO
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:33
　　*/
@Component
public class RemoteTokenServiceFallbackFactory implements FallbackFactory<RemoteTokenService> {

	@Override
	public RemoteTokenService create(Throwable throwable) {
		RemoteTokenServiceFallbackImpl remoteTokenServiceFallback = new RemoteTokenServiceFallbackImpl();
		remoteTokenServiceFallback.setCause(throwable);
		return remoteTokenServiceFallback;
	}
}
