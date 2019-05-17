package com.itfdms.auth;

import com.itfdms.common.security.annotation.EnableItfdmsFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


/**
　　* @description: 认证授权中心
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 10:18
　　*/
@SpringCloudApplication
@EnableItfdmsFeignClients
public class ItfdmsAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItfdmsAuthApplication.class, args);
    }

}
