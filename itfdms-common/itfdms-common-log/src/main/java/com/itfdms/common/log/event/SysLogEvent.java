package com.itfdms.common.log.event;

import com.itfdms.upms.api.entity.SysLog;
import org.springframework.context.ApplicationEvent;

/**
　　* @description: 系统日志事件
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:13
　　*/
public class SysLogEvent extends ApplicationEvent {

	public SysLogEvent(SysLog source) {
		super(source);
	}
}
