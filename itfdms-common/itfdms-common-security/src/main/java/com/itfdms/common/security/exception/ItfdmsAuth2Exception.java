package com.itfdms.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.itfdms.common.security.component.ItfdmsAuth2ExceptionSerializer;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
　　* @description: 自定义OAuth2Exception
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:37
　　*/
@JsonSerialize(using = ItfdmsAuth2ExceptionSerializer.class)
public class ItfdmsAuth2Exception extends OAuth2Exception {
	@Getter
	private String errorCode;

	public ItfdmsAuth2Exception(String msg) {
		super(msg);
	}

	public ItfdmsAuth2Exception(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}
}
