package com.junjay.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启启动eureka，注解肯定是enable+eureka。。。
@EnableEurekaServer // @EnableEurekaServer服务的启动类，可以接收别人注册进来

//在Spring
// boot的启动引导类上增加@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})，阻止Spring
// boot自动注入dataSource
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class EurekaService_7003 {

	public static void main(String[] args) {

		SpringApplication.run(EurekaService_7003.class, args);

	}
}
