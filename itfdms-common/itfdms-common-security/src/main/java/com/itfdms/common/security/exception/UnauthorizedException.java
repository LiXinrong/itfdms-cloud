package com.itfdms.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.itfdms.common.security.component.ItfdmsAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
　　* @description: TODO
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 19:09
　　*/
@JsonSerialize(using = ItfdmsAuth2ExceptionSerializer.class)
public class UnauthorizedException extends ItfdmsAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
