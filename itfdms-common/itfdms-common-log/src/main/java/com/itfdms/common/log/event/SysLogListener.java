package com.itfdms.common.log.event;

import com.itfdms.common.core.constant.SecurityConstants;
import com.itfdms.upms.api.entity.SysLog;
import com.itfdms.upms.api.feign.RemoteLogService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;


/**
　　* @description: 异步监听日志事件
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:22
　　*/
@Slf4j
@AllArgsConstructor
public class SysLogListener {

	private final RemoteLogService remoteLogService;

	@Async
	@Order
	@EventListener(SysLogEvent.class)
	public void saveSysLog(SysLogEvent event) {
		SysLog sysLog = (SysLog) event.getSource();
		remoteLogService.saveLog(sysLog, SecurityConstants.FROM_IN);
	}
}
