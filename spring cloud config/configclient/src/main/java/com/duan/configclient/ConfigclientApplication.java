package com.duan.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@EnableDiscoveryClient
//@RefreshScope
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
	@Value("${sck.user}")
	String sckUser;
	@Value("${sck.password}")
	String sckPassword;

//
//	@RequestMapping("/hello")
//	public String showUserAndPassword(){
//		String sb = "username is " + sckUser + "," + "password is " +sckPassword;
//		return sb;
//	}
}

