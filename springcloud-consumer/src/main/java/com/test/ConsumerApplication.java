package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.rule.MyRuleConfig;

//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name = "provider", configuration = MyRuleConfig.class)

@EnableFeignClients(basePackages = {"com.test"})
@ComponentScan("com.test")

@EnableEurekaClient

@SpringBootApplication
public class ConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
