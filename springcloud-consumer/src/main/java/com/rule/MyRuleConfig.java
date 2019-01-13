package com.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MyRuleConfig {

	@Bean
	public IRule myRule() {
		return new MyRule();// 自定义，每台机器5次
	}

}
