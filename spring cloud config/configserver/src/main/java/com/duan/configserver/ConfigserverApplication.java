package com.duan.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
//https://www.cnblogs.com/zcr3108346262/p/7602314.html
//https://blog.csdn.net/u012167045/article/details/80748647
//https://www.dubby.cn/detail.html?id=9005
//https://www.dubby.cn/detail.html?id=9022
//@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}

