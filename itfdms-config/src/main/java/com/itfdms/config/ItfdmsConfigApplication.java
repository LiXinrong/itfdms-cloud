package com.itfdms.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



/**
　　* @description: 配置中心服务
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 16:44
　　*/
@EnableConfigServer
@SpringCloudApplication
public class ItfdmsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItfdmsConfigApplication.class, args);
    }

}
