package com.itfdms.common.core.util;

import com.itfdms.common.core.constant.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
　　* @description:  响应信息主体
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:41
　　*/
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class Result<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private int code = CommonConstants.SUCCESS;

	@Getter
	@Setter
	private String msg = "success";


	@Getter
	@Setter
	private T data;

	public Result() {
		super();
	}

	public Result(T data) {
		super();
		this.data = data;
	}

	public Result(T data, String msg) {
		super();
		this.data = data;
		this.msg = msg;
	}

	public Result(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.code = CommonConstants.FAIL;
	}
}
