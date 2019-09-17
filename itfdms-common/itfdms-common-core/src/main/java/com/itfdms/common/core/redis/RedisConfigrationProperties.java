package com.itfdms.common.core.redis;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lxr
 * @Title: RedisConfigrationProperties
 * @ProjectName itfdms_blog
 * @Description: lxr
 * @date 2018-08-1014:23
 */

@Data
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfigrationProperties {

    @Getter
    @Setter
    private List<String> nodes = new ArrayList<>();
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private Integer maxRedirects;
    @Getter
    @Setter
    private String timeout;
    @Getter
    @Setter
    private String maxIdle;
    @Getter
    @Setter
    private String minIdle;
    @Getter
    @Setter
    private String maxActive;
    @Getter
    @Setter
    private String maxWait;


}
