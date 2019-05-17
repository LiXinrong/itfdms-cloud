package com.itfdms.common.security.annotation;

import com.itfdms.common.security.component.ItfdmsResourceServerAutoConfiguration;
import com.itfdms.common.security.component.ItfdmsSecurityBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.lang.annotation.*;

/**
　　* @description: 资源服务注解
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:46
　　*/
@Documented
@Inherited
@EnableResourceServer
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({ItfdmsResourceServerAutoConfiguration.class, ItfdmsSecurityBeanDefinitionRegistrar.class})
public @interface EnableItfdmsResourceServer {

}
