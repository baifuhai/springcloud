package com.test.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyConfig {
	
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	//@Bean
	public IRule iRule() {
//		return new RoundRobinRule();//默认轮询
//		return new RetryRule();//和轮询一样，但如果某一个服务挂了，访问几次后就不再选择他
		return new RandomRule();//随机
	}

}
