docker-compose部署微服务项目：
1：每个微服务需要先配置Dockfile文件，依次构建每个微服务镜像。可采用工具或者命令行形势。
#Dockerfile文件必须在项目根目录下，与pom.xml文件同级
Dockerfile文件内容：
#指定基础镜像，在其上进行定制
FROM anapsix/alpine-java:8_server-jre_unlimited
#维护者信息
MAINTAINER lxr1535509950@gmail.com
#Ubuntu时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
#创建上层目录
RUN mkdir -p /itfdms-eureka
#指定容器目录
WORKDIR /itfdms-eureka
#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 8761
#复制上下文目录下的target/itfdms-eureka.jar 到容器里
ADD /target/itfdms-eureka.jar ./
#指定容器启动程序及参数
CMD java -Djava.security.egd=file:/dev/./urandom -jar itfdms-eureka.jar

2：配置docker-compose.yml文件，
docker-compose 文件内容，
注意image需要和之前构建的微服务镜像名称一致。
version: '3'
services:
  itfdms-eureka:
    image: itfdms-eureka
    restart: always
    ports:
      - 8761:8761

  itfdms-config:
    image: itfdms-config
    restart: always
    ports:
      - 8888:8888
    links:
      - itfdms-eureka
      
      
      
   eureka-server配置：
      #docker-compose部署时候 hostname 换成itfdms-eureka
      eureka:
        client:
          register-with-eureka: false
          fetch-registry: false
          service-url:
            defaultZone: http://${spring.security.user.name}:${spring.security.user.password}@${eureka.instance.hostname}:${server.port}/eureka/
        instance:
          prefer-ip-address: true
          instance-id: ${spring.application.name}:${server.port}:@project.version@
          hostname: ${spring.application.name}
          ip-address: 127.0.0.1
          lease-renewal-interval-in-seconds: 5
          lease-expiration-duration-in-seconds: 15
        server:
          eviction-interval-timer-in-ms: 4000
          enable-self-preservation: false
          renewal-percent-threshold: 0.9

config-server配置：
    #注册中心
    eureka:
      client:
        service-url:
          defaultZone: http://${spring.security.user.name}:${spring.security.user.password}@itfdms-eureka:8761/eureka/
      instance:
        prefer-ip-address: true
        lease-renewal-interval-in-seconds: 5
        lease-expiration-duration-in-seconds: 15