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
public class MethodNotAllowed extends ItfdmsAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
