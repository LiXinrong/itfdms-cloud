package com.itfdms.common.core.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lxr
 * @Title: RedisConfigrationProperties
 * @ProjectName itfdms_blog
 * @Description: TODO
 * @date 2018-08-1014:23
 */

@Data
@Component
@ConfigurationProperties(prefix = "myredis")
public class RedisConfigrationProperties {

    private List<String> nodes = new ArrayList<>();
    private String password;
    private Integer maxRedirects;
    private String timeout;
    private String maxIdle;
    private String minIdle;
    private String maxActive;
    private String maxWait;


}
