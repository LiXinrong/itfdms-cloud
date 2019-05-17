package com.itfdms.upms.api.vo;

import com.itfdms.upms.api.entity.SysLog;
import lombok.Data;

import java.io.Serializable;

/**
　　* @description: TODO
　　* @param 
　　* @return  
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:39 
　　*/
@Data
public class LogVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private SysLog sysLog;
	private String username;
}
