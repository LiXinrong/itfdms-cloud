package com.itfdms.upms.biz;

import com.itfdms.common.security.annotation.EnableItfdmsFeignClients;
import com.itfdms.common.security.annotation.EnableItfdmsResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
　　* @description: 用户统一管理
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 11:46
　　*/
@EnableItfdmsResourceServer
@EnableItfdmsFeignClients
@SpringCloudApplication
public class ItfdmsUpmsBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItfdmsUpmsBizApplication.class, args);
    }

}
