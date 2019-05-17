
package com.itfdms.common.core.exception;

import lombok.NoArgsConstructor;

/**
　　* @description:  403 授权拒绝
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:07
　　*/
@NoArgsConstructor
public class ItfdmsDeniedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ItfdmsDeniedException(String message) {
		super(message);
	}

	public ItfdmsDeniedException(Throwable cause) {
		super(cause);
	}

	public ItfdmsDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ItfdmsDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
