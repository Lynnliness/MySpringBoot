package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration
 * @ComponentScan
 * 开启注解扫描并自动注册相应的注解Bean
 * 
 * @EnableAutoConfiguration
 * 启用默认配置
 * 
 * @author Lynnliness
 * 
 * 注意，该类为SpringBoot的服务启动类
 * 一定，而且必须该启动类的包路径要在所有
 * 需要@ComponentScan扫描的包路径的外面
 *
 */
@Configuration  
@ComponentScan 
@EnableAutoConfiguration
public class ServiceStart {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceStart.class, args);
	}
}
