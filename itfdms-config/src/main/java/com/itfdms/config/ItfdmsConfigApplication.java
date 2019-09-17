package com.itfdms.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
　　* @description: 配置中心服务
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 16:44
　　*/
@SpringCloudApplication
@EnableConfigServer
@EnableEurekaClient
public class ItfdmsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItfdmsConfigApplication.class, args);
    }

}
