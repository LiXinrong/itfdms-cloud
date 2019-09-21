package com.itfdms;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
　　* @description: 网关中心
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 10:27
　　*/
@SpringCloudApplication
@EnableEurekaClient
//@ComponentScan(value = {"com.itfdms.common.core.config"})
public class ItfmdsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItfmdsGatewayApplication.class, args);
    }

}
