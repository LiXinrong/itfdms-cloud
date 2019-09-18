#Dockerfile文件必须在项目根目录下，与pom.xml文件同级
#指定基础镜像，在其上进行定制
FROM anapsix/alpine-java:8_server-jre_unlimited

#维护者信息
MAINTAINER lxr1535509950@gmail.com

#Ubuntu时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

#创建上层目录
RUN mkdir -p /itfdms-auth

#指定容器目录
WORKDIR /itfdms-config

#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 3000

#复制上下文目录下的/target/itfdms-auth.jar 到容器里
ADD /target/itfdms-auth.jar ./

#指定容器启动程序及参数
CMD java -Djava.security.egd=file:/dev/./urandom -jar itfdms-auth.jar